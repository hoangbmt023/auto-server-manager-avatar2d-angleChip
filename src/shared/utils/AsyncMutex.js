const { AsyncLocalStorage } = require('async_hooks');

/**
 * AsyncMutex (Shared Utility)
 * In-Memory Asynchronous FIFO Reentrant Mutex Lock.
 * Used to guard critical resource allocation and lifecycle workflows against race conditions.
 *
 * Features:
 * 1. FIFO Queue: Guarantees strict sequential execution for independent requests.
 * 2. Reentrant Safe: Prevents Deadlock when a caller inside runExclusive calls another function that also calls runExclusive on the same mutex.
 * 3. Triệt tiêu 100% lỗi gọi API mua đúp 2 Proxy cùng lúc khi nhiều request đến đồng thời.
 */
class AsyncMutex {
  constructor(name = 'default') {
    this.name = name;
    this._locked = false;
    this._queue = [];
    this._asyncLocalStorage = new AsyncLocalStorage();
    this._currentHolderId = null;
    this._reentrantCount = 0;
  }

  /**
   * Acquire lock. Resolves with a release function when lock is held.
   * @returns {Promise<() => void>}
   */
  acquire() {
    return new Promise((resolve) => {
      const dispatch = () => {
        this._locked = true;
        let released = false;
        resolve(() => {
          if (released) return;
          released = true;
          this._locked = false;
          if (this._queue.length > 0) {
            const next = this._queue.shift();
            next();
          }
        });
      };

      if (!this._locked) {
        dispatch();
      } else {
        this._queue.push(dispatch);
      }
    });
  }

  /**
   * Run an asynchronous function exclusively inside the mutex.
   * Fully Reentrant: If the current async execution context already holds this mutex,
   * it executes directly without blocking itself (eliminates nested deadlocks).
   * @param {() => Promise<T>} fn
   * @returns {Promise<T>}
   */
  async runExclusive(fn) {
    const store = this._asyncLocalStorage.getStore();

    // Check if the current async context already owns this lock
    if (this._locked && store && store.mutexOwnerId === this._currentHolderId) {
      this._reentrantCount++;
      try {
        return await fn();
      } finally {
        this._reentrantCount--;
      }
    }

    const release = await this.acquire();
    const ownerId = `${this.name}_${Date.now()}_${Math.random().toString(36).slice(2, 9)}`;
    this._currentHolderId = ownerId;
    this._reentrantCount = 1;

    return this._asyncLocalStorage.run({ mutexOwnerId: ownerId }, async () => {
      try {
        return await fn();
      } finally {
        this._reentrantCount = 0;
        this._currentHolderId = null;
        release();
      }
    });
  }

  isLocked() {
    return this._locked;
  }

  queueLength() {
    return this._queue.length;
  }
}

const globalAllocationMutex = new AsyncMutex('global_proxy_allocation');
AsyncMutex.globalAllocationMutex = globalAllocationMutex;

module.exports = AsyncMutex;
module.exports.globalAllocationMutex = globalAllocationMutex;
