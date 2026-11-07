/**
 * ResetPasswordForm Component (Presentation Layer - Organisms)
 * Clean reset password form coordinating with AuthPage.
 * Submits valid OTP + New Password to window.authService.resetPassword().
 */
(function (window) {
  const { useState } = React;

  function ResetPasswordForm({
    sharedEmail = '',
    sharedOtp = '',
    onSwitchMode,
    onSetInfoMessage
  }) {
    const { AuthInput, Icon } = window;

    const [email, setEmail] = useState(sharedEmail);
    const [otp, setOtp] = useState(sharedOtp);
    const [newPassword, setNewPassword] = useState('');
    const [confirmPassword, setConfirmPassword] = useState('');
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState(null);

    const effectiveOtp = (sharedOtp || otp).trim();

    const handleSubmit = async (e) => {
      e.preventDefault();
      setError(null);

      if (!effectiveOtp || effectiveOtp.length < 6) {
        setError('Thiếu mã xác thực OTP. Vui lòng quay lại bước xác thực!');
        return;
      }

      // Strong password policy validation
      if (!newPassword || newPassword.length < 8) {
        setError('Mật khẩu mới phải có tối thiểu 8 ký tự!');
        return;
      }
      if (!/[a-z]/.test(newPassword)) {
        setError('Mật khẩu mới phải có ít nhất 1 chữ thường (a-z)!');
        return;
      }
      if (!/[A-Z]/.test(newPassword)) {
        setError('Mật khẩu mới phải có ít nhất 1 chữ hoa (A-Z)!');
        return;
      }
      if (!/[0-9]/.test(newPassword)) {
        setError('Mật khẩu mới phải có ít nhất 1 chữ số (0-9)!');
        return;
      }
      if (!/[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?~`]/.test(newPassword)) {
        setError('Mật khẩu mới phải có ít nhất 1 ký tự đặc biệt (!@#$%^&*...)!');
        return;
      }

      if (newPassword !== confirmPassword) {
        setError('Mật khẩu xác nhận không khớp!');
        return;
      }

      setLoading(true);
      try {
        const res = await window.authService.resetPassword({
          email: email.trim(),
          otp: effectiveOtp,
          newPassword
        });

        if (res && res.success) {
          if (onSetInfoMessage) {
            onSetInfoMessage('Đặt lại mật khẩu thành công! Vui lòng đăng nhập bằng mật khẩu mới.');
          }
          onSwitchMode('login');
          return;
        }

        setError(res ? res.message : 'Đặt lại mật khẩu thất bại!');
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
          onClick={() => onSwitchMode(sharedOtp ? 'verify-forgot-password' : 'login')}
        >
          <Icon name="arrow-left" size={16} />
          <span>Quay lại</span>
        </button>

        <h2>Tạo mật khẩu mới</h2>

        <p className="auth-sub-desc">
          Thiết lập mật khẩu bảo mật mới cho tài khoản <strong>{email}</strong>.
        </p>

        {error && (
          <div className="auth-alert auth-alert--error">
            <Icon name="alert-triangle" size={16} />
            <span>{error}</span>
          </div>
        )}

        {!sharedEmail && (
          <AuthInput
            type="email"
            name="email"
            label="Địa chỉ Email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
            required
          />
        )}

        {!sharedOtp && (
          <AuthInput
            name="otp"
            label="Mã xác thực OTP (6 số)"
            value={otp}
            onChange={(e) => setOtp(e.target.value.replace(/[^0-9]/g, '').slice(0, 6))}
            maxLength={6}
            placeholder="Nhập 6 số"
            required
          />
        )}

        <AuthInput
          type="password"
          name="newPassword"
          label="Mật khẩu mới"
          placeholder="Tối thiểu 8 ký tự (hoa, thường, số, ký tự đặc biệt)"
          value={newPassword}
          onChange={(e) => setNewPassword(e.target.value)}
          required
        />

        <AuthInput
          type="password"
          name="confirmPassword"
          label="Xác nhận mật khẩu mới"
          placeholder="Nhập lại mật khẩu vừa đặt"
          value={confirmPassword}
          onChange={(e) => setConfirmPassword(e.target.value)}
          required
        />

        <button type="submit" className="auth-submit-btn" disabled={loading || !newPassword}>
          {loading ? (
            <div className="auth-spinner" />
          ) : (
            <React.Fragment>
              <Icon name="check-circle" size={18} />
              <span>Cập nhật mật khẩu mới</span>
            </React.Fragment>
          )}
        </button>
      </form>
    );
  }

  window.ResetPasswordForm = ResetPasswordForm;
})(window);
