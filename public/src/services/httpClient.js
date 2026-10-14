/**
 * HttpClient (Frontend - Service Layer)
 * Axios HTTP client with:
 * 1. In-memory Access Token storage (RAM ONLY - Zero localStorage token storage).
 * 2. withCredentials: true for native HttpOnly Cookie transmission (Refresh Token).
 * 3. Silent 401 refresh queue retry mechanism.
 */
(function (window) {
  // In-memory token storage (Lives only in RAM)
  let inMemoryAccessToken = null;
  let isRefreshing = false;
  let failedQueue = [];

  const processQueue = (error, token = null) => {
    failedQueue.forEach(prom => {
      if (error) {
        prom.reject(error);
      } else {
        prom.resolve(token);
      }
    });
    failedQueue = [];
  };

  const axiosInstance = (window.axios ? window.axios.create : null) ? window.axios.create({
    baseURL: '',
    timeout: 15000,
    withCredentials: true, // Crucial for sending/receiving HttpOnly cookies
    headers: {
      'Content-Type': 'application/json'
    }
  }) : null;

  if (axiosInstance) {
    // 1. Request Interceptor: Attach in-memory Access Token
    axiosInstance.interceptors.request.use(
      (config) => {
        if (inMemoryAccessToken) {
          config.headers = config.headers || {};
          config.headers['Authorization'] = `Bearer ${inMemoryAccessToken}`;
        }
        return config;
      },
      (error) => Promise.reject(error)
    );

    // 2. Response Interceptor: Unwrap ApiResponse & Handle 401 Silent Refresh
    axiosInstance.interceptors.response.use(
      (response) => {
        return response.data;
      },
      async (error) => {
        const originalRequest = error.config;

        // Bỏ qua nếu lỗi không có response hoặc là request refresh/login/logout
        if (!error.response) {
          return Promise.resolve({
            success: false,
            message: error.message || 'Không thể kết nối đến máy chủ bot!',
            errors: null
          });
        }

        const status = error.response.status;
        const errData = error.response.data || {};

        // 401 Unauthorized handling (Silent Token Refresh)
        const isAuthEndpoint = originalRequest.url && (
          originalRequest.url.includes('/api/auth/login') ||
          originalRequest.url.includes('/api/auth/refresh') ||
          originalRequest.url.includes('/api/auth/register') ||
          originalRequest.url.includes('/api/auth/activate')
        );

        if (status === 401 && !originalRequest._retry && !isAuthEndpoint) {
          if (isRefreshing) {
            return new Promise((resolve, reject) => {
              failedQueue.push({ resolve, reject });
            })
              .then((token) => {
                originalRequest.headers['Authorization'] = `Bearer ${token}`;
                return axiosInstance(originalRequest);
              })
              .catch((err) => Promise.reject(err));
          }

          originalRequest._retry = true;
          isRefreshing = true;

          try {
            // Gọi silent refresh token (cookie HttpOnly được browser tự gửi)
            const refreshRes = await axios.post('/api/auth/refresh', {}, { withCredentials: true });
            const refreshData = refreshRes.data;

            if (refreshData && refreshData.success && refreshData.data && refreshData.data.accessToken) {
              const newToken = refreshData.data.accessToken;
              inMemoryAccessToken = newToken;

              processQueue(null, newToken);

              originalRequest.headers['Authorization'] = `Bearer ${newToken}`;
              return axiosInstance(originalRequest);
            } else {
              throw new Error('Refresh token không hợp lệ');
            }
          } catch (refreshErr) {
            processQueue(refreshErr, null);
            inMemoryAccessToken = null;
            // Dispatch unauthorized event to notify UI
            window.dispatchEvent(new CustomEvent('auth:unauthorized'));
            return Promise.resolve(errData);
          } finally {
            isRefreshing = false;
          }
        }

        // Format validation messages
        if (errData.errors && typeof errData.errors === 'object') {
          const fieldMsgs = Object.values(errData.errors);
          if (fieldMsgs.length > 0 && (!errData.message || errData.message === 'Không hợp lệ')) {
            errData.message = fieldMsgs.join('; ');
          }
        }

        return Promise.resolve(errData);
      }
    );
  }

  // Token management in RAM
  const tokenManager = {
    getAccessToken() {
      return inMemoryAccessToken;
    },
    setAccessToken(token) {
      inMemoryAccessToken = token || null;
    },
    clearAccessToken() {
      inMemoryAccessToken = null;
    }
  };

  window.httpClient = axiosInstance;
  window.tokenManager = tokenManager;
})(window);
