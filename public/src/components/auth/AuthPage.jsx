/**
 * AuthPage Component (Presentation Layer)
 * GienPhim & Netflix Cinematic Login/Register Experience.
 * Provides floating-label inputs, field validation, and smooth mode toggling.
 */
window.AuthPage = function AuthPage({ onLoginSuccess }) {
  const [view, setView] = React.useState('LOGIN'); // 'LOGIN' | 'REGISTER'
  const [email, setEmail] = React.useState('');
  const [password, setPassword] = React.useState('');
  const [phone, setPhone] = React.useState('');
  const [rememberMe, setRememberMe] = React.useState(true);
  
  const [loading, setLoading] = React.useState(false);
  const [generalError, setGeneralError] = React.useState('');
  const [fieldErrors, setFieldErrors] = React.useState({});
  const [successMessage, setSuccessMessage] = React.useState('');

  const clearErrors = () => {
    setGeneralError('');
    setFieldErrors({});
    setSuccessMessage('');
  };

  const handleSwitchView = (newView) => {
    clearErrors();
    setView(newView);
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    clearErrors();
    setLoading(true);

    try {
      if (view === 'LOGIN') {
        const res = await window.ApiClient.login(email, password);
        if (res && res.success) {
          setSuccessMessage('Đăng nhập thành công! Đang chuyển hướng...');
          setTimeout(() => {
            if (onLoginSuccess) {
              onLoginSuccess(res.data?.user || window.ApiClient.getCurrentUser());
            }
          }, 400);
        } else {
          setGeneralError(res?.message || 'Đăng nhập không thành công, vui lòng kiểm tra lại!');
          if (res?.errors && typeof res.errors === 'object') {
            setFieldErrors(res.errors);
          }
        }
      } else {
        // REGISTER
        const res = await window.ApiClient.register({
          email,
          password,
          phone: phone || undefined
        });

        if (res && res.success) {
          setSuccessMessage('Đăng ký tài khoản thành công! Đang tự động đăng nhập...');
          setTimeout(() => {
            if (onLoginSuccess) {
              onLoginSuccess(res.data?.user || window.ApiClient.getCurrentUser());
            }
          }, 500);
        } else {
          setGeneralError(res?.message || 'Đăng ký không thành công!');
          if (res?.errors && typeof res.errors === 'object') {
            setFieldErrors(res.errors);
          }
        }
      }
    } catch (err) {
      setGeneralError(err.message || 'Lỗi mạng hoặc máy chủ không phản hồi!');
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="auth-page">
      {/* Background with Dark Vignette */}
      <div className="auth-page__bg" />
      <div className="auth-page__overlay" />

      {/* Top Header */}
      <header className="auth-page__header">
        <div className="auth-page__logo">
          <span className="auth-page__logo-badge">GIENPHIM</span>
          <div className="auth-page__logo-title">
            AVATAR <span>BOT</span>
          </div>
        </div>
      </header>

      {/* Center Auth Card */}
      <main className="auth-container">
        <div className="auth-form-card">
          <h2>{view === 'LOGIN' ? 'Đăng nhập' : 'Đăng ký tài khoản'}</h2>

          {generalError && (
            <div className="auth-alert auth-alert--error">
              <svg width="18" height="18" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2">
                <circle cx="12" cy="12" r="10"></circle>
                <line x1="12" y1="8" x2="12" y2="12"></line>
                <line x1="12" y1="16" x2="12.01" y2="16"></line>
              </svg>
              <span>{generalError}</span>
            </div>
          )}

          {successMessage && (
            <div className="auth-alert auth-alert--success">
              <svg width="18" height="18" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2">
                <path d="M22 11.08V12a10 10 0 1 1-5.93-9.14"></path>
                <polyline points="22 4 12 14.01 9 11.01"></polyline>
              </svg>
              <span>{successMessage}</span>
            </div>
          )}

          <form onSubmit={handleSubmit}>
            <window.AuthInput
              label="Email hoặc tên đăng nhập"
              type="text"
              value={email}
              onChange={(e) => setEmail(e.target.value)}
              error={fieldErrors.email}
              autoComplete="username"
              required
            />

            <window.AuthInput
              label="Mật khẩu"
              type="password"
              value={password}
              onChange={(e) => setPassword(e.target.value)}
              error={fieldErrors.password}
              autoComplete={view === 'LOGIN' ? 'current-password' : 'new-password'}
              required
            />

            {view === 'REGISTER' && (
              <window.AuthInput
                label="Số điện thoại (Không bắt buộc)"
                type="tel"
                value={phone}
                onChange={(e) => setPhone(e.target.value)}
                error={fieldErrors.phone}
                autoComplete="tel"
              />
            )}

            {view === 'LOGIN' && (
              <div className="auth-extra-row">
                <label className="auth-checkbox-label">
                  <input
                    type="checkbox"
                    checked={rememberMe}
                    onChange={(e) => setRememberMe(e.target.checked)}
                  />
                  <span>Ghi nhớ đăng nhập</span>
                </label>
              </div>
            )}

            <button
              type="submit"
              className="auth-submit-btn"
              disabled={loading}
            >
              {loading ? (
                <>
                  <div className="auth-spinner" />
                  <span>Đang xử lý...</span>
                </>
              ) : (
                <span>{view === 'LOGIN' ? 'Đăng nhập' : 'Tạo tài khoản'}</span>
              )}
            </button>
          </form>

          {/* Switch Mode Prompt */}
          <div className="auth-switch-prompt">
            {view === 'LOGIN' ? (
              <>
                Bạn mới sử dụng Avatar Bot?
                <span
                  className="auth-switch-link"
                  onClick={() => handleSwitchView('REGISTER')}
                >
                  Đăng ký ngay.
                </span>
              </>
            ) : (
              <>
                Đã có tài khoản?
                <span
                  className="auth-switch-link"
                  onClick={() => handleSwitchView('LOGIN')}
                >
                  Đăng nhập ngay.
                </span>
              </>
            )}
          </div>
        </div>
      </main>
    </div>
  );
};
