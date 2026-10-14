/**
 * FileService (Frontend - Service Layer)
 * Handles configuration profile files (Avatar profiles, JSON configs).
 */
(function (window) {
  const http = () => window.httpClient;

  const fileService = {
    getFiles() {
      return http().get('/api/files');
    },

    saveFile(payload) {
      if (payload && payload.id) {
        return http().put(`/api/files/${encodeURIComponent(payload.id)}`, payload);
      }
      return http().post('/api/files', payload);
    },

    deleteFile(id) {
      return http().delete(`/api/files/${encodeURIComponent(id)}`);
    },

    switchFile(id) {
      return http().post(`/api/files/${encodeURIComponent(id)}/switch`, {});
    }
  };

  window.fileService = fileService;
})(window);
