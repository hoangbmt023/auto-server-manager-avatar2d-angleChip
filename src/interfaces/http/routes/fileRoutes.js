const Router = require('../Router');
const { requireRole } = require('../middlewares/roleMiddleware');

/**
 * File & JAR Profiles Management Routes (Admin Only)
 */
module.exports = function createFileRoutes(fileController) {
  const router = new Router();
  const adminOnly = requireRole('ADMIN');

  // 1. Standard RESTful routes
  router.get('/api/files', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return fileController.getFiles(req, res, helpers.sendJson);
  });

  router.post('/api/files', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return fileController.saveFile(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.put('/api/files/:id', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return fileController.saveFile(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.delete('/api/files/:id', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return fileController.deleteFile(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.delete('/api/files', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return fileController.deleteFile(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.post('/api/files/:id/activate', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return fileController.switchFile(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.post('/api/files/:id/switch', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return fileController.switchFile(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  // 2. Backward-compatible aliases
  router.post('/api/files/delete', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return fileController.deleteFile(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  router.post('/api/files/switch', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return fileController.switchFile(req, res, helpers.sendJson, helpers.parseJsonBody);
  });

  // 3. Jars routes
  router.get('/api/available-jars', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return fileController.getAvailableJars(req, res, helpers.sendJson);
  });

  router.post('/api/upload-jar', (req, res, helpers) => {
    if (!adminOnly(req, res, helpers)) return;
    return fileController.uploadJar(req, res, helpers.sendJson);
  });

  return router;
};

