/**
 * AuthService (Frontend - Service Layer)
 * Manages user authentication, OTP verification, password resets,
 * and profile retrieval. Access tokens are stored strictly in RAM.
 */
(function (window) {
  const http = () => window.httpClient;
  const tm = () => window.tokenManager;

  const authService = {
    /**
     * Authenticates user with credentials
     * @param {{ email?: string, phone?: string, password: string }} credentials
     */
    async login(credentials) {
      const res = await http().post('/api/auth/login', credentials);
      if (res && res.success && res.data && res.data.accessToken) {
        tm().setAccessToken(res.data.accessToken);
      }
      return res;
    },

    /**
     * Registers a new user account (Triggers OTP verification requirement)
     * @param {{ email: string, password: string, phone?: string }} payload
     */
    async register(payload) {
      return await http().post('/api/auth/register', payload);
    },

    /**
     * Sends or resends OTP code to email
     * @param {{ email: string, type: 'activate' | 'forgot_password' }} payload
     */
    async sendOtp(payload) {
      return await http().post('/api/auth/send-otp', payload);
    },

    /**
     * Activates account using 6-digit OTP code
     * @param {{ email: string, otp: string }} payload
     */
    async activate(payload) {
      const res = await http().post('/api/auth/activate', payload);
      if (res && res.success && res.data && res.data.accessToken) {
        tm().setAccessToken(res.data.accessToken);
      }
      return res;
    },

    /**
     * Requests new Access Token using HttpOnly Refresh Token Cookie
     */
    async refresh() {
      const res = await http().post('/api/auth/refresh', {});
      if (res && res.success && res.data && res.data.accessToken) {
        tm().setAccessToken(res.data.accessToken);
      }
      return res;
    },

    /**
     * Logs out user, invalidating cookie on backend and clearing RAM token
     */
    async logout() {
      try {
        await http().post('/api/auth/logout', {});
      } finally {
        tm().clearAccessToken();
      }
    },

    /**
     * Requests OTP code for password reset
     * @param {{ email: string }} payload
     */
    async forgotPassword(payload) {
      return await http().post('/api/auth/forgot-password', payload);
    },

    /**
     * Verifies OTP for forgot password without consuming the OTP
     * @param {{ email: string, otp: string }} payload
     */
    async verifyForgotPassword(payload) {
      return await http().post('/api/auth/verify-forgot-password', payload);
    },

    /**
     * Resets password using valid OTP code
     * @param {{ email: string, otp: string, newPassword: string }} payload
     */
    async resetPassword(payload) {
      return await http().post('/api/auth/reset-password', payload);
    },

    /**
     * Retrieves current logged in user profile
     */
    async getMe() {
      return await http().get('/api/auth/me');
    },

    /**
     * Retrieves all registered users (Admin only)
     */
    async getUsers() {
      return await http().get('/api/users');
    }
  };

  window.authService = authService;
})(window);
