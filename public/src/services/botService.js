/**
 * BotService (Frontend - Service Layer)
 * Controls multi-bot execution, bulk actions, and JRE lifecycle.
 */
(function (window) {
  const http = () => window.httpClient;

  const botService = {
    getStatus() {
      return http().get('/api/status');
    },

    startAllFile() {
      return http().post('/api/start', {});
    },

    stopAll() {
      return http().post('/api/stop', {});
    },

    restartAll() {
      return http().post('/api/restart', {});
    },

    getAvailableJars() {
      return http().get('/api/available-jars');
    },

    uploadJar(file) {
      return http().post('/api/upload-jar', file, {
        headers: {
          'x-filename': encodeURIComponent(file.name),
          'Content-Type': 'application/octet-stream'
        }
      });
    },

    installJre() {
      return http().post('/api/jre/install', {});
    },

    getJreProgress() {
      return http().get('/api/jre/progress');
    }
  };

  window.botService = botService;
})(window);
