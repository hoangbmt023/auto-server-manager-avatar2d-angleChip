/**
 * RESTful HTTP Router (Interface Adapters Layer)
 * Provides declarative REST route registration (GET, POST, PUT, DELETE, PATCH),
 * URL path parameters (:id), route grouping, middlewares, and execution.
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

  _register(method, pathname, handler, isPrefix = false) {
    const paramNames = [];
    let regex = null;

    if (pathname.includes(':')) {
      const parts = pathname.split('/');
      const regexParts = parts.map(part => {
        if (part.startsWith(':')) {
          paramNames.push(part.slice(1));
          return '([^\\/]+)';
        }
        return part.replace(/[-[\]{}()*+?.,\\^$|#\s]/g, '\\$&');
      });
      regex = new RegExp('^' + regexParts.join('/') + '$');
    }

    this.routes.push({
      method: method.toUpperCase(),
      pathname,
      handler,
      isPrefix,
      regex,
      paramNames
    });
    return this;
  }

  get(pathname, handler) {
    return this._register('GET', pathname, handler);
  }

  post(pathname, handler, isPrefix = false) {
    return this._register('POST', pathname, handler, isPrefix);
  }

  put(pathname, handler, isPrefix = false) {
    return this._register('PUT', pathname, handler, isPrefix);
  }

  patch(pathname, handler, isPrefix = false) {
    return this._register('PATCH', pathname, handler, isPrefix);
  }

  delete(pathname, handler, isPrefix = false) {
    return this._register('DELETE', pathname, handler, isPrefix);
  }

  prefix(prefixPath, subRouter) {
    for (const route of subRouter.routes) {
      const fullPath = prefixPath.replace(/\/$/, '') + '/' + route.pathname.replace(/^\//, '');
      this._register(route.method, fullPath, route.handler, route.isPrefix);
    }
    return this;
  }

  async handle(req, res, parsedUrl, helpers) {
    const currentMethod = (req.method || 'GET').toUpperCase();
    const currentPath = parsedUrl.pathname;

    for (const route of this.routes) {
      const isMethodMatch = route.method === currentMethod;
      if (!isMethodMatch) continue;

      req.params = {};
      let isPathMatch = false;

      if (route.regex) {
        const match = currentPath.match(route.regex);
        if (match) {
          isPathMatch = true;
          route.paramNames.forEach((name, idx) => {
            req.params[name] = decodeURIComponent(match[idx + 1]);
          });
        }
      } else if (route.isPrefix) {
        isPathMatch = currentPath.startsWith(route.pathname);
      } else {
        isPathMatch = currentPath === route.pathname;
      }

      if (isPathMatch) {
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
