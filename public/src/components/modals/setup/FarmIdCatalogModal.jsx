/**
 * FarmIdCatalogModal Component (Presentation Layer / Modals)
 * Searchable & Categorized ID Catalog Picker for Avatar Farm items with Complete Vector Artwork
 */
const { useState: useCatalogState, useEffect: useCatalogEffect } = React;

/**
 * Complete Visual Artwork Engine for all Avatar Farm Items
 */
window.FarmItemGraphic = function FarmItemGraphic({ item, size = 30 }) {
  if (!item) return null;
  const name = item.name || '';
  const cat = item.category || 'plant';

  // 0. CHECK DIRECT AUTHENTIC TEAMOBI GAME ASSETS
  let directAsset = null;
  if (name.includes('Bò') || name.includes('bò')) directAsset = '/src/assets/farm/bo.png';
  else if (name.includes('Trâu') || name.includes('trâu')) directAsset = '/src/assets/farm/trau.png';
  else if (name.includes('Dê') || name.includes('dê')) directAsset = '/src/assets/farm/de.png';
  else if (name.includes('Cừu') || name.includes('cừu')) directAsset = '/src/assets/farm/cuu.png';
  else if (name.includes('Gà') || name.includes('gà')) directAsset = '/src/assets/farm/ga.png';
  else if (name.includes('Vịt') || name.includes('vịt')) directAsset = '/src/assets/farm/vit.png';
  else if (name.includes('Heo') || name.includes('heo') || name.includes('Lợn')) directAsset = '/src/assets/farm/heo.png';
  else if (name.includes('Thỏ') || name.includes('thỏ')) directAsset = '/src/assets/farm/tho.png';
  else if (name.includes('Rùa') || name.includes('rùa')) directAsset = '/src/assets/farm/rua.png';
  else if (name.includes('Cá rô') || name.includes('Cá lóc') || name.includes('Cá trắm') || name.includes('Cá mè') || name.includes('Cá sấu') || (cat === 'animal' && name.includes('Cá'))) directAsset = '/src/assets/farm/ca.png';
  else if (name.includes('Cỏ') || name.includes('cỏ') || name.includes('Rơm')) directAsset = '/src/assets/farm/co.png';
  else if (name.includes('Phân bón') || name.includes('Bón phân')) directAsset = '/src/assets/farm/bonphan.png';
  else if (name.includes('Thuốc bổ')) directAsset = '/src/assets/farm/thuocbo.png';
  else if (name.includes('Thuốc chữa bệnh') || name.includes('Chữa bệnh')) directAsset = '/src/assets/farm/chuabenh.png';
  else if (name.includes('Sâu') || name.includes('Bắt sâu')) directAsset = '/src/assets/farm/sau.png';
  else if (name.includes('Tiêu chảy')) directAsset = '/src/assets/farm/tieuchay.png';
  else if (name.includes('Cúm')) directAsset = '/src/assets/farm/cum.png';
  else if (name.includes('Xu') || name.includes('Tiền xu')) directAsset = '/src/assets/farm/coin.png';
  else if (name.includes('Lượng') || name.includes('Gold')) directAsset = '/src/assets/farm/gold.png';

  if (directAsset) {
    return (
      <div style={{ width: size, height: size, display: 'inline-flex', alignItems: 'center', justifyContent: 'center' }}>
        <img
          src={directAsset}
          alt={name}
          style={{ maxWidth: size, maxHeight: size, objectFit: 'contain', imageRendering: 'pixelated' }}
        />
      </div>
    );
  }

  let svgContent = null;

  // 1. PLANTS & SEEDS
  if (name.includes('Cà chua')) {
    svgContent = (
      <g>
        <circle cx="16" cy="18" r="11" fill="#e53935" />
        <ellipse cx="13" cy="14" rx="3.5" ry="2" fill="#fff" opacity="0.35" transform="rotate(-30 13 14)" />
        <path d="M16 8 C16 4 14 3 13 3 M16 8 L13 6 M16 8 L19 6 M16 8 L11 8 M16 8 L21 8" stroke="#30d158" strokeWidth="2.2" strokeLinecap="round" />
        <circle cx="16" cy="8" r="1.8" fill="#248a3d" />
      </g>
    );
  } else if (name.includes('Cà rốt')) {
    svgContent = (
      <g>
        <path d="M12 28 C14 28 22 13 22 10 C22 8 18 7 15 8 C12 9 8 13 10 24 Z" fill="#ff9800" />
        <path d="M14 13 L18 12 M13 17 L17 16 M12 21 L15 20" stroke="#d84315" strokeWidth="1.2" strokeLinecap="round" />
        <path d="M18 8 C18 4 22 2 25 3 M18 8 C19 3 20 2 21 1 M17 8 C15 3 14 2 12 1" stroke="#32d74b" strokeWidth="2" strokeLinecap="round" />
      </g>
    );
  } else if (name.includes('Lúa')) {
    svgContent = (
      <g>
        <path d="M16 28 C16 18 16 8 16 4" stroke="#8d6e63" strokeWidth="2" strokeLinecap="round" />
        <ellipse cx="13" cy="8" rx="3.5" ry="2" fill="#ffd60a" transform="rotate(-30 13 8)" />
        <ellipse cx="19" cy="8" rx="3.5" ry="2" fill="#ffd60a" transform="rotate(30 19 8)" />
        <ellipse cx="13" cy="13" rx="4" ry="2.2" fill="#ffca28" transform="rotate(-30 13 13)" />
        <ellipse cx="19" cy="13" rx="4" ry="2.2" fill="#ffca28" transform="rotate(30 19 13)" />
        <ellipse cx="13" cy="18" rx="4.5" ry="2.5" fill="#fbc02d" transform="rotate(-30 13 18)" />
        <ellipse cx="19" cy="18" rx="4.5" ry="2.5" fill="#fbc02d" transform="rotate(30 19 18)" />
        <ellipse cx="16" cy="4" rx="2.5" ry="3.5" fill="#ffd60a" />
      </g>
    );
  } else if (name.includes('Dứa') || name.includes('Khóm')) {
    svgContent = (
      <g>
        <path d="M16 10 C16 4 19 2 22 2 M16 10 C16 3 16 2 16 1 M16 10 C16 4 13 2 10 2" stroke="#32d74b" strokeWidth="2.5" strokeLinecap="round" />
        <ellipse cx="16" cy="20" rx="8.5" ry="9.5" fill="#ffd600" />
        <path d="M10 16 L22 24 M10 24 L22 16 M8 20 L24 20" stroke="#f57f17" strokeWidth="1.3" opacity="0.6" />
      </g>
    );
  } else if (name.includes('Dưa hấu')) {
    svgContent = (
      <g>
        <path d="M6 10 C6 24 26 24 26 10 Z" fill="#2e7d32" />
        <path d="M8 11 C8 22 24 22 24 11 Z" fill="#e8f5e9" />
        <path d="M9 11 C9 20 23 20 23 11 Z" fill="#ff3b30" />
        <circle cx="12" cy="14" r="0.9" fill="#212121" />
        <circle cx="16" cy="16" r="0.9" fill="#212121" />
        <circle cx="20" cy="14" r="0.9" fill="#212121" />
      </g>
    );
  } else if (name.includes('Nho')) {
    svgContent = (
      <g>
        <path d="M16 6 C16 3 19 2 21 2" stroke="#8d6e63" strokeWidth="2" strokeLinecap="round" />
        <circle cx="13" cy="11" r="3.2" fill="#7b1fa2" />
        <circle cx="19" cy="11" r="3.2" fill="#8e24aa" />
        <circle cx="10" cy="16" r="3.2" fill="#6a1b9a" />
        <circle cx="16" cy="16" r="3.2" fill="#9c27b0" />
        <circle cx="22" cy="16" r="3.2" fill="#7b1fa2" />
        <circle cx="13" cy="21" r="3.2" fill="#8e24aa" />
        <circle cx="19" cy="21" r="3.2" fill="#6a1b9a" />
        <circle cx="16" cy="26" r="3.2" fill="#4a148c" />
      </g>
    );
  } else if (name.includes('Hoa hồng')) {
    svgContent = (
      <g>
        <path d="M16 28 C16 22 17 18 16 15" stroke="#2e7d32" strokeWidth="2.5" strokeLinecap="round" />
        <circle cx="16" cy="12" r="8.5" fill="#d81b60" />
        <path d="M16 6 C19 6 22 8 22 11 C22 14 18 17 16 17 C13 17 10 14 10 11 C10 8 13 6 16 6 Z" fill="#ff4081" />
        <path d="M16 8 C18 8 19 9 19 11 C19 12 17 14 16 14 C14 14 13 12 13 11 C13 9 14 8 16 8 Z" fill="#f50057" />
      </g>
    );
  } else if (name.includes('Xoài')) {
    svgContent = (
      <g>
        <path d="M12 8 C18 6 25 10 24 18 C23 26 15 28 10 22 C6 18 8 10 12 8 Z" fill="#ff9800" stroke="#f57c00" strokeWidth="1" />
        <path d="M18 7 C18 4 21 2 24 3" stroke="#4caf50" strokeWidth="2" strokeLinecap="round" />
      </g>
    );
  } else if (name.includes('Thanh long')) {
    svgContent = (
      <g>
        <ellipse cx="16" cy="18" rx="8.5" ry="10" fill="#e91e63" />
        <path d="M16 8 L18 5 L16 7 L14 5 Z M10 15 L7 13 L10 17 Z M22 15 L25 13 L22 17 Z M11 23 L8 25 L12 25 Z M21 23 L24 25 L20 25 Z" fill="#4caf50" />
      </g>
    );
  } else if (name.includes('Hướng dương') || name.includes('hướng dương')) {
    svgContent = (
      <g>
        <circle cx="16" cy="16" r="12" fill="#ffca28" stroke="#ffb300" strokeWidth="1.5" strokeDasharray="3,2" />
        <circle cx="16" cy="16" r="6.5" fill="#4e342e" />
        <circle cx="16" cy="16" r="4.5" fill="#3e2723" />
      </g>
    );
  } else if (name.includes('tulip') || name.includes('Tulip')) {
    svgContent = (
      <g>
        <path d="M16 28 L16 16" stroke="#2e7d32" strokeWidth="2.5" strokeLinecap="round" />
        <path d="M10 10 C10 18 22 18 22 10 C20 12 18 10 16 12 C14 10 12 12 10 10 Z" fill="#e91e63" />
      </g>
    );
  } else if (name.includes('Bắp') || name.includes('Ngô')) {
    svgContent = (
      <g>
        <path d="M12 26 C12 16 20 8 20 8 C20 8 24 16 20 26 Z" fill="#ffd600" />
        <path d="M14 12 L19 14 M13 16 L18 18 M13 20 L18 22" stroke="#ffab00" strokeWidth="1.3" />
        <path d="M10 28 C10 20 12 14 15 10 C13 18 12 24 11 28 Z" fill="#81c784" />
        <path d="M22 28 C22 20 20 14 17 10 C19 18 20 24 21 28 Z" fill="#66bb6a" />
      </g>
    );
  } else if (name.includes('Dưa leo')) {
    svgContent = (
      <g>
        <path d="M10 24 C8 20 14 8 20 6 C24 8 20 22 12 26 Z" fill="#2e7d32" />
        <circle cx="13" cy="18" r="0.8" fill="#a5d6a7" />
        <circle cx="17" cy="12" r="0.8" fill="#a5d6a7" />
      </g>
    );
  } else if (name.includes('Cà tím')) {
    svgContent = (
      <g>
        <path d="M16 8 C20 8 23 20 18 26 C13 28 10 20 13 12 Z" fill="#5e35b1" />
        <path d="M16 8 L14 5 L16 3 L18 5 Z" fill="#4caf50" />
      </g>
    );
  } else if (name.includes('Tỏi')) {
    svgContent = (
      <g>
        <ellipse cx="16" cy="18" rx="8" ry="7" fill="#f5f5f5" stroke="#e0e0e0" strokeWidth="1" />
        <path d="M16 11 L16 5" stroke="#8d6e63" strokeWidth="2" strokeLinecap="round" />
        <path d="M12 13 C14 15 14 21 12 24 M20 13 C18 15 18 21 20 24" stroke="#e0e0e0" strokeWidth="1.2" />
      </g>
    );
  } else if (name.includes('Dâu tây')) {
    svgContent = (
      <g>
        <path d="M16 27 C9 22 7 13 10 9 C13 5 19 5 22 9 C25 13 23 22 16 27 Z" fill="#e53935" />
        <circle cx="13" cy="12" r="0.8" fill="#ffd600" />
        <circle cx="18" cy="12" r="0.8" fill="#ffd600" />
        <circle cx="15" cy="16" r="0.8" fill="#ffd600" />
        <circle cx="12" cy="19" r="0.8" fill="#ffd600" />
        <circle cx="19" cy="18" r="0.8" fill="#ffd600" />
        <path d="M16 6 L12 4 L14 7 L10 7 L13 9 L16 8 L19 9 L22 7 L18 7 L20 4 Z" fill="#4caf50" />
      </g>
    );
  } else if (name.includes('Chuối')) {
    svgContent = (
      <g>
        <path d="M8 22 C14 26 24 20 26 8 C22 10 14 12 8 22 Z" fill="#ffd600" stroke="#fbc02d" strokeWidth="1" />
        <path d="M26 8 C25 6 26 5 28 5" stroke="#5d4037" strokeWidth="2.5" strokeLinecap="round" />
      </g>
    );
  } else if (name.includes('Đào')) {
    svgContent = (
      <g>
        <circle cx="16" cy="17" r="9.5" fill="#ff8a80" />
        <path d="M16 9 C16 13 15 22 16 26" stroke="#d50000" strokeWidth="1" opacity="0.4" />
        <path d="M16 8 C18 5 22 5 24 6" stroke="#4caf50" strokeWidth="2" strokeLinecap="round" />
      </g>
    );
  } else if (name.includes('Vải')) {
    svgContent = (
      <g>
        <circle cx="13" cy="18" r="6" fill="#c2185b" />
        <circle cx="20" cy="16" r="6" fill="#e91e63" />
        <path d="M13 12 C14 8 18 6 20 10" stroke="#4caf50" strokeWidth="2" strokeLinecap="round" />
      </g>
    );
  } else if (name.includes('Cúc chuồn chuồn')) {
    svgContent = (
      <g>
        <circle cx="16" cy="16" r="12" fill="#fff" stroke="#e0e0e0" strokeWidth="1" strokeDasharray="4 2" />
        <circle cx="16" cy="16" r="5" fill="#ffd600" />
      </g>
    );
  } else if (name.includes('Sen')) {
    svgContent = (
      <g>
        <path d="M16 26 C8 24 8 16 16 8 C24 16 24 24 16 26 Z" fill="#f48fb1" />
        <path d="M16 26 C12 24 12 18 16 12 C20 18 20 24 16 26 Z" fill="#f06292" />
      </g>
    );
  } else if (name.includes('Bí ngô')) {
    svgContent = (
      <g>
        <ellipse cx="16" cy="18" rx="11" ry="8" fill="#f57c00" />
        <ellipse cx="16" cy="18" rx="7" ry="8" fill="#ff9800" />
        <ellipse cx="16" cy="18" rx="3.5" ry="8" fill="#ffa726" />
        <path d="M16 10 C16 6 18 5 19 4" stroke="#5d4037" strokeWidth="2.5" strokeLinecap="round" />
      </g>
    );
  } else if (name.includes('Khoai tây')) {
    svgContent = (
      <g>
        <ellipse cx="16" cy="17" rx="10.5" ry="7.5" fill="#bcaaa4" transform="rotate(-15 16 17)" />
        <circle cx="12" cy="15" r="0.8" fill="#8d6e63" />
        <circle cx="18" cy="14" r="0.8" fill="#8d6e63" />
        <circle cx="15" cy="19" r="0.8" fill="#8d6e63" />
      </g>
    );
  } else if (name.includes('Ớt') || name.includes('ớt')) {
    svgContent = (
      <g>
        <path d="M22 6 C18 12 16 22 8 26 C8 24 12 18 16 10 C18 6 22 6 22 6 Z" fill="#d32f2f" stroke="#b71c1c" strokeWidth="0.8" />
        <path d="M22 6 C24 4 25 2 27 3" stroke="#388e3c" strokeWidth="2.2" strokeLinecap="round" />
      </g>
    );
  }

  // 2. ANIMALS & FISH
  else if (name.includes('Gà')) {
    svgContent = (
      <g>
        <circle cx="15" cy="18" r="7.5" fill="#fff" stroke="#e0e0e0" strokeWidth="1" />
        <circle cx="20" cy="12" r="4.5" fill="#fff" />
        <path d="M24 12 L28 14 L24 15 Z" fill="#ff9800" />
        <circle cx="21" cy="11" r="1.1" fill="#212121" />
        <path d="M18 7 C18 5 21 5 21 7 C21 5 23 5 23 7" stroke="#e53935" strokeWidth="2.2" strokeLinecap="round" />
        <path d="M14 25 L14 28 M17 25 L17 28" stroke="#ff9800" strokeWidth="2" strokeLinecap="round" />
      </g>
    );
  } else if (name.includes('Bò')) {
    svgContent = (
      <g>
        <ellipse cx="16" cy="17" rx="9.5" ry="7.5" fill="#fff" stroke="#e0e0e0" strokeWidth="1" />
        <circle cx="12" cy="14" r="2.8" fill="#212121" />
        <circle cx="19" cy="17" r="2.3" fill="#212121" />
        <ellipse cx="16" cy="20" rx="5.5" ry="3.5" fill="#ffcdd2" />
        <circle cx="14" cy="20" r="0.9" fill="#d32f2f" />
        <circle cx="18" cy="20" r="0.9" fill="#d32f2f" />
        <circle cx="11" cy="13" r="1.1" fill="#212121" />
        <circle cx="21" cy="13" r="1.1" fill="#212121" />
      </g>
    );
  } else if (name.includes('Heo')) {
    svgContent = (
      <g>
        <circle cx="16" cy="16" r="10.5" fill="#f48fb1" />
        <ellipse cx="16" cy="18" rx="5" ry="3.5" fill="#f06292" />
        <circle cx="14" cy="18" r="1.1" fill="#880e4f" />
        <circle cx="18" cy="18" r="1.1" fill="#880e4f" />
        <circle cx="11" cy="13" r="1.4" fill="#212121" />
        <circle cx="21" cy="13" r="1.4" fill="#212121" />
      </g>
    );
  } else if (name.includes('Chó')) {
    svgContent = (
      <g>
        <ellipse cx="16" cy="17" rx="8.5" ry="7.5" fill="#ffb74d" />
        <ellipse cx="10" cy="14" rx="2.5" ry="5" fill="#f57c00" />
        <ellipse cx="22" cy="14" rx="2.5" ry="5" fill="#f57c00" />
        <circle cx="13" cy="15" r="1.2" fill="#212121" />
        <circle cx="19" cy="15" r="1.2" fill="#212121" />
        <ellipse cx="16" cy="19" rx="2" ry="1.2" fill="#212121" />
      </g>
    );
  } else if (name.includes('Cá chép') || name.includes('Cá') || name.includes('cá')) {
    svgContent = (
      <g>
        <path d="M6 16 C10 10 22 10 26 16 C22 22 10 22 6 16 Z" fill="#ff7043" />
        <path d="M6 16 L2 11 L4 16 L2 21 Z" fill="#e65100" />
        <circle cx="22" cy="14" r="1.2" fill="#212121" />
      </g>
    );
  } else if (name.includes('Cừu')) {
    svgContent = (
      <g>
        <circle cx="16" cy="16" r="9" fill="#f5f5f5" stroke="#e0e0e0" strokeWidth="1.5" strokeDasharray="3 2" />
        <ellipse cx="16" cy="18" rx="4.5" ry="4" fill="#ffe0b2" />
        <circle cx="14" cy="17" r="1" fill="#212121" />
        <circle cx="18" cy="17" r="1" fill="#212121" />
      </g>
    );
  } else if (name.includes('Vịt')) {
    svgContent = (
      <g>
        <circle cx="14" cy="18" r="7.5" fill="#ffd600" />
        <circle cx="20" cy="12" r="4.5" fill="#ffd600" />
        <path d="M23 12 C26 12 28 14 26 15 C24 15 23 14 23 12 Z" fill="#ff6d00" />
        <circle cx="21" cy="11" r="1.1" fill="#212121" />
      </g>
    );
  } else if (name.includes('Rùa')) {
    svgContent = (
      <g>
        <ellipse cx="16" cy="17" rx="8" ry="6.5" fill="#2e7d32" stroke="#1b5e20" strokeWidth="1" />
        <circle cx="24" cy="17" r="3" fill="#4caf50" />
        <circle cx="25" cy="16" r="0.8" fill="#212121" />
        <circle cx="11" cy="11" r="1.8" fill="#4caf50" />
        <circle cx="21" cy="11" r="1.8" fill="#4caf50" />
        <circle cx="11" cy="23" r="1.8" fill="#4caf50" />
        <circle cx="21" cy="23" r="1.8" fill="#4caf50" />
      </g>
    );
  }

  // 3. COOKED FOOD & KITCHEN
  // 3. COOKED FOOD & KITCHEN (MÓN ĂN NHÀ BẾP - ĐỒ HỌA RIÊNG BIỆT TỪNG MÓN)
  else if (name.includes('Bánh Trứng')) {
    svgContent = (
      <g>
        {/* Đĩa bánh tart trứng nướng viền nâu giòn, nhân vàng tươi bóng */}
        <ellipse cx="16" cy="20" rx="12" ry="5" fill="#e0e0e0" />
        <path d="M7 18 C7 23 25 23 25 18 L23 15 L9 15 Z" fill="#b06c1f" stroke="#8a4d0f" strokeWidth="1" />
        <ellipse cx="16" cy="16" rx="9" ry="4" fill="#ffd600" />
        <ellipse cx="16" cy="16" rx="6" ry="2.2" fill="#fff59d" />
        <circle cx="13" cy="15" r="1" fill="#fff" opacity="0.6" />
      </g>
    );
  } else if (name.includes('Bánh sữa')) {
    svgContent = (
      <g>
        {/* Khối bánh sữa mềm trắng tinh khôi phủ mứt dâu hồng */}
        <rect x="6" y="12" width="20" height="13" rx="3" fill="#ffffff" stroke="#bbdefb" strokeWidth="1" />
        <path d="M6 15 Q16 19 26 15 L26 18 Q16 22 6 18 Z" fill="#f8bbd0" />
        <circle cx="16" cy="9" r="3" fill="#e91e63" />
        <circle cx="13" cy="10" r="1.5" fill="#f06292" />
        <circle cx="19" cy="10" r="1.5" fill="#f06292" />
      </g>
    );
  } else if (name.includes('Cơm Trứng')) {
    svgContent = (
      <g>
        {/* Bát cơm trắng bên trên phủ 1 quả trứng ốp la lòng đỏ cam tươi */}
        <path d="M6 17 C6 27 26 27 26 17 Z" fill="#0288d1" stroke="#01579b" strokeWidth="1" />
        <ellipse cx="16" cy="17" rx="10" ry="4" fill="#fafafa" />
        {/* Trứng ốp la */}
        <ellipse cx="16" cy="14" rx="6" ry="3.5" fill="#ffffff" stroke="#fff59d" strokeWidth="0.8" />
        <circle cx="16" cy="13.5" r="2.8" fill="#ff9800" />
        <circle cx="15" cy="12.5" r="0.9" fill="#ffffff" opacity="0.8" />
      </g>
    );
  } else if (name.includes('Cơm Cà rốt')) {
    svgContent = (
      <g>
        {/* Bát cơm trộn cà rốt cam thái hạt lựu và đậu xanh */}
        <path d="M6 17 C6 27 26 27 26 17 Z" fill="#00897b" stroke="#004d40" strokeWidth="1" />
        <ellipse cx="16" cy="17" rx="10" ry="4" fill="#fafafa" />
        {/* Hạt cà rốt & đậu */}
        <rect x="11" y="14" width="2.5" height="2.5" rx="0.5" fill="#ff9800" />
        <rect x="18" y="15" width="2.5" height="2.5" rx="0.5" fill="#ff9800" />
        <rect x="15" y="13" width="2.5" height="2.5" rx="0.5" fill="#ff9800" />
        <circle cx="13" cy="16" r="1.2" fill="#4caf50" />
        <circle cx="17" cy="14" r="1.2" fill="#4caf50" />
      </g>
    );
  } else if (name.includes('Cơm')) {
    svgContent = (
      <g>
        {/* Bát cơm trắng dẻo nghi ngút 2 làn khói */}
        <path d="M6 17 C6 27 26 27 26 17 Z" fill="#1976d2" stroke="#0d47a1" strokeWidth="1" />
        <ellipse cx="16" cy="17" rx="10" ry="4" fill="#ffffff" />
        <ellipse cx="16" cy="15" rx="7.5" ry="3" fill="#ffffff" />
        {/* Khói nghi ngút */}
        <path d="M12 11 Q14 7 12 4 M19 11 Q21 7 19 4" stroke="#90caf9" strokeWidth="1.5" strokeLinecap="round" opacity="0.75" />
      </g>
    );
  } else if (name.includes('Bánh xèo')) {
    svgContent = (
      <g>
        {/* Bánh xèo gấp đôi vàng giòn rụm có tôm đỏ và giá đỗ */}
        <ellipse cx="16" cy="22" rx="12" ry="4" fill="#b0bec5" />
        <path d="M6 20 C6 9 26 9 26 20 Z" fill="#ffd600" stroke="#f57f17" strokeWidth="1" />
        {/* Con tôm đỏ và nhân bên trong */}
        <path d="M12 16 C14 13 18 13 20 16" stroke="#e53935" strokeWidth="2.5" strokeLinecap="round" />
        <circle cx="11" cy="16" r="1" fill="#d32f2f" />
        <path d="M9 18 L23 18" stroke="#81c784" strokeWidth="1.5" strokeLinecap="round" />
      </g>
    );
  } else if (name.includes('Pizza')) {
    svgContent = (
      <g>
        {/* Miếng Pizza phô mai kéo sợi với xúc xích đỏ và ớt chuông */}
        <path d="M16 29 L5 6 C12 3 20 3 27 6 Z" fill="#ffd54f" stroke="#e65100" strokeWidth="1.2" />
        <path d="M5 6 C12 3 20 3 27 6 L25 8 C19 5 13 5 7 8 Z" fill="#d84315" />
        <circle cx="14" cy="14" r="2.2" fill="#d32f2f" />
        <circle cx="18" cy="19" r="2.2" fill="#d32f2f" />
        <circle cx="16" cy="10" r="1.8" fill="#d32f2f" />
        <rect x="11" y="18" width="2.5" height="1.2" fill="#388e3c" transform="rotate(30 11 18)" />
        <rect x="18" y="12" width="2.5" height="1.2" fill="#388e3c" transform="rotate(-20 18 12)" />
      </g>
    );
  } else if (name.includes('Khoai Tây Chiên')) {
    svgContent = (
      <g>
        {/* Hộp đựng khoai tây chiên đỏ fastfood với các que khoai vàng */}
        <path d="M8 14 L10 28 L22 28 L24 14 Z" fill="#d32f2f" />
        <path d="M10 14 L11 4 L13 4 L12 14 M13 14 L14 2 L16 2 L15 14 M16 14 L17 3 L19 3 L18 14 M19 14 L20 6 L22 6 L21 14" stroke="#ffd600" strokeWidth="2.5" strokeLinecap="round" />
        <circle cx="16" cy="21" r="3" fill="#ffd600" />
      </g>
    );
  } else if (name.includes('Bắp Chiên Bơ')) {
    svgContent = (
      <g>
        {/* Đĩa bắp chiên bơ vàng ươm bóng bẩy rắc hành ớt */}
        <ellipse cx="16" cy="20" rx="12" ry="5.5" fill="#e0e0e0" stroke="#bdbdbd" strokeWidth="1" />
        <circle cx="12" cy="18" r="2.5" fill="#ffd600" />
        <circle cx="16" cy="17" r="2.8" fill="#ffca28" />
        <circle cx="20" cy="18" r="2.5" fill="#ffd600" />
        <circle cx="14" cy="20" r="2.2" fill="#ffab00" />
        <circle cx="18" cy="20" r="2.2" fill="#ffab00" />
        <rect x="13" y="16" width="1.5" height="1.5" fill="#43a047" />
        <rect x="17" y="18" width="1.5" height="1.5" fill="#e53935" />
      </g>
    );
  } else if (name.includes('Gỏi xoài')) {
    svgContent = (
      <g>
        {/* Đĩa gỏi xoài thái sợi vàng xanh xen kẽ tôm luộc đỏ rắc đậu phộng */}
        <ellipse cx="16" cy="20" rx="12" ry="5.5" fill="#ffffff" stroke="#90caf9" strokeWidth="1" />
        <path d="M8 18 Q16 14 24 18" stroke="#ffd600" strokeWidth="2.2" strokeLinecap="round" />
        <path d="M10 19 Q16 16 22 19" stroke="#66bb6a" strokeWidth="2" strokeLinecap="round" />
        <path d="M11 16 Q16 13 21 16" stroke="#ff9800" strokeWidth="2" strokeLinecap="round" />
        <circle cx="14" cy="16" r="2" fill="#e53935" />
        <circle cx="18" cy="17" r="1.5" fill="#d7ccc8" />
      </g>
    );
  } else if (name.includes('Sữa chua Khế')) {
    svgContent = (
      <g>
        {/* Hũ thủy tinh sữa chua trắng mịn cắm lát khế hình sao 5 cánh vàng tươi */}
        <rect x="9" y="12" width="14" height="14" rx="4" fill="#ffffff" stroke="#b0bec5" strokeWidth="1" />
        <ellipse cx="16" cy="13" rx="6" ry="2" fill="#e0f7fa" />
        {/* Khế hình sao 5 cánh */}
        <path d="M16 4 L17.5 8.5 L22 8.5 L18.5 11 L20 15.5 L16 13 L12 15.5 L13.5 11 L10 8.5 L14.5 8.5 Z" fill="#ffd600" stroke="#f57f17" strokeWidth="0.8" />
        <circle cx="16" cy="10" r="1" fill="#4caf50" />
      </g>
    );
  } else if (name.includes('Salad khế')) {
    svgContent = (
      <g>
        {/* Bát salad xanh tươi giòn rụm điểm các lát khế ngôi sao vàng */}
        <path d="M6 18 C6 27 26 27 26 18 Z" fill="#43a047" stroke="#2e7d32" strokeWidth="1" />
        <circle cx="12" cy="15" r="4" fill="#66bb6a" />
        <circle cx="20" cy="15" r="4" fill="#81c784" />
        <circle cx="16" cy="13" r="4.5" fill="#a5d6a7" />
        {/* 2 ngôi sao khế vàng */}
        <polygon points="13,11 14,13 16,13 14.5,14.5 15,16.5 13,15 11,16.5 11.5,14.5 10,13 12,13" fill="#ffd600" />
        <polygon points="19,12 20,14 22,14 20.5,15.5 21,17.5 19,16 17,17.5 17.5,15.5 16,14 18,14" fill="#ffd600" />
      </g>
    );
  } else if (name.includes('Trái cây dầm')) {
    svgContent = (
      <g>
        {/* Ly/Tô trái cây dầm dưa hấu, xoài, bơ, sữa đặc */}
        <path d="M8 12 L10 26 L22 26 L24 12 Z" fill="#e0f7fa" stroke="#80deea" strokeWidth="1.2" />
        <circle cx="12" cy="16" r="3" fill="#ff3b30" />
        <circle cx="19" cy="15" r="3" fill="#ffd600" />
        <circle cx="15" cy="20" r="3" fill="#4caf50" />
        <circle cx="16" cy="13" r="2.5" fill="#ffffff" opacity="0.9" />
        <path d="M19 5 L21 2 L22 3 L20 14" stroke="#ff4081" strokeWidth="1.8" strokeLinecap="round" />
      </g>
    );
  } else if (name.includes('Trái cây dĩa')) {
    svgContent = (
      <g>
        {/* Đĩa trái cây tròn xếp lát dưa hấu, chuối, nho */}
        <ellipse cx="16" cy="19" rx="13" ry="6" fill="#ffffff" stroke="#e0e0e0" strokeWidth="1" />
        <path d="M8 18 C8 13 14 13 14 18 Z" fill="#ff3b30" stroke="#2e7d32" strokeWidth="1" />
        <path d="M18 15 C21 15 24 17 24 19 Z" fill="#ffd600" stroke="#f57f17" strokeWidth="0.8" />
        <circle cx="16" cy="18" r="2" fill="#7b1fa2" />
        <circle cx="18" cy="19" r="1.8" fill="#8e24aa" />
      </g>
    );
  } else if (name.includes('Nước ép dưa hấu')) {
    svgContent = (
      <g>
        {/* Ly nước ép dưa hấu đỏ tươi rực rỡ có lát dưa hấu cắm miệng ly */}
        <path d="M10 10 L12 28 L20 28 L22 10 Z" fill="#ff1744" stroke="#d50000" strokeWidth="1" />
        <ellipse cx="16" cy="10" rx="6" ry="2" fill="#ff5252" />
        <path d="M18 4 L20 1 L21 2 L19 14" stroke="#e0e0e0" strokeWidth="2" strokeLinecap="round" />
        {/* Miếng dưa hấu nhỏ ở miệng ly */}
        <path d="M8 6 C8 12 14 12 14 6 Z" fill="#2e7d32" />
        <path d="M9 7 C9 11 13 11 13 7 Z" fill="#ff1744" />
      </g>
    );
  } else if (name.includes('Nước ép trái cây')) {
    svgContent = (
      <g>
        {/* Ly nước ép cam vàng tươi có lát cam tròn cắm miệng ly */}
        <path d="M10 10 L12 28 L20 28 L22 10 Z" fill="#ff9800" stroke="#f57c00" strokeWidth="1" />
        <ellipse cx="16" cy="10" rx="6" ry="2" fill="#ffb74d" />
        <path d="M18 4 L20 1 L21 2 L19 14" stroke="#4caf50" strokeWidth="2" strokeLinecap="round" />
        <circle cx="10" cy="8" r="4.5" fill="#ff9800" stroke="#f57c00" strokeWidth="0.8" />
        <circle cx="10" cy="8" r="3" fill="#ffe082" />
      </g>
    );
  } else if (name.includes('Trà Đào')) {
    svgContent = (
      <g>
        {/* Ly trà đào hổ phách có các miếng đào ngâm vàng cam và nhánh sả */}
        <path d="M9 9 L11 28 L21 28 L23 9 Z" fill="#ff8f00" stroke="#e65100" strokeWidth="1" />
        <ellipse cx="16" cy="9" rx="7" ry="2.2" fill="#ffa000" />
        <path d="M13 14 C15 11 18 11 19 14 Z" fill="#ffcc80" />
        <path d="M12 20 C14 17 17 17 18 20 Z" fill="#ffcc80" />
        <path d="M19 4 L21 1 L22 2 L20 15" stroke="#795548" strokeWidth="2" strokeLinecap="round" />
        <circle cx="14" cy="7" r="1.5" fill="#4caf50" />
      </g>
    );
  } else if (name.includes('Trà sữa')) {
    svgContent = (
      <g>
        {/* Ly trà sữa trân châu trái cây có ống hút to và hạt trân châu đen */}
        <path d="M9 10 L11 28 L21 28 L23 10 Z" fill="#d7ccc8" stroke="#a1887f" strokeWidth="1.2" />
        <ellipse cx="16" cy="10" rx="7" ry="2.2" fill="#efebe9" />
        {/* Ống hút to */}
        <line x1="17" y1="2" x2="15" y2="24" stroke="#ab47bc" strokeWidth="3" strokeLinecap="round" />
        {/* Trân châu */}
        <circle cx="13" cy="25" r="1.8" fill="#212121" />
        <circle cx="17" cy="26" r="1.8" fill="#212121" />
        <circle cx="19" cy="24" r="1.8" fill="#212121" />
        <circle cx="15" cy="22" r="1.8" fill="#ff3b30" />
      </g>
    );
  } else if (name.includes('Chè khúc bạch')) {
    svgContent = (
      <g>
        {/* Bát chè khúc bạch thanh mát với các viên thạch trắng/xanh và nhãn */}
        <path d="M6 18 C6 27 26 27 26 18 Z" fill="#80deea" stroke="#00acc1" strokeWidth="1" />
        <ellipse cx="16" cy="18" rx="10" ry="4" fill="#e0f7fa" />
        {/* Khúc bạch trắng & trà xanh */}
        <rect x="10" y="14" width="4" height="4" rx="0.5" fill="#ffffff" stroke="#b2ebf2" strokeWidth="0.8" />
        <rect x="16" y="13" width="4" height="4" rx="0.5" fill="#81c784" stroke="#4caf50" strokeWidth="0.8" />
        <circle cx="21" cy="16" r="2.5" fill="#fff9c4" />
      </g>
    );
  } else if (name.includes('Kem Tươi')) {
    svgContent = (
      <g>
        {/* Kem ốc quế xoắn ốc 2 màu vani & dâu tây hồng pastel */}
        <path d="M11 16 L16 30 L21 16 Z" fill="#ffb74d" stroke="#f57c00" strokeWidth="1" />
        <line x1="13" y1="20" x2="19" y2="20" stroke="#f57c00" strokeWidth="0.8" />
        <line x1="14" y1="24" x2="18" y2="24" stroke="#f57c00" strokeWidth="0.8" />
        <circle cx="16" cy="14" r="6" fill="#f48fb1" />
        <circle cx="16" cy="9" r="4.5" fill="#ffffff" />
        <circle cx="16" cy="4" r="2.5" fill="#e91e63" />
      </g>
    );
  } else if (name.includes('Kem chiên')) {
    svgContent = (
      <g>
        {/* Viên kem chiên tròn vàng giòn rụm bên ngoài phủ sốt dâu đỏ */}
        <ellipse cx="16" cy="22" rx="11" ry="4.5" fill="#e0e0e0" />
        <circle cx="16" cy="15" r="9" fill="#ffb300" stroke="#f57f17" strokeWidth="1.2" />
        <path d="M11 11 Q16 16 21 11" stroke="#d81b60" strokeWidth="2.5" strokeLinecap="round" />
        <circle cx="16" cy="8" r="2.5" fill="#e91e63" />
      </g>
    );
  } else if (name.includes('Hột vịt lộn')) {
    svgContent = (
      <g>
        {/* Quả trứng hột vịt lộn trên đế chén con sứ kèm rau răm */}
        <ellipse cx="16" cy="24" rx="7" ry="3" fill="#b0bec5" />
        <path d="M11 23 C11 27 21 27 21 23 Z" fill="#ffffff" stroke="#90caf9" strokeWidth="1" />
        {/* Quả trứng */}
        <ellipse cx="16" cy="15" rx="6.5" ry="8.5" fill="#fff9c4" stroke="#fff59d" strokeWidth="1" />
        {/* Nhánh rau răm xanh */}
        <path d="M20 20 Q24 16 26 21" stroke="#2e7d32" strokeWidth="2" strokeLinecap="round" />
        <circle cx="10" cy="23" r="1.2" fill="#d32f2f" />
      </g>
    );
  } else if (name.includes('Bò viên')) {
    svgContent = (
      <g>
        {/* Xiên que tre 3 viên bò viên tròn nâu bóng chấm tương ớt */}
        <line x1="16" y1="2" x2="16" y2="30" stroke="#8d6e63" strokeWidth="2" strokeLinecap="round" />
        <circle cx="16" cy="8" r="4.5" fill="#5d4037" stroke="#3e2723" strokeWidth="0.8" />
        <circle cx="16" cy="16" r="4.5" fill="#4e342e" stroke="#3e2723" strokeWidth="0.8" />
        <circle cx="16" cy="24" r="4.5" fill="#3e2723" stroke="#212121" strokeWidth="0.8" />
        <circle cx="14" cy="7" r="1.2" fill="#d32f2f" />
      </g>
    );
  } else if (name.includes('Cá viên')) {
    svgContent = (
      <g>
        {/* Xiên que tre 3 viên cá viên vàng kem chiên giòn thơm lừng */}
        <line x1="16" y1="2" x2="16" y2="30" stroke="#8d6e63" strokeWidth="2" strokeLinecap="round" />
        <circle cx="16" cy="8" r="4.5" fill="#ffe082" stroke="#ffb300" strokeWidth="0.8" />
        <circle cx="16" cy="16" r="4.5" fill="#ffd54f" stroke="#ffa000" strokeWidth="0.8" />
        <circle cx="16" cy="24" r="4.5" fill="#ffca28" stroke="#ff8f00" strokeWidth="0.8" />
      </g>
    );
  } else if (name.includes('Phô mai')) {
    svgContent = (
      <g>
        {/* Miếng phô mai tam giác vàng rực có các lỗ tròn hoạt hình */}
        <path d="M6 22 L26 22 L23 11 L6 15 Z" fill="#ffd600" stroke="#fbc02d" strokeWidth="1.2" />
        <circle cx="12" cy="18" r="2" fill="#f57f17" opacity="0.6" />
        <circle cx="19" cy="19" r="1.5" fill="#f57f17" opacity="0.6" />
        <circle cx="16" cy="14" r="1.3" fill="#f57f17" opacity="0.6" />
      </g>
    );
  } else if (name.includes('Tương Cà Chua')) {
    svgContent = (
      <g>
        {/* Chai sốt tương cà chua đỏ tươi có nhãn quả cà chua */}
        <rect x="11" y="9" width="10" height="18" rx="3" fill="#d32f2f" stroke="#b71c1c" strokeWidth="1" />
        <rect x="13" y="4" width="6" height="5" fill="#ffffff" stroke="#e0e0e0" strokeWidth="0.8" />
        <rect x="12" y="14" width="8" height="8" rx="1.5" fill="#ffffff" />
        <circle cx="16" cy="18" r="2.8" fill="#e53935" />
        <circle cx="16" cy="16.5" r="0.8" fill="#388e3c" />
      </g>
    );
  } else if (name.includes('Tương ớt')) {
    svgContent = (
      <g>
        {/* Chai tương ớt màu đỏ rực có nhãn hình trái ớt cay nồng */}
        <rect x="11" y="9" width="10" height="18" rx="3" fill="#b71c1c" stroke="#880e4f" strokeWidth="1" />
        <rect x="13" y="4" width="6" height="5" fill="#ffd600" stroke="#f57f17" strokeWidth="0.8" />
        <rect x="12" y="14" width="8" height="8" rx="1.5" fill="#ffffff" />
        <path d="M18 16 C16 18 15 20 13 21 C13 20 14 18 16 17 Z" fill="#d32f2f" />
        <path d="M18 16 L19 15" stroke="#388e3c" strokeWidth="1" />
      </g>
    );
  } else if (name.includes('Tinh dầu hướng dương')) {
    svgContent = (
      <g>
        {/* Chai tinh dầu màu vàng hổ phách có hoa hướng dương */}
        <rect x="10" y="10" width="12" height="17" rx="3" fill="#ffa000" stroke="#ff6f00" strokeWidth="1" />
        <rect x="13" y="5" width="6" height="5" fill="#5d4037" />
        <circle cx="16" cy="18" r="3.5" fill="#ffd600" stroke="#f57f17" strokeWidth="0.8" />
        <circle cx="16" cy="18" r="1.5" fill="#3e2723" />
      </g>
    );
  } else if (name.includes('Nước Hoa')) {
    svgContent = (
      <g>
        {/* Chai nước hoa pha lê tím quý phái với vòi xịt vàng */}
        <rect x="9" y="11" width="14" height="16" rx="4" fill="#ab47bc" stroke="#7b1fa2" strokeWidth="1" />
        <rect x="13" y="7" width="6" height="4" fill="#ffd600" />
        <path d="M19 7 C23 7 24 5 24 3" stroke="#ffd600" strokeWidth="2" strokeLinecap="round" />
        <circle cx="16" cy="19" r="3" fill="#ba68c8" />
      </g>
    );
  } else if (name.includes('Sữa chua trái cây')) {
    svgContent = (
      <g>
        {/* Hũ sữa chua phân tầng hoa quả: dâu hồng, sữa trắng, việt quất tím */}
        <rect x="9" y="10" width="14" height="17" rx="3" fill="#ffffff" stroke="#b0bec5" strokeWidth="1" />
        <rect x="10" y="12" width="12" height="4" fill="#f48fb1" />
        <rect x="10" y="16" width="12" height="5" fill="#ffffff" />
        <rect x="10" y="21" width="12" height="5" fill="#ce93d8" />
        <circle cx="16" cy="8" r="2.2" fill="#e91e63" />
      </g>
    );
  } else {
    // Default crisp category fallback
    if (cat === 'plant') {
      svgContent = (
        <g>
          <circle cx="16" cy="16" r="11" fill="rgba(50, 215, 75, 0.15)" />
          <path d="M16 26 C16 16 24 8 24 8 C24 8 16 12 16 26 Z" fill="#32d74b" />
          <path d="M16 26 C16 18 10 12 8 10 C12 16 14 20 16 26 Z" fill="#30d158" />
        </g>
      );
    } else if (cat === 'animal') {
      svgContent = (
        <g>
          <circle cx="16" cy="16" r="11" fill="rgba(255, 149, 0, 0.15)" />
          <circle cx="16" cy="16" r="7.5" fill="#ff9f0a" />
          <circle cx="14" cy="14" r="1.3" fill="#fff" />
          <circle cx="18" cy="14" r="1.3" fill="#fff" />
        </g>
      );
    } else {
      svgContent = (
        <g>
          <circle cx="16" cy="16" r="11" fill="rgba(255, 214, 10, 0.15)" />
          <path d="M8 18 C8 24 24 24 24 18 Z" fill="#ffd60a" />
          <ellipse cx="16" cy="18" rx="7.5" ry="2.8" fill="#fff9c4" />
        </g>
      );
    }
  }

  return (
    <svg
      width={size}
      height={size}
      viewBox="0 0 32 32"
      fill="none"
      xmlns="http://www.w3.org/2000/svg"
      style={{ display: 'inline-block', verticalAlign: 'middle', flexShrink: 0 }}
    >
      {svgContent}
    </svg>
  );
}

