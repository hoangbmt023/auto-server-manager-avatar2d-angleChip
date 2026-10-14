/**
 * AuthInput Component (Presentation Layer - Atoms)
 * Modern floating label input with vector toggle icons.
 * Follows Dashboard Apple Liquid Glass Design System.
 */
(function (window) {
  const { useState, useId } = React;

  function AuthInput({
    type = 'text',
    name,
    label,
    value,
    onChange,
    required = false,
    autoComplete = 'off',
    error = null,
    maxLength = undefined,
    className = '',
    inputClassName = '',
    placeholder = ''
  }) {
    const { Icon } = window;
    const id = useId();
    const [focused, setFocused] = useState(false);
    const [showPassword, setShowPassword] = useState(false);

    const isPassword = type === 'password';
    const active = focused || (value !== undefined && value !== null && String(value).length > 0);
    const actualType = isPassword ? (showPassword ? 'text' : 'password') : type;

    return (
      <div className={`auth-input-wrapper ${className}`}>
        <div className={`auth-input-container ${error ? 'has-error' : ''}`}>
          <input
            id={id}
            name={name}
            type={actualType}
            className={`auth-input ${inputClassName}`}
            value={value}
            onChange={onChange}
            onFocus={() => setFocused(true)}
            onBlur={() => setFocused(false)}
            required={required}
            autoComplete={autoComplete}
            maxLength={maxLength}
            placeholder={focused && !value ? placeholder : ''}
          />
          <label htmlFor={id} className={`auth-label ${active ? 'active' : ''}`}>
            {label}
          </label>

          {isPassword && (
            <button
              type="button"
              className="auth-input-password-btn"
              onClick={() => setShowPassword(!showPassword)}
              tabIndex={-1}
              aria-label={showPassword ? 'Ẩn mật khẩu' : 'Hiện mật khẩu'}
            >
              <Icon name={showPassword ? 'eye-off' : 'eye'} size={18} />
            </button>
          )}
        </div>

        {error && (
          <div className="auth-field-error">
            <Icon name="alert-triangle" size={13} color="var(--apple-orange)" />
            <span>{error}</span>
          </div>
        )}
      </div>
    );
  }

  window.AuthInput = AuthInput;
})(window);
