/**
 * VerifyOtpForm Component (Presentation Layer - Organisms)
 * Clean OTP verification form coordinating with AuthPage.
 * Submits to window.authService.activate() and logs user in immediately upon success.
 */
(function (window) {
  const { useState, useEffect } = React;

  function VerifyOtpForm({
    sharedEmail = '',
    onLoginSuccess,
    onSwitchMode
  }) {
    const { AuthInput, Icon } = window;

    const [email, setEmail] = useState(sharedEmail);
    const [otp, setOtp] = useState('');
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState(null);
    const [successMsg, setSuccessMsg] = useState(null);
    const [countdown, setCountdown] = useState(60);

    // Countdown interval for Resend OTP
    useEffect(() => {
      if (countdown <= 0) return;
      const timer = setInterval(() => {
        setCountdown((prev) => (prev > 0 ? prev - 1 : 0));
      }, 1000);
      return () => clearInterval(timer);
    }, [countdown]);

    const handleVerify = async (e) => {
      e.preventDefault();
      setError(null);
      setSuccessMsg(null);

      const trimmedOtp = otp.trim();
      if (!trimmedOtp || trimmedOtp.length < 6) {
        setError('Vui lòng nhập đầy đủ mã OTP 6 chữ số!');
        return;
      }
      if (!email.trim()) {
        setError('Vui lòng cung cấp địa chỉ Email!');
        return;
      }

      setLoading(true);
      try {
        const res = await window.authService.activate({
          email: email.trim(),
          otp: trimmedOtp
        });

        if (res && res.success && res.data) {
          onLoginSuccess(res.data.user, res.data.accessToken);
          return;
        }

        setError(res ? res.message : 'Xác thực OTP không thành công!');
      } catch (err) {
        setError(err.message || 'Lỗi kết nối máy chủ!');
      } finally {
        setLoading(false);
      }
    };

    const handleResendOtp = async () => {
      if (countdown > 0 || !email.trim()) return;
      setError(null);
      setSuccessMsg(null);

      try {
        const res = await window.authService.sendOtp({
          email: email.trim(),
          type: 'activate'
        });

        if (res && res.success) {
          setSuccessMsg(res.message || 'Mã OTP mới đã được gửi tới email!');
          setCountdown(60);
        } else {
          setError(res ? res.message : 'Không thể gửi lại mã OTP, vui lòng thử lại sau!');
        }
      } catch (err) {
        setError(err.message || 'Không thể kết nối đến máy chủ!');
      }
    };

    return (
      <form onSubmit={handleVerify} noValidate>
        <button
          type="button"
          className="auth-back-btn"
          onClick={() => onSwitchMode('login')}
        >
          <Icon name="arrow-left" size={16} />
          <span>Quay lại đăng nhập</span>
        </button>

        <h2>Xác thực Email</h2>

        <p className="auth-sub-desc">
          Mã xác thực 6 chữ số đã được gửi tới <strong>{email || 'email của bạn'}</strong>.
        </p>

        {error && (
          <div className="auth-alert auth-alert--error">
            <Icon name="alert-triangle" size={16} />
            <span>{error}</span>
          </div>
        )}

        {successMsg && (
          <div className="auth-alert auth-alert--success">
            <Icon name="check-circle" size={16} />
            <span>{successMsg}</span>
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

        <AuthInput
          name="otp"
          label="Mã xác thực OTP (6 số)"
          value={otp}
          onChange={(e) => setOtp(e.target.value.replace(/[^0-9]/g, '').slice(0, 6))}
          maxLength={6}
          placeholder="Nhập 6 số"
          required
        />


        <button type="submit" className="auth-submit-btn" disabled={loading || otp.length < 6}>
          {loading ? (
            <div className="auth-spinner" />
          ) : (
            <React.Fragment>
              <Icon name="check-circle" size={18} />
              <span>Xác nhận & Vào hệ thống</span>
            </React.Fragment>
          )}
        </button>

        <div className="auth-resend-row">
          <span>Chưa nhận được mã?</span>
          <button
            type="button"
            className="auth-resend-btn"
            disabled={countdown > 0}
            onClick={handleResendOtp}
          >
            {countdown > 0 ? `Gửi lại sau (${countdown}s)` : 'Gửi lại mã OTP'}
          </button>
        </div>
      </form>
    );
  }

  window.VerifyOtpForm = VerifyOtpForm;
})(window);