window.FarmIdCatalogModal = function FarmIdCatalogModal({
  targetFieldName,
  targetLabel,
  currentValue = '',
  initialCategory = 'all',
  onSelect,
  onSetAll,
  onClose
}) {
  const [search, setSearch] = useCatalogState('');
  const [category, setCategory] = useCatalogState(initialCategory || 'all');

  useCatalogEffect(() => {
    if (initialCategory) {
      setCategory(initialCategory);
    }
  }, [initialCategory]);

  const allItems = window.AVATAR_FARM_ITEMS || [];
  const filteredItems = allItems.filter(item => {
    if (category !== 'all' && item.category !== category) return false;
    if (!search.trim()) return true;
    const q = search.toLowerCase().trim();
    return String(item.id).includes(q) || item.name.toLowerCase().includes(q);
  });

  const selectedIds = String(currentValue || '')
    .split(',')
    .map(s => s.trim())
    .filter(Boolean);

  const isAllSelected = currentValue === '-1';

  const categoryList = [
    { key: 'all', label: 'Tất cả', icon: 'layers' },
    { key: 'plant', label: 'Cây Trồng', icon: 'wheat' },
    { key: 'cook', label: 'Món Ăn', icon: 'utensils' },
    { key: 'animal', label: 'Vật Nuôi', icon: 'heart' }
  ];

  return (
    <window.ModalBase
      title="Tra Cứu & Chọn Mã ID Vật Phẩm"
      subtitle={`Đang chọn cho: ${targetLabel}`}
      icon="search"
      iconColor="var(--apple-blue)"
      size="lg"
      zIndex={10010}
      onClose={onClose}
      footer={
        <div style={{ display: 'flex', justifyContent: 'space-between', width: '100%', alignItems: 'center' }}>
          <div style={{ fontSize: '0.78rem', color: 'var(--text-secondary)' }}>
            {isAllSelected ? (
              <span style={{ color: 'var(--apple-blue)', fontWeight: 600 }}>Đang chọn: Tất cả (-1)</span>
            ) : (
              <span>Đã chọn: <strong style={{ color: 'var(--text-primary)' }}>{selectedIds.length}</strong> vật phẩm ({currentValue || 'trống'})</span>
            )}
          </div>
          <button type="button" className="btn btn-primary btn-sm" onClick={onClose} style={{ gap: '6px' }}>
            <window.Icon name="check" size={14} /> Xong
          </button>
        </div>
      }
    >
      <div style={{ display: 'flex', flexDirection: 'column', gap: '12px' }}>
        {/* Search Bar & Action */}
        <div style={{ display: 'flex', gap: '8px', alignItems: 'center' }}>
          <div style={{ position: 'relative', flex: 1 }}>
            <input
              type="text"
              className="form-control"
              placeholder="Tìm theo tên hoặc ID (VD: 6, lúa, xoài, cà chua, cơm...)"
              value={search}
              onChange={(e) => setSearch(e.target.value)}
              autoFocus
              style={{ paddingLeft: '34px' }}
            />
            <div style={{ position: 'absolute', left: '10px', top: '50%', transform: 'translateY(-50%)', pointerEvents: 'none' }}>
              <window.Icon name="search" size={15} color="var(--text-tertiary)" />
            </div>
          </div>
          {targetFieldName === 'sellProducts' && onSetAll && (
            <button
              type="button"
              className={`btn btn-sm ${isAllSelected ? 'btn-primary' : 'btn-secondary'}`}
              onClick={() => {
                onSetAll();
              }}
              title="Bán tất cả nông sản (-1)"
              style={{ whiteSpace: 'nowrap', gap: '6px' }}
            >
              <window.Icon name="check-circle" size={13} />
              Bán Tất Cả (-1)
            </button>
          )}
        </div>

        {/* Category Tabs */}
        <div className="segmented-control" style={{ display: 'flex', gap: '4px', overflowX: 'auto' }}>
          {categoryList.map(cat => (
            <button
              key={cat.key}
              type="button"
              className={`btn btn-sm ${category === cat.key ? 'active btn-primary' : ''}`}
              onClick={() => setCategory(cat.key)}
              style={{ gap: '6px', whiteSpace: 'nowrap' }}
            >
              <window.Icon name={cat.icon} size={13} />
              {cat.label}
            </button>
          ))}
        </div>

        {/* Items Grid */}
        <div className="catalog-items-grid" style={{ maxHeight: '380px', overflowY: 'auto', display: 'grid', gridTemplateColumns: 'repeat(auto-fill, minmax(200px, 1fr))', gap: '8px', padding: '2px' }}>
          {filteredItems.map(item => {
            const isSelected = selectedIds.includes(String(item.id)) || isAllSelected;

            return (
              <div
                key={`${item.category}_${item.id}`}
                className={`catalog-item-card ${isSelected ? 'selected' : ''}`}
                onClick={() => onSelect(item)}
                title={`Nhấn để ${isSelected ? 'bỏ' : 'thêm'} ID ${item.id} (${item.name})`}
                style={{
                  display: 'flex',
                  alignItems: 'center',
                  gap: '10px',
                  padding: '9px 12px',
                  background: isSelected ? 'rgba(10, 132, 255, 0.12)' : 'var(--glass-matrix-bg)',
                  border: isSelected ? '1px solid var(--apple-blue)' : '1px solid var(--glass-border-subtle)',
                  borderRadius: 'var(--radius-sm)',
                  cursor: 'pointer',
                  transition: 'var(--transition-fast)'
                }}
              >
                {/* Item Icon Graphic / Artwork */}
                <div
                  style={{
                    width: '38px',
                    height: '38px',
                    borderRadius: 'var(--radius-xs)',
                    background: isSelected ? 'rgba(10, 132, 255, 0.18)' : 'var(--glass-panel-bg)',
                    border: '1px solid var(--glass-border-subtle)',
                    display: 'flex',
                    alignItems: 'center',
                    justifyContent: 'center',
                    flexShrink: 0
                  }}
                >
                  <FarmItemGraphic item={item} size={28} />
                </div>

                <div style={{ flex: 1, minWidth: 0 }}>
                  <div style={{ fontSize: '0.86rem', fontWeight: 600, color: 'var(--text-primary)', whiteSpace: 'nowrap', overflow: 'hidden', textOverflow: 'ellipsis' }}>
                    {item.name}
                  </div>
                  <div style={{ display: 'flex', alignItems: 'center', gap: '6px', fontSize: '0.72rem', color: 'var(--text-secondary)', marginTop: '2px' }}>
                    <span style={{
                      background: 'var(--glass-panel-bg)',
                      padding: '1px 5px',
                      borderRadius: '4px',
                      border: '1px solid var(--glass-border-subtle)',
                      fontWeight: 600,
                      color: 'var(--apple-blue)'
                    }}>
                      ID: {item.id}
                    </span>
                    {item.time && <span>{item.time}</span>}
                    {item.yield && <span>+{item.yield}</span>}
                  </div>
                </div>

                {isSelected && (
                  <div style={{ color: 'var(--apple-blue)', flexShrink: 0 }}>
                    <window.Icon name="check" size={16} />
                  </div>
                )}
              </div>
            );
          })}
          {filteredItems.length === 0 && (
            <div style={{ gridColumn: '1 / -1', textAlign: 'center', padding: '36px 20px', color: 'var(--text-muted)' }}>
              Không tìm thấy vật phẩm nào khớp với từ khóa "{search}"
            </div>
          )}
        </div>
      </div>
    </window.ModalBase>
  );
};
