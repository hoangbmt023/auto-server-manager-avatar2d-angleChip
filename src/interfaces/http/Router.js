/**
 * Lightweight HTTP Router (Interface Adapters Layer)
 * Provides clean declarative route registration (GET, POST), route grouping and execution.
 */
class Router {
  constructor() {
    this.routes = [];
    this.middlewares = [];
  }

  use(middleware) {
    this.middlewares.push(middleware);
    return this;
  }

  get(pathname, handler) {
    this.routes.push({ method: 'GET', pathname, handler, isPrefix: false });
    return this;
  }

  post(pathname, handler, isPrefix = false) {
    this.routes.push({ method: 'POST', pathname, handler, isPrefix });
    return this;
  }

  prefix(prefixPath, subRouter) {
    for (const route of subRouter.routes) {
      const fullPath = prefixPath.replace(/\/$/, '') + '/' + route.pathname.replace(/^\//, '');
      this.routes.push({
        method: route.method,
        pathname: fullPath,
        handler: route.handler,
        isPrefix: route.isPrefix
      });
    }
    return this;
  }

  async handle(req, res, parsedUrl, helpers) {
    const currentMethod = req.method;
    const currentPath = parsedUrl.pathname;

    for (const route of this.routes) {
      const isMethodMatch = route.method === currentMethod;
      const isPathMatch = route.isPrefix
        ? currentPath.startsWith(route.pathname)
        : currentPath === route.pathname;

      if (isMethodMatch && isPathMatch) {
        // Execute route-level middlewares if any
        for (const mw of this.middlewares) {
          const proceed = await mw(req, res, helpers);
          if (proceed === false) return true;
        }

        await route.handler(req, res, helpers);
        return true;
      }
    }

    return false;
  }
}

module.exports = Router;
