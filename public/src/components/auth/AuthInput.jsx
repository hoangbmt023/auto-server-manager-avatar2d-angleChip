/**
 * AuthInput Component (Presentation Layer)
 * GienPhim & Netflix-style Floating Label Input with Show/Hide Password Toggle.
 */
window.AuthInput = function AuthInput({
  label,
  type = 'text',
  value = '',
  onChange,
  error = '',
  name,
  autoComplete,
  required = false
}) {
  const [focused, setFocused] = React.useState(false);
  const [showPassword, setShowPassword] = React.useState(false);

  const isActive = focused || (value !== undefined && value !== null && String(value).length > 0);
  const isPassword = type === 'password';
  const inputType = isPassword ? (showPassword ? 'text' : 'password') : type;

  return (
    <div className="auth-input-wrapper">
      <div className={`auth-input-container ${error ? 'has-error' : ''}`}>
        <input
          type={inputType}
          className="auth-input"
          value={value}
          onChange={onChange}
          onFocus={() => setFocused(true)}
          onBlur={() => setFocused(false)}
          name={name}
          autoComplete={autoComplete}
          required={required}
        />
        <label className={`auth-label ${isActive ? 'active' : ''}`}>
          {label}
        </label>

        {isPassword && (
          <button
            type="button"
            className="auth-input-password-btn"
            onClick={() => setShowPassword(!showPassword)}
            tabIndex="-1"
            title={showPassword ? 'Ẩn mật khẩu' : 'Hiện mật khẩu'}
          >
            {showPassword ? (
              <svg width="18" height="18" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round">
                <path d="M17.94 17.94A10.07 10.07 0 0 1 12 20c-7 0-11-8-11-8a18.45 18.45 0 0 1 5.06-5.94M9.9 4.24A9.12 9.12 0 0 1 12 4c7 0 11 8 11 8a18.5 18.5 0 0 1-2.16 3.19m-6.72-1.07a3 3 0 1 1-4.24-4.24"></path>
                <line x1="1" y1="1" x2="23" y2="23"></line>
              </svg>
            ) : (
              <svg width="18" height="18" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2" strokeLinecap="round" strokeLinejoin="round">
                <path d="M1 12s4-8 11-8 11 8 11 8-4 8-11 8-11-8-11-8z"></path>
                <circle cx="12" cy="12" r="3"></circle>
              </svg>
            )}
          </button>
        )}
      </div>

      {error && (
        <div className="auth-field-error">
          <svg width="12" height="12" viewBox="0 0 24 24" fill="none" stroke="currentColor" strokeWidth="2.5">
            <circle cx="12" cy="12" r="10"></circle>
            <line x1="12" y1="8" x2="12" y2="12"></line>
            <line x1="12" y1="16" x2="12.01" y2="16"></line>
          </svg>
          <span>{error}</span>
        </div>
      )}
    </div>
  );
};
