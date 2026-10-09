/**
 * Avatar Farm Items Database (Pure JavaScript Data Layer)
 * Cây Trồng, Nông Sản, Vật Nuôi, Món Ăn Nhà Bếp (Game Avatar)
 */

window.AVATAR_FARM_ITEMS = [
  // --- CÂY TRỒNG & HẠT GIỐNG ---
  { id: 0, name: 'Cà chua', category: 'plant', time: '4h', priceXu: 10, priceGold: 0, yield: 75, color: '#ff3b30' },
  { id: 1, name: 'Cà rốt', category: 'plant', time: '6h', priceXu: 10, priceGold: 0, yield: 108, color: '#ff9500' },
  { id: 2, name: 'Khóm (Dứa)', category: 'plant', time: '10h', priceXu: 10, priceGold: 0, yield: 165, color: '#ffd60a' },
  { id: 3, name: 'Dưa hấu', category: 'plant', time: '8h', priceXu: 10, priceGold: 0, yield: 138, color: '#30d158' },
  { id: 4, name: 'Nho', category: 'plant', time: '16h', priceXu: 10, priceGold: 0, yield: 240, color: '#bf5af2' },
  { id: 5, name: 'Hoa hồng', category: 'plant', time: '2h', priceXu: 10, priceGold: 0, yield: 45, color: '#ff2d55' },
  { id: 6, name: 'Lúa', category: 'plant', time: '48h', priceXu: 10, priceGold: 0, yield: 720, color: '#ffd60a' },
  { id: 7, name: 'Xoài', category: 'plant', time: '24h', priceXu: 10, priceGold: 0, yield: 360, color: '#ff9f0a' },
  { id: 8, name: 'Thanh long', category: 'plant', time: '12h', priceXu: 10, priceGold: 0, yield: 189, color: '#ff375f' },
  { id: 9, name: 'Hoa hướng dương', category: 'plant', time: '12h', priceXu: 10, priceGold: 0, yield: 189, color: '#ffd60a' },
  { id: 10, name: 'Hoa tulip', category: 'plant', time: '6h', priceXu: 10, priceGold: 0, yield: 108, color: '#ff375f' },
  { id: 30, name: 'Bắp (Ngô)', category: 'plant', time: '24h', priceXu: 10, priceGold: 0, yield: 360, color: '#ffd60a' },
  { id: 31, name: 'Nha đam', category: 'plant', time: '2h', priceXu: 0, priceGold: 1, yield: 1345, color: '#32d74b' },
  { id: 32, name: 'Dưa leo', category: 'plant', time: '48h', priceXu: 10, priceGold: 0, yield: 720, color: '#30d158' },
  { id: 33, name: 'Cà tím', category: 'plant', time: '8h', priceXu: 10, priceGold: 0, yield: 138, color: '#5e5ce6' },
  { id: 34, name: 'Tỏi', category: 'plant', time: '4h', priceXu: 10, priceGold: 0, yield: 75, color: '#f2f2f7' },
  { id: 35, name: 'Dâu tây', category: 'plant', time: '5h', priceXu: 10, priceGold: 0, yield: 97, color: '#ff3b30' },
  { id: 36, name: 'Chuối', category: 'plant', time: '11h', priceXu: 10, priceGold: 0, yield: 180, color: '#ffd60a' },
  { id: 37, name: 'Đào', category: 'plant', time: '48h', priceXu: 10, priceGold: 0, yield: 1000, color: '#ff7a85' },
  { id: 38, name: 'Vải', category: 'plant', time: '72h', priceXu: 10, priceGold: 0, yield: 1500, color: '#ff375f' },
  { id: 39, name: 'Cúc chuồn chuồn', category: 'plant', time: '3h', priceXu: 10, priceGold: 0, yield: 62, color: '#ffd60a' },
  { id: 40, name: 'Sen', category: 'plant', time: '8h', priceXu: 10, priceGold: 0, yield: 140, color: '#ff7a85' },
  { id: 41, name: 'Bí ngô', category: 'plant', time: '2h', priceXu: 10, priceGold: 0, yield: 80, color: '#ff9500' },
  { id: 42, name: 'Khoai tây', category: 'plant', time: '6h', priceXu: 10, priceGold: 0, yield: 120, color: '#c69c6d' },
  { id: 43, name: 'Cây ớt', category: 'plant', time: '1h', priceXu: 10, priceGold: 0, yield: 45, color: '#ff453a' },

  // --- VẬT NUÔI & THỦY HẢI SẢN ---
  { id: 50, name: 'Gà', category: 'animal', time: '24h', priceXu: 500, priceGold: 0, color: '#ff9f0a' },
  { id: 51, name: 'Bò', category: 'animal', time: '72h', priceXu: 1500, priceGold: 0, color: '#64d2ff' },
  { id: 52, name: 'Heo', category: 'animal', time: '48h', priceXu: 1000, priceGold: 0, color: '#ff7a85' },
  { id: 53, name: 'Chó', category: 'animal', time: '24h', priceXu: 2000, priceGold: 0, color: '#ff9f0a' },
  { id: 54, name: 'Cá chép', category: 'animal', time: '24h', priceXu: 300, priceGold: 0, color: '#ff375f' },
  { id: 55, name: 'Cừu', category: 'animal', time: '48h', priceXu: 1200, priceGold: 0, color: '#f2f2f7' },
  { id: 56, name: 'Vịt', category: 'animal', time: '24h', priceXu: 600, priceGold: 0, color: '#30d158' },
  { id: 58, name: 'Rùa', category: 'animal', time: '48h', priceXu: 1500, priceGold: 0, color: '#32d74b' },

  // --- MÓN ĂN (NHÀ BẾP) ---
  { id: 1, name: 'Bánh Trứng', category: 'cook', color: '#ffd60a' },
  { id: 2, name: 'Bánh sữa', category: 'cook', color: '#f2f2f7' },
  { id: 3, name: 'Cơm', category: 'cook', color: '#64d2ff' },
  { id: 4, name: 'Cơm Trứng', category: 'cook', color: '#ffd60a' },
  { id: 5, name: 'Cơm Cà rốt', category: 'cook', color: '#ff9500' },
  { id: 6, name: 'Nước ép trái cây', category: 'cook', color: '#ff9f0a' },
  { id: 7, name: 'Gỏi xoài', category: 'cook', color: '#ffd60a' },
  { id: 8, name: 'Sữa chua Khế', category: 'cook', color: '#ffd60a' },
  { id: 9, name: 'Trái cây dầm', category: 'cook', color: '#ff2d55' },
  { id: 10, name: 'Tinh dầu hướng dương', category: 'cook', color: '#ffd60a' },
  { id: 11, name: 'Nước Hoa', category: 'cook', color: '#bf5af2' },
  { id: 12, name: 'Sữa chua trái cây', category: 'cook', color: '#ff375f' },
  { id: 13, name: 'Trái cây dĩa', category: 'cook', color: '#30d158' },
  { id: 14, name: 'Salad khế', category: 'cook', color: '#32d74b' },
  { id: 15, name: 'Trà Đào', category: 'cook', color: '#ff9f0a' },
  { id: 16, name: 'Chè khúc bạch', category: 'cook', color: '#64d2ff' },
  { id: 17, name: 'Trà sữa trái cây', category: 'cook', color: '#c69c6d' },
  { id: 18, name: 'Kem Tươi', category: 'cook', color: '#ff7a85' },
  { id: 19, name: 'Hột vịt lộn', category: 'cook', color: '#ffd60a' },
  { id: 20, name: 'Kem chiên', category: 'cook', color: '#ffd60a' },
  { id: 22, name: 'Bò viên', category: 'cook', color: '#c69c6d' },
  { id: 23, name: 'Cá viên', category: 'cook', color: '#ff9f0a' },
  { id: 24, name: 'Bánh xèo', category: 'cook', color: '#ffd60a' },
  { id: 25, name: 'Pizza', category: 'cook', color: '#ff453a' },
  { id: 26, name: 'Nước ép dưa hấu', category: 'cook', color: '#ff375f' },
  { id: 27, name: 'Phô mai', category: 'cook', color: '#ffd60a' },
  { id: 28, name: 'Khoai Tây Chiên', category: 'cook', color: '#ff453a' },
  { id: 29, name: 'Bắp Chiên Bơ', category: 'cook', color: '#ffd60a' },
  { id: 30, name: 'Tương Cà Chua', category: 'cook', color: '#ff3b30' },
  { id: 33, name: 'Tương ớt', category: 'cook', color: '#ff453a' }
];

window.FARM_CATEGORIES = [
  { key: 'all', label: 'Tất cả' },
  { key: 'plant', label: 'Cây Trồng & Nông Sản' },
  { key: 'cook', label: 'Món Ăn Nhà Bếp' },
  { key: 'animal', label: 'Vật Nuôi & Thủy Sản' }
];
