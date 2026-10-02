/**
 * Server Entrypoint (Clean Architecture / SOLID / DDD)
 * Delegates execution to modular HttpServer in src/interfaces/http/HttpServer.js
 */
require('./utils/envLoader');
const HttpServer = require('./src/interfaces/http/HttpServer');

const app = new HttpServer();
app.start();

module.exports = app;
