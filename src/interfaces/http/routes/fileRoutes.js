const Router = require('../Router');

/**
 * File & JAR Profiles Management Routes
 */
module.exports = function createFileRoutes(fileController) {
  const router = new Router();

  // 1. Standard RESTful routes
  router.get('/api/files', (req, res, { sendJson }) => {
    return fileController.getFiles(req, res, sendJson);
  });

  router.post('/api/files', (req, res, { sendJson, parseJsonBody }) => {
    return fileController.saveFile(req, res, sendJson, parseJsonBody);
  });

  router.put('/api/files/:id', (req, res, { sendJson, parseJsonBody }) => {
    return fileController.saveFile(req, res, sendJson, parseJsonBody);
  });

  router.delete('/api/files/:id', (req, res, { sendJson, parseJsonBody }) => {
    return fileController.deleteFile(req, res, sendJson, parseJsonBody);
  });

  router.delete('/api/files', (req, res, { sendJson, parseJsonBody }) => {
    return fileController.deleteFile(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/files/:id/activate', (req, res, { sendJson, parseJsonBody }) => {
    return fileController.switchFile(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/files/:id/switch', (req, res, { sendJson, parseJsonBody }) => {
    return fileController.switchFile(req, res, sendJson, parseJsonBody);
  });

  // 2. Backward-compatible aliases
  router.post('/api/files/delete', (req, res, { sendJson, parseJsonBody }) => {
    return fileController.deleteFile(req, res, sendJson, parseJsonBody);
  });

  router.post('/api/files/switch', (req, res, { sendJson, parseJsonBody }) => {
    return fileController.switchFile(req, res, sendJson, parseJsonBody);
  });

  // 3. Jars routes
  router.get('/api/available-jars', (req, res, { sendJson }) => {
    return fileController.getAvailableJars(req, res, sendJson);
  });

  router.post('/api/upload-jar', (req, res, { sendJson }) => {
    return fileController.uploadJar(req, res, sendJson);
  });

  return router;
};

