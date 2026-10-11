/**
 * AvatarCharacterView (Presentation Layer)
 * Renders avatar sprite extracted from bot engine or minimalist glass icon.
 */
window.AvatarCharacterView = React.memo(function AvatarCharacterView({
  username = '',
  isRunning = false,
  isError = false,
  isMaintenance = false,
  status = 'offline',
  avatarUrl = null,
  gold = 0,
  size = 54
}) {
  const cleanUser = (username || '').trim();
  const activeStatus = status || (isError ? 'error' : isMaintenance ? 'maintenance' : isRunning ? 'online' : 'offline');

  if (avatarUrl) {
    return (
      <div
        className={`avatar-chibi-wrapper is-${activeStatus}`}
        style={{
          width: size,
          height: size,
          minWidth: size,
          minHeight: size,
          maxWidth: size,
          maxHeight: size,
          flexShrink: 0,
          display: 'flex',
          alignItems: 'center',
          justifyContent: 'center',
          background: 'transparent',
          border: 'none',
          boxShadow: 'none',
          overflow: 'hidden'
        }}
        title={`Nhân vật TeaMobi Avatar 2D: ${cleanUser}`}
      >
        <img
          src={avatarUrl}
          alt={cleanUser}
          style={{
            width: '100%',
            height: '100%',
            objectFit: 'contain',
            imageRendering: 'pixelated'
          }}
        />
      </div>
    );
  }

  return (
    <div
      className={`avatar-chibi-wrapper is-${activeStatus}`}
      style={{
        width: size,
        height: size,
        minWidth: size,
        minHeight: size,
        maxWidth: size,
        maxHeight: size,
        flexShrink: 0,
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
        background: 'rgba(255, 255, 255, 0.04)',
        borderRadius: '12px',
        border: '1px solid var(--border-glass)'
      }}
      title={`Tài khoản: ${cleanUser}`}
    >
      <window.Icon
        name={isError ? 'alert-triangle' : isRunning ? 'bot' : 'user'}
        size={22}
        color={isRunning ? 'var(--apple-green)' : 'var(--text-tertiary)'}
      />
    </div>
  );
}, (prev, next) => {
  return prev.avatarUrl === next.avatarUrl &&
         prev.status === next.status &&
         prev.isRunning === next.isRunning &&
         prev.isError === next.isError &&
         prev.isMaintenance === next.isMaintenance &&
         prev.size === next.size &&
         prev.username === next.username;
});
