/**
 * ForgotPasswordForm Component (Presentation Layer - Organisms)
 * Clean password recovery form coordinating with AuthPage.
 * Automatically transitions to VerifyOtpForm if the account is not yet activated.
 */
(function (window) {
  const { useState } = React;

  function ForgotPasswordForm({
    sharedEmail = '',
    onSetSharedEmail,
    onSwitchMode,
    onSetInfoMessage
  }) {
    const { AuthInput, Icon } = window;

    const [email, setEmail] = useState(sharedEmail);
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState(null);

    const handleSubmit = async (e) => {
      e.preventDefault();
      setError(null);

      const trimmed = email.trim();
      if (!trimmed || !trimmed.includes('@')) {
        setError('Vui lòng nhập địa chỉ Email hợp lệ!');
        return;
      }

      setLoading(true);
      try {
        const res = await window.authService.forgotPassword({ email: trimmed });

        if (res && res.success) {
          if (onSetSharedEmail) onSetSharedEmail(trimmed);
          if (onSetInfoMessage) {
            onSetInfoMessage('Mã OTP khôi phục đã được gửi tới email của bạn. Vui lòng kiểm tra hộp thư!');
          }
          onSwitchMode('verify-forgot-password');
          return;
        }

        setError(res ? res.message : 'Không tìm thấy tài khoản hoặc lỗi gửi email!');
      } catch (err) {
        setError(err.message || 'Lỗi kết nối máy chủ!');
      } finally {
        setLoading(false);
      }
    };

    return (
      <form onSubmit={handleSubmit} noValidate>
        <button
          type="button"
          className="auth-back-btn"
          onClick={() => onSwitchMode('login')}
        >
          <Icon name="arrow-left" size={16} />
          <span>Quay lại đăng nhập</span>
        </button>

        <h2>Quên mật khẩu</h2>

        <p className="auth-sub-desc">
          Nhập địa chỉ email liên kết với tài khoản của bạn để nhận mã OTP khôi phục mật khẩu.
        </p>

        {error && (
          <div className="auth-alert auth-alert--error">
            <Icon name="alert-triangle" size={16} />
            <span>{error}</span>
          </div>
        )}

        <AuthInput
          type="email"
          name="email"
          label="Địa chỉ Email"
          placeholder="name@example.com"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          required
        />

        <button type="submit" className="auth-submit-btn" disabled={loading}>
          {loading ? (
            <div className="auth-spinner" />
          ) : (
            <React.Fragment>
              <Icon name="send" size={18} />
              <span>Gửi mã khôi phục</span>
            </React.Fragment>
          )}
        </button>
      </form>
    );
  }

  window.ForgotPasswordForm = ForgotPasswordForm;
})(window);
