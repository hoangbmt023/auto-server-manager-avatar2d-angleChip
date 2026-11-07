-- Migration: 0002_upgrade_proxies_and_lifecycle.sql
-- Description: Upgrade proxies and accounts table with lifecycle management fields and create proxy_migration_logs table

-- 1. Upgrade proxies table
ALTER TABLE `proxies`
  ADD COLUMN IF NOT EXISTS `external_id` VARCHAR(50) NULL COMMENT 'idproxy trả về từ proxy.vn' AFTER `id`,
  ADD COLUMN IF NOT EXISTS `provider` ENUM('PROXY_VN', 'MANUAL') NOT NULL DEFAULT 'PROXY_VN' AFTER `external_id`,
  ADD COLUMN IF NOT EXISTS `proxy_category` VARCHAR(30) NOT NULL DEFAULT 'DatacenterA' COMMENT 'Loại proxy lúc mua (DatacenterA, Viettel, VNPT, FPT)' AFTER `provider`,
  ADD COLUMN IF NOT EXISTS `tier` ENUM('CORE', 'DYNAMIC') NOT NULL DEFAULT 'DYNAMIC' COMMENT 'CORE: Mua dài hạn; DYNAMIC: Co giãn 30 ngày' AFTER `type`,
  ADD COLUMN IF NOT EXISTS `status` ENUM('ACTIVE', 'DRAINING', 'EXPIRED') NOT NULL DEFAULT 'ACTIVE' COMMENT 'Trạng thái vòng đời' AFTER `tier`,
  ADD COLUMN IF NOT EXISTS `max_slots` INT NOT NULL DEFAULT 6 COMMENT 'Mặc định 6, mở lên 7 khi có slot khẩn cấp' AFTER `status`,
  ADD COLUMN IF NOT EXISTS `expires_at` DATETIME NULL COMMENT 'Thời điểm hết hạn thực tế trên proxy.vn' AFTER `max_slots`,
  ADD COLUMN IF NOT EXISTS `last_rotated_at` DATETIME NULL COMMENT 'Chặn gọi doiproxy.php liên tục (Cooldown 10 phút)' AFTER `last_checked`;

ALTER TABLE `proxies`
  ADD INDEX IF NOT EXISTS `idx_proxies_status_expires` (`status`, `expires_at`),
  ADD INDEX IF NOT EXISTS `idx_proxies_external_id` (`external_id`);

-- 2. Upgrade accounts table
ALTER TABLE `accounts`
  ADD COLUMN IF NOT EXISTS `is_emergency_slot` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '1 nếu đang ngồi ở slot khẩn cấp thứ 7' AFTER `ip_slot`;

-- 3. Create proxy_migration_logs table
CREATE TABLE IF NOT EXISTS `proxy_migration_logs` (
  `id` VARCHAR(50) NOT NULL PRIMARY KEY,
  `account_id` VARCHAR(50) NOT NULL,
  `from_proxy_id` VARCHAR(50) NOT NULL,
  `to_proxy_id` VARCHAR(50) NOT NULL,
  `from_server_id` TINYINT NOT NULL,
  `to_server_id` TINYINT NOT NULL,
  `is_emergency` TINYINT(1) NOT NULL DEFAULT 0,
  `reason` VARCHAR(255) NOT NULL,
  `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  INDEX `idx_pml_account` (`account_id`),
  INDEX `idx_pml_created` (`created_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
