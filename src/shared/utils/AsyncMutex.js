/**
 * AsyncMutex (Shared Utility)
 * In-Memory Asynchronous FIFO Mutex Lock.
 * Used to guard critical resource allocation and lifecycle workflows against race conditions.
 * Triệt tiêu 100% lỗi gọi API mua đúp 2 Proxy cùng lúc khi nhiều request đến đồng thời.
 */
class AsyncMutex {
  constructor(name = 'default') {
    this.name = name;
    this._locked = false;
    this._queue = [];
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
   * @param {() => Promise<T>} fn
   * @returns {Promise<T>}
   */
  async runExclusive(fn) {
    const release = await this.acquire();
    try {
      return await fn();
    } finally {
      release();
    }
  }

  isLocked() {
    return this._locked;
  }

  queueLength() {
    return this._queue.length;
  }
}

module.exports = AsyncMutex;
