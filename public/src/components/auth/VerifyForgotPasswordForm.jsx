/**
 * VerifyForgotPasswordForm Component (Presentation Layer - Organisms)
 * Step 2 of Password Recovery: Verifies the 6-digit OTP code before proceeding
 * to setting the new password. The OTP is NOT consumed at this step.
 */
(function (window) {
  const { useState, useEffect } = React;

  function VerifyForgotPasswordForm({
    sharedEmail = '',
    onSetSharedOtp,
    onSwitchMode,
    onSetInfoMessage
  }) {
    const { AuthInput, Icon } = window;

    const [email] = useState(sharedEmail);
    const [otp, setOtp] = useState('');
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState(null);
    const [countdown, setCountdown] = useState(60);
    const [resending, setResending] = useState(false);
    const [resendMsg, setResendMsg] = useState(null);

    // Countdown interval for resending OTP
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

      const trimmedOtp = otp.trim();
      if (!trimmedOtp || trimmedOtp.length < 6) {
        setError('Vui lòng nhập đầy đủ mã OTP 6 chữ số!');
        return;
      }
      if (!email) {
        setError('Không tìm thấy thông tin email. Vui lòng quay lại bước 1!');
        return;
      }

      setLoading(true);
      try {
        const res = await window.authService.verifyForgotPassword({
          email: email.trim(),
          otp: trimmedOtp
        });

        if (res && res.success) {
          if (onSetSharedOtp) onSetSharedOtp(trimmedOtp);
          onSwitchMode('reset-password');
          return;
        }

        setError(res ? res.message : 'Mã OTP không hợp lệ!');
      } catch (err) {
        setError(err.message || 'Mã OTP không hợp lệ hoặc đã hết hạn!');
      } finally {
        setLoading(false);
      }
    };

    const handleResendOtp = async () => {
      if (countdown > 0 || resending || !email) return;
      setResending(true);
      setError(null);
      setResendMsg(null);

      try {
        const res = await window.authService.forgotPassword({ email: email.trim() });
        if (res && res.success) {
          setResendMsg('Đã gửi lại mã OTP mới qua hộp thư Gmail!');
          setCountdown(60);
        } else {
          setError(res ? res.message : 'Không thể gửi lại mã OTP!');
        }
      } catch (err) {
        setError(err.message || 'Không thể gửi lại mã OTP!');
      } finally {
        setResending(false);
      }
    };

    return (
      <form onSubmit={handleVerify} noValidate>
        <button
          type="button"
          className="auth-back-btn"
          onClick={() => onSwitchMode('forgot-password')}
        >
          <Icon name="arrow-left" size={16} />
          <span>Quay lại nhập Email</span>
        </button>

        <h2>Xác thực mã OTP</h2>

        <p className="auth-sub-desc">
          Mã xác thực 6 số đã được gửi đến <strong>{email}</strong>. Vui lòng nhập mã để tiếp tục.
        </p>

        {resendMsg && (
          <div className="auth-alert auth-alert--success">
            <Icon name="check-circle" size={16} />
            <span>{resendMsg}</span>
          </div>
        )}

        {error && (
          <div className="auth-alert auth-alert--error">
            <Icon name="alert-triangle" size={16} />
            <span>{error}</span>
          </div>
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

        <div className="auth-resend-wrapper" style={{ marginTop: '4px', marginBottom: '18px', textAlign: 'center' }}>
          {countdown > 0 ? (
            <span style={{ fontSize: '13px', color: 'var(--text-tertiary)' }}>
              Gửi lại mã sau <strong>{countdown}s</strong>
            </span>
          ) : (
            <button
              type="button"
              className="auth-link-btn"
              onClick={handleResendOtp}
              disabled={resending}
              style={{
                background: 'none',
                border: 'none',
                color: 'var(--apple-blue)',
                cursor: 'pointer',
                fontSize: '13px',
                fontWeight: 600,
                padding: '4px 8px'
              }}
            >
              {resending ? 'Đang gửi lại...' : 'Gửi lại mã OTP'}
            </button>
          )}
        </div>

        <button type="submit" className="auth-submit-btn" disabled={loading || otp.length < 6}>
          {loading ? (
            <div className="auth-spinner" />
          ) : (
            <React.Fragment>
              <Icon name="shield-check" size={18} />
              <span>Tiếp tục đặt mật khẩu</span>
            </React.Fragment>
          )}
        </button>
      </form>
    );
  }

  window.VerifyForgotPasswordForm = VerifyForgotPasswordForm;
})(window);
