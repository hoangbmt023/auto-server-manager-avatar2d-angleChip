/**
 * Password Policy Validator (Domain Layer - Validation)
 * Enforces strong security requirements:
 * - Minimum 8 characters
 * - At least 1 lowercase letter (a-z)
 * - At least 1 uppercase letter (A-Z)
 * - At least 1 digit (0-9)
 * - At least 1 special character (!@#$%^&*...)
 */
function validatePassword(password) {
  if (!password || typeof password !== 'string') {
    return {
      isValid: false,
      message: 'Mật khẩu không được để trống!'
    };
  }

  if (password.length < 8) {
    return {
      isValid: false,
      message: 'Mật khẩu phải có tối thiểu 8 ký tự!'
    };
  }

  if (!/[a-z]/.test(password)) {
    return {
      isValid: false,
      message: 'Mật khẩu phải chứa ít nhất 1 chữ cái thường (a-z)!'
    };
  }

  if (!/[A-Z]/.test(password)) {
    return {
      isValid: false,
      message: 'Mật khẩu phải chứa ít nhất 1 chữ cái viết hoa (A-Z)!'
    };
  }

  if (!/[0-9]/.test(password)) {
    return {
      isValid: false,
      message: 'Mật khẩu phải chứa ít nhất 1 chữ số (0-9)!'
    };
  }

  if (!/[!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?~`]/.test(password)) {
    return {
      isValid: false,
      message: 'Mật khẩu phải chứa ít nhất 1 ký tự đặc biệt (!@#$%^&*...)!'
    };
  }

  return { isValid: true };
}

module.exports = {
  validatePassword
};
