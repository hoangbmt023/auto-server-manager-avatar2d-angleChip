/**
 * Server Entrypoint
 * Delegates execution to modular HttpServer in src/interfaces/http/HttpServer.js
 */
require('./config');
const HttpServer = require('./src/interfaces/http/HttpServer');

const app = new HttpServer();
app.start();

module.exports = app;
