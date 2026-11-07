/**
 * AuthPage (Presentation Layer - Pages)
 * Orchestrator container for Authentication, sitting at the same level as DashboardPage.
 * Follows the Dashboard Liquid Glass UI Design System.
 */
(function (window) {
  const { useState, useEffect } = React;

  function AuthPage({ onLoginSuccess }) {
    const {
      LoginForm,
      RegisterForm,
      VerifyOtpForm,
      ForgotPasswordForm,
      VerifyForgotPasswordForm,
      ResetPasswordForm,
      Icon
    } = window;

    const [mode, setMode] = useState('login'); // 'login' | 'register' | 'verify-otp' | 'forgot-password' | 'verify-forgot-password' | 'reset-password'
    const [sharedEmail, setSharedEmail] = useState('');
    const [sharedOtp, setSharedOtp] = useState('');
    const [infoMessage, setInfoMessage] = useState(null);
    const [theme, setTheme] = useState(() => localStorage.getItem('app_theme') || 'dark');

    useEffect(() => {
      document.documentElement.setAttribute('data-theme', theme);
    }, [theme]);

    const toggleTheme = () => {
      const next = theme === 'dark' ? 'light' : 'dark';
      setTheme(next);
      localStorage.setItem('app_theme', next);
      document.documentElement.setAttribute('data-theme', next);
    };

    const handleSwitchMode = (newMode) => {
      setInfoMessage(null);
      setMode(newMode);
    };

    return (
      <div className="auth-page">
        {/* Liquid Glass Background & Mesh Glow */}
        <div className="auth-page__bg" />
        <div className="auth-page__overlay" />

        {/* Top Header */}
        <header className="auth-page__header">
          <div className="auth-page__logo">
            <div className="auth-page__logo-icon">
              <img src="assets/logo.png" className="app-logo-img" alt="AVATAR2D Logo" />
            </div>

            <div className="auth-page__logo-title">
              <span>AVATAR2D</span> AUTO
            </div>
          </div>

          <button
            type="button"
            className="auth-theme-toggle-btn"
            onClick={toggleTheme}
            title={theme === 'dark' ? 'Chuyển sang Giao diện Sáng' : 'Chuyển sang Giao diện Tối'}
            aria-label="Đổi giao diện sáng tối"
          >
            <Icon name={theme === 'dark' ? 'sun' : 'moon'} size={18} />
          </button>
        </header>


        {/* Form Container */}
        <div className="auth-container">
          <div className="auth-form-card">
            {infoMessage && (
              <div className="auth-alert auth-alert--success">
                <Icon name="check-circle" size={16} />
                <span>{infoMessage}</span>
              </div>
            )}

            {mode === 'login' && LoginForm && (
              <LoginForm
                onLoginSuccess={onLoginSuccess}
                onSwitchMode={handleSwitchMode}
                sharedEmail={sharedEmail}
                onSetSharedEmail={setSharedEmail}
                onSetInfoMessage={setInfoMessage}
              />
            )}

            {mode === 'register' && RegisterForm && (
              <RegisterForm
                onSwitchMode={handleSwitchMode}
                sharedEmail={sharedEmail}
                onSetSharedEmail={setSharedEmail}
              />
            )}

            {mode === 'verify-otp' && VerifyOtpForm && (
              <VerifyOtpForm
                sharedEmail={sharedEmail}
                onLoginSuccess={onLoginSuccess}
                onSwitchMode={handleSwitchMode}
              />
            )}

            {mode === 'forgot-password' && ForgotPasswordForm && (
              <ForgotPasswordForm
                sharedEmail={sharedEmail}
                onSetSharedEmail={setSharedEmail}
                onSwitchMode={handleSwitchMode}
                onSetInfoMessage={setInfoMessage}
              />
            )}

            {mode === 'verify-forgot-password' && VerifyForgotPasswordForm && (
              <VerifyForgotPasswordForm
                sharedEmail={sharedEmail}
                onSetSharedOtp={setSharedOtp}
                onSwitchMode={handleSwitchMode}
                onSetInfoMessage={setInfoMessage}
              />
            )}

            {mode === 'reset-password' && ResetPasswordForm && (
              <ResetPasswordForm
                sharedEmail={sharedEmail}
                sharedOtp={sharedOtp}
                onSwitchMode={handleSwitchMode}
                onSetInfoMessage={setInfoMessage}
              />
            )}
          </div>
        </div>
      </div>
    );
  }

  window.AuthPage = AuthPage;
})(window);
