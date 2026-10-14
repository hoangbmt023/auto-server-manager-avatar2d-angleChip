/**
 * LoginForm Component (Presentation Layer - Organisms)
 * Clean form coordinating with AuthPage.
 * Automatically switches to VerifyOtpForm if valid credentials are provided for an unactivated account.
 */
(function (window) {
  const { useState } = React;

  function LoginForm({
    onLoginSuccess,
    onSwitchMode,
    sharedEmail = '',
    onSetSharedEmail,
    onSetInfoMessage
  }) {
    const { AuthInput, Icon } = window;

    const [identifier, setIdentifier] = useState(sharedEmail);
    const [password, setPassword] = useState('');
    const [remember, setRemember] = useState(true);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState(null);

    const handleSubmit = async (e) => {
      e.preventDefault();
      setError(null);

      const trimmed = identifier.trim();
      if (!trimmed) {
        setError('Vui lòng nhập Email hoặc Số điện thoại!');
        return;
      }
      if (!password) {
        setError('Vui lòng nhập mật khẩu!');
        return;
      }

      setLoading(true);
      try {
        const payload = trimmed.includes('@')
          ? { email: trimmed, password, remember }
          : { phone: trimmed, password, remember };

        const res = await window.authService.login(payload);

        // 1. Success Login
        if (res && res.success && res.data && res.data.accessToken) {
          onLoginSuccess(res.data.user, res.data.accessToken);
          return;
        }

        // 2. Unactivated Account with Correct Password -> Open Activation / OTP Form
        const isRequireOtp = res && (
          (res.data && res.data.requireOtp) ||
          res.requiresAuth ||
          (res.message && res.message.toLowerCase().includes('kích hoạt'))
        );

        if (isRequireOtp) {
          const emailToUse = (res.data && res.data.email) || (trimmed.includes('@') ? trimmed : '');
          if (onSetSharedEmail && emailToUse) onSetSharedEmail(emailToUse);
          if (onSetInfoMessage) {
            onSetInfoMessage('Tài khoản chưa kích hoạt! Mã OTP mới đã được gửi tới email của bạn.');
          }
          onSwitchMode('verify-otp');
          return;
        }

        setError(res ? res.message : 'Tài khoản hoặc mật khẩu không chính xác!');
      } catch (err) {
        // If error response indicates requireOtp
        if (err.data && err.data.requireOtp) {
          const emailToUse = err.data.email || (trimmed.includes('@') ? trimmed : '');
          if (onSetSharedEmail && emailToUse) onSetSharedEmail(emailToUse);
          if (onSetInfoMessage) {
            onSetInfoMessage('Tài khoản chưa kích hoạt! Mã OTP mới đã được gửi tới email của bạn.');
          }
          onSwitchMode('verify-otp');
          return;
        }
        setError(err.message || 'Lỗi hệ thống hoặc kết nối máy chủ!');
      } finally {
        setLoading(false);
      }
    };

    return (
      <form onSubmit={handleSubmit} noValidate>
        <h2>Đăng nhập</h2>

        {error && (
          <div className="auth-alert auth-alert--error">
            <Icon name="alert-triangle" size={16} />
            <span>{error}</span>
          </div>
        )}

        <AuthInput
          name="identifier"
          label="Email hoặc số điện thoại"
          value={identifier}
          onChange={(e) => setIdentifier(e.target.value)}
          required
        />

        <AuthInput
          type="password"
          name="password"
          label="Mật khẩu"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          required
        />

        <button type="submit" className="auth-submit-btn" disabled={loading}>
          {loading ? (
            <div className="auth-spinner" />
          ) : (
            <React.Fragment>
              <Icon name="log-in" size={18} />
              <span>Đăng nhập</span>
            </React.Fragment>
          )}
        </button>

        <div className="auth-extra-row">
          <label className="auth-checkbox-label">
            <input
              type="checkbox"
              checked={remember}
              onChange={(e) => setRemember(e.target.checked)}
            />
            <span>Ghi nhớ đăng nhập</span>
          </label>
          <button
            type="button"
            className="auth-forgot-btn"
            onClick={() => {
              if (onSetSharedEmail && identifier.includes('@')) onSetSharedEmail(identifier.trim());
              onSwitchMode('forgot-password');
            }}
          >
            Quên mật khẩu?
          </button>
        </div>

        <div className="auth-switch-prompt">
          <span>Bạn mới sử dụng hệ thống?</span>
          <a
            href="#register"
            className="auth-switch-link"
            onClick={(e) => {
              e.preventDefault();
              if (onSetSharedEmail && identifier.includes('@')) onSetSharedEmail(identifier.trim());
              onSwitchMode('register');
            }}
          >
            Đăng ký ngay.
          </a>
        </div>
      </form>
    );
  }

  window.LoginForm = LoginForm;
})(window);
