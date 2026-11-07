/**
 * RegisterForm Component (Presentation Layer - Organisms)
 * Clean registration form coordinating with AuthPage.
 * Triggers Email OTP verification on success.
 */
(function (window) {
  const { useState } = React;

  function RegisterForm({
    onSwitchMode,
    sharedEmail = '',
    onSetSharedEmail
  }) {
    const { AuthInput, Icon } = window;

    const [email, setEmail] = useState(sharedEmail);
    const [phone, setPhone] = useState('');
    const [password, setPassword] = useState('');
    const [confirmPassword, setConfirmPassword] = useState('');
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState(null);

    const handleSubmit = async (e) => {
      e.preventDefault();
      setError(null);

      const trimmedEmail = email.trim();
      if (!trimmedEmail) {
        setError('Vui lòng nhập địa chỉ Email!');
        return;
      }
      if (!trimmedEmail.includes('@')) {
        setError('Định dạng Email không hợp lệ!');
        return;
      }
      if (!password || password.length < 8) {
        setError('Mật khẩu phải có độ dài tối thiểu 8 ký tự!');
        return;
      }
      if (!/[a-z]/.test(password)) {
        setError('Mật khẩu phải chứa ít nhất 1 chữ thường (a-z)!');
        return;
      }
      if (!/[A-Z]/.test(password)) {
        setError('Mật khẩu phải chứa ít nhất 1 chữ hoa (A-Z)!');
        return;
      }
      if (!/[0-9]/.test(password)) {
        setError('Mật khẩu phải chứa ít nhất 1 chữ số (0-9)!');
        return;
      }
      if (!/[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?~`]/.test(password)) {
        setError('Mật khẩu phải chứa ít nhất 1 ký tự đặc biệt (!@#$%^&*...)!');
        return;
      }
      if (password !== confirmPassword) {
        setError('Mật khẩu xác nhận không khớp!');
        return;
      }

      setLoading(true);
      try {
        const payload = {
          email: trimmedEmail,
          password,
          phone: phone.trim() || undefined
        };

        const res = await window.authService.register(payload);

        if (res && res.success) {
          if (onSetSharedEmail) onSetSharedEmail(trimmedEmail);
          onSwitchMode('verify-otp');
          return;
        }

        setError(res ? res.message : 'Đăng ký thất bại, vui lòng thử lại!');
      } catch (err) {
        setError(err.message || 'Lỗi hệ thống hoặc kết nối máy chủ!');
      } finally {
        setLoading(false);
      }
    };

    return (
      <form onSubmit={handleSubmit} noValidate>
        <h2>Đăng ký tài khoản</h2>

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

        <AuthInput
          type="tel"
          name="phone"
          label="Số điện thoại"
          placeholder="Ví dụ: 09******21"
          value={phone}
          onChange={(e) => setPhone(e.target.value)}
        />

        <AuthInput
          type="password"
          name="password"
          label="Mật khẩu"
          placeholder="Tối thiểu 8 ký tự (hoa, thường, số, ký tự đặc biệt)"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          required
        />

        <AuthInput
          type="password"
          name="confirmPassword"
          label="Xác nhận mật khẩu"
          placeholder="Nhập lại mật khẩu vừa đặt"
          value={confirmPassword}
          onChange={(e) => setConfirmPassword(e.target.value)}
          required
        />

        <button type="submit" className="auth-submit-btn" disabled={loading}>
          {loading ? (
            <div className="auth-spinner" />
          ) : (
            <React.Fragment>
              <Icon name="sparkles" size={18} />
              <span>Tạo tài khoản</span>
            </React.Fragment>
          )}
        </button>

        <div className="auth-switch-prompt">
          <span>Bạn đã có tài khoản?</span>
          <a
            href="#login"
            className="auth-switch-link"
            onClick={(e) => {
              e.preventDefault();
              if (onSetSharedEmail && email) onSetSharedEmail(email.trim());
              onSwitchMode('login');
            }}
          >
            Đăng nhập ngay.
          </a>
        </div>
      </form>
    );
  }

  window.RegisterForm = RegisterForm;
})(window);
