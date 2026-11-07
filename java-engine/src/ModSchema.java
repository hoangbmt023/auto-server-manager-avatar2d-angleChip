import java.util.HashMap;
import java.util.Map;

/**
 * ModSchema
 * 
 * BẢNG ÁNH XẠ CHUYỂN ĐỔI BIẾN & LỚP (SCHEMA MAPPING REGISTRY)
 * 
 * Toàn bộ các tên lớp, tên hàm và tên biến bị làm rối (obfuscated)
 * được quy tụ tại 1 FILE DUY NHẤT này.
 * Khi game mod đổi phiên bản hoặc đổi cách làm rối (ProGuard),
 * bạn CHỈ CẦN cập nhật các chuỗi định danh trong file này!
 */
public class ModSchema {

    public enum ModType {
        UP_XU,     // Bản mod up xu (avatar_upxu_build34.jar)
        FISH,      // Bản mod câu cá (avatar_fish_build40.jar)
        CHIP_MIX,  // Bản mod ChipMix Full (Avatar_ChipMix_Full_build13.jar)
        UNKNOWN
    }

    // =========================================================================
    // CẤU TRÚC ĐỊNH NGHĨA ÁNH XẠ (MAPPING DEFINITION)
    // =========================================================================

    public String name;

    // 0. NHẬN DIỆN LOẠI MOD (DETECTION)
    public String mainIdentifierClass;
    public String superIdentifierClass;

    // 1. ĐĂNG NHẬP & KẾT NỐI (LOGIN & NETWORK)
    public String loginClassName;
    public String loginSingletonMethod;
    public String loginServerIdField;
    public String loginServerNameField;
    public String loginMethodName;
    public String loginExtraGvClass;
    public boolean loginHasConstServerId;
    public String networkClassName;
    public String networkSingletonMethod;
    public String networkConnectedMethod;

    // 2. HỘP THOẠI & THÔNG BÁO (DIALOGS & POPUPS)
    public String[] canvasClasses;
    public String dialogContainerClass;
    public String dialogClass;
    public String dialogPointerType;
    public String alertDialogClass;
    public String[] buttonClasses;

    // 3. NHÂN VẬT & TIỀN TỆ (PLAYER STATS)
    public String[] playerContainerClasses;
    public String playerClassName;
    public String playerCoinsArrayField;
    public String playerLockedGoldField;
    public String[] playerNameFields;

    // 4. CÀI ĐẶT UP THUÊ & THỐNG KÊ (UP THUÊ & RENTAL STATS)
    public String upThueClassName;
    public String upThueSingletonMethod;
    public String upThueFormatDateMethod;
    public String targetCoinsField;
    public String earnedCoinsField;
    public String collectedHeartsField;
    public String upDaysField;
    public String startedTsField;
    public String startedAtStringField;
    public String expiresAtStringField;
    public String upThueSaveRmsClass;
    public String upThueSaveRmsMethod;
    public String upThueResetRmsMethod;

    // 5. AUTO KIM CƯƠNG (DIAMOND STATS & SETTINGS)
    public String diamondClassName;
    public String diamondSingletonMethod;
    public String kcxCountField;
    public String nhbCountField;
    public String diamondIntervalField;
    public String diamondTargetMsField;
    public String diamondAbsTargetMsField;
    public String diamondSellOreOnFullField;
    public String diamondAutoDropKcxField;
    public String diamondAutoDropNhbField;
    public String diamondAutoFarmField;
    public String diamondHarvestOnTimeField;
    public String diamondPriorityOrderField;
    public String diamondSaveMethod;

    // 6. AUTO FARM (FARM SETTINGS & CONTROLLER)
    public String farmClassName;
    public String farmSingletonMethod;
    public String farmBabyClassName;
    public String farmModeField;
    public String farmAnimalField;
    public String farmFishField;
    public String farmBackupDishesField;
    public String farmBackupSeedsField;
    public String farmReplaceSeedThresholdField;
    public String farmSellProductsField;
    public String farmSellThresholdField;
    public String farmSellQuantityField;
    public String farmMaxStarfruitLevelField;
    public String farmDailyAttendanceField;
    public String farmUpgradeStarfruitField;
    public String farmHatchDragonField;
    public String farmTrainDragonField;
    public String farmDeliverOrdersField;
    public String farmNoBuyWithGoldField;
    public String farmHarvestHeartsField;
    public String farmFeedBabyField;
    public String farmBuyMilkWithGoldField;
    public String farmUpgradeBabyField;
    public String farmSaveMethod;
    public String farmDiamondTimerMethod;
    public String farmFishTimerMethod;

    // 7. AUTO CÂU CÁ (FISH SETTINGS & LIVE STATS)
    public String fishClassName;
    public String fishMapField;
    public String fishRodField;
    public String fishSellTypeField;
    public String fishExcludeField;
    public String fishAutoBuyTicketField;
    public String fishBackToFarmField;
    public String fishFarmIntervalField;
    public String fishHarvestOnTimeField;
    public String fishSellKcxField;
    public String fishSellKcxThresholdField;
    public String fishSaveMethod;
    public String fishSingletonMethod;
    public String fishTargetMsField;
    public String fishCaughtField;
    public String fishSharkCountField;
    public String fishKcxCountField;

    // 8. AUTO BÁN ĐÁ (SELL ORE / STONE SETTINGS & LIVE STATS)
    public String sellOreClassName;
    public String sellOreIntervalField;
    public String sellOreDelayMsField;
    public String sellOreZoneFromField;
    public String sellOreZoneToField;
    public String sellOreResetNhbField;
    public String sellOreResetKcxField;
    public String sellOreDropNhbField;
    public String sellOreDropKcxField;
    public String sellOreSaveMethod;
    public String sellOreTaskClassName;
    public String sellOreTargetMsField;
    public String sellOreStartMsField;
    public String zoneClassName;
    public String zoneField;

    // 9. ĐIỀU KHIỂN TIẾN TRÌNH AUTO (TASK EXECUTION)
    public String taskControllerClassName;
    public String taskArgClassName;
    public String taskStartMethod;
    public String taskStopMethod;
    public String taskReturnMethod;
    public String activeTaskField;
    public String farmTaskClassName;
    public String diamondTaskClassName;
    public String fishTaskClassName;
    public String farmTraderTaskClassName;

    // =========================================================================
    // CÁC BỘ ÁNH XẠ MẪU CHO TỪNG BẢN MOD (PRESET REGISTRY)
    // =========================================================================

    public static final ModSchema UP_XU = ModSchemaFactory.getSchema(ModType.UP_XU);
    public static final ModSchema FISH = ModSchemaFactory.getSchema(ModType.FISH);
    public static final ModSchema CHIP_MIX = ModSchemaFactory.getSchema(ModType.CHIP_MIX);

    /**
     * Lấy schema phù hợp với ModType thông qua ModSchemaFactory
     */
    public static ModSchema getSchema(ModType type) {
        return ModSchemaFactory.getSchema(type);
    }
}
