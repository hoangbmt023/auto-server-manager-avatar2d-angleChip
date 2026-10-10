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

    public static final ModSchema UP_XU = new ModSchema();
    public static final ModSchema FISH = new ModSchema();
    public static final ModSchema CHIP_MIX = new ModSchema();

    static {
        // --- 1. ÁNH XẠ BẢN MOD UP XU (avatar_upxu_build34.jar) ---
        UP_XU.name = "Bản Up Xu (build34)";
        UP_XU.mainIdentifierClass = "gO";
        UP_XU.superIdentifierClass = "dL";

        UP_XU.loginClassName = "gO";
        UP_XU.loginSingletonMethod = "do";
        UP_XU.loginServerIdField = "try";
        UP_XU.loginServerNameField = "try";
        UP_XU.loginMethodName = "do";
        UP_XU.loginExtraGvClass = null;
        UP_XU.loginHasConstServerId = false;
        UP_XU.networkClassName = "I";
        UP_XU.networkSingletonMethod = "do";
        UP_XU.networkConnectedMethod = "do";

        UP_XU.canvasClasses = new String[] { "cA", "br" };
        UP_XU.dialogContainerClass = "br";
        UP_XU.dialogClass = "h";
        UP_XU.dialogPointerType = "bt";
        UP_XU.alertDialogClass = null;
        UP_XU.buttonClasses = new String[] { "ei" };

        UP_XU.playerContainerClasses = new String[] { "main.AngelChip", "go", "fE" };
        UP_XU.playerClassName = "dD";
        UP_XU.playerCoinsArrayField = "do";
        UP_XU.playerLockedGoldField = "do";
        UP_XU.playerNameFields = new String[] { "if", "do" };

        UP_XU.upThueClassName = "aQ";
        UP_XU.upThueSingletonMethod = "do";
        UP_XU.upThueFormatDateMethod = "goto";
        UP_XU.targetCoinsField = "for";
        UP_XU.earnedCoinsField = "do";
        UP_XU.collectedHeartsField = "if";
        UP_XU.upDaysField = "do";
        UP_XU.startedTsField = "if";
        UP_XU.startedAtStringField = "for";
        UP_XU.expiresAtStringField = "do";
        UP_XU.upThueSaveRmsClass = "el";
        UP_XU.upThueSaveRmsMethod = "if";
        UP_XU.upThueResetRmsMethod = "for";

        UP_XU.diamondClassName = "X";
        UP_XU.diamondSingletonMethod = "do";
        UP_XU.kcxCountField = "for";
        UP_XU.nhbCountField = "do";
        UP_XU.diamondIntervalField = "if";
        UP_XU.diamondTargetMsField = "if";
        UP_XU.diamondAbsTargetMsField = "do";
        UP_XU.diamondSellOreOnFullField = "int";
        UP_XU.diamondAutoDropKcxField = "for";
        UP_XU.diamondAutoDropNhbField = "do";
        UP_XU.diamondAutoFarmField = "new";
        UP_XU.diamondHarvestOnTimeField = "try";
        UP_XU.diamondPriorityOrderField = "if";
        UP_XU.diamondSaveMethod = "int";

        UP_XU.farmClassName = "aC";
        UP_XU.farmSingletonMethod = "do";
        UP_XU.farmBabyClassName = "bJ";
        UP_XU.farmModeField = "if";
        UP_XU.farmAnimalField = "do";
        UP_XU.farmFishField = "for";
        UP_XU.farmBackupDishesField = "do";
        UP_XU.farmBackupSeedsField = "for";
        UP_XU.farmReplaceSeedThresholdField = "char";
        UP_XU.farmSellProductsField = "if";
        UP_XU.farmSellThresholdField = "for";
        UP_XU.farmSellQuantityField = "byte";
        UP_XU.farmMaxStarfruitLevelField = "try";
        UP_XU.farmDailyAttendanceField = "for";
        UP_XU.farmUpgradeStarfruitField = "if";
        UP_XU.farmHatchDragonField = "new";
        UP_XU.farmTrainDragonField = "do";
        UP_XU.farmDeliverOrdersField = "try";
        UP_XU.farmNoBuyWithGoldField = "int";
        UP_XU.farmHarvestHeartsField = "new";
        UP_XU.farmFeedBabyField = "for";
        UP_XU.farmBuyMilkWithGoldField = "do";
        UP_XU.farmUpgradeBabyField = "if";
        UP_XU.farmSaveMethod = "else";
        UP_XU.farmDiamondTimerMethod = "goto";
        UP_XU.farmFishTimerMethod = "goto";

        // Auto Bán Đá (Up Xu build 34: al.class / JewelSettings)
        UP_XU.sellOreClassName = "al";
        UP_XU.sellOreIntervalField = "try";
        UP_XU.sellOreDelayMsField = "for";
        UP_XU.sellOreZoneFromField = "int";
        UP_XU.sellOreZoneToField = "for";
        UP_XU.sellOreResetNhbField = "do";
        UP_XU.sellOreResetKcxField = "for";
        UP_XU.sellOreDropNhbField = "if";
        UP_XU.sellOreDropKcxField = "int";
        UP_XU.sellOreSaveMethod = "do";
        UP_XU.sellOreTaskClassName = "al";
        UP_XU.sellOreTargetMsField = "if";
        UP_XU.sellOreStartMsField = "do";
        UP_XU.zoneClassName = "fE";
        UP_XU.zoneField = "for";

        UP_XU.taskControllerClassName = "bP";
        UP_XU.taskArgClassName = "fQ";
        UP_XU.taskStartMethod = "do";
        UP_XU.taskStopMethod = "if";
        UP_XU.taskReturnMethod = "try";
        UP_XU.activeTaskField = "do";
        UP_XU.farmTaskClassName = "aC";
        UP_XU.diamondTaskClassName = "X";
        UP_XU.fishTaskClassName = "";
        UP_XU.farmTraderTaskClassName = "";

        // --- 2. ÁNH XẠ BẢN MOD CÂU CÁ (avatar_fish_build40.jar) ---
        FISH.name = "Bản Câu Cá (build40)";
        FISH.mainIdentifierClass = "fK";
        FISH.superIdentifierClass = "en";

        FISH.loginClassName = "fK";
        FISH.loginSingletonMethod = "do";
        FISH.loginServerIdField = "const";
        FISH.loginServerNameField = "try";
        FISH.loginMethodName = "do";
        FISH.loginExtraGvClass = "gV";
        FISH.loginHasConstServerId = true;
        FISH.networkClassName = "ae";
        FISH.networkSingletonMethod = "do";
        FISH.networkConnectedMethod = "do";

        FISH.canvasClasses = new String[] { "cA", "bx" };
        FISH.dialogContainerClass = "bx";
        FISH.dialogClass = "s";
        FISH.dialogPointerType = "dJ";
        FISH.alertDialogClass = "fA";
        FISH.buttonClasses = new String[] { "fL" };

        FISH.playerContainerClasses = new String[] { "main.AngelChip", "go" };
        FISH.playerClassName = "ef";
        FISH.playerCoinsArrayField = "do";
        FISH.playerLockedGoldField = "do";
        FISH.playerNameFields = new String[] { "if", "do" };

        FISH.upThueClassName = "aQ";
        FISH.upThueSingletonMethod = "do";
        FISH.upThueFormatDateMethod = "try";
        FISH.targetCoinsField = "int";
        FISH.earnedCoinsField = "if";
        FISH.collectedHeartsField = "for";
        FISH.upDaysField = "for";
        FISH.startedTsField = "int";
        FISH.startedAtStringField = "for";
        FISH.expiresAtStringField = "if";
        FISH.upThueSaveRmsClass = "cp";
        FISH.upThueSaveRmsMethod = "if";
        FISH.upThueResetRmsMethod = "for";

        FISH.diamondClassName = "aj";
        FISH.diamondSingletonMethod = "do";
        FISH.kcxCountField = "do";
        FISH.nhbCountField = "for";
        FISH.diamondIntervalField = "if";
        FISH.diamondTargetMsField = "if";
        FISH.diamondAbsTargetMsField = "do";
        FISH.diamondSellOreOnFullField = "do";
        FISH.diamondAutoDropKcxField = "int";
        FISH.diamondAutoDropNhbField = "new";
        FISH.diamondAutoFarmField = "try";
        FISH.diamondHarvestOnTimeField = "for";
        FISH.diamondPriorityOrderField = "if";
        FISH.diamondSaveMethod = "int";

        FISH.farmClassName = "bq";
        FISH.farmSingletonMethod = "do";
        FISH.farmBabyClassName = "bP";
        FISH.farmModeField = "do";
        FISH.farmAnimalField = "for";
        FISH.farmFishField = "if";
        FISH.farmBackupDishesField = "for";
        FISH.farmBackupSeedsField = "do";
        FISH.farmReplaceSeedThresholdField = "char";
        FISH.farmSellProductsField = "if";
        FISH.farmSellThresholdField = "goto";
        FISH.farmSellQuantityField = "else";
        FISH.farmMaxStarfruitLevelField = "byte";
        FISH.farmDailyAttendanceField = "this";
        FISH.farmUpgradeStarfruitField = "char";
        FISH.farmHatchDragonField = "goto";
        FISH.farmTrainDragonField = "else";
        FISH.farmDeliverOrdersField = "void";
        FISH.farmNoBuyWithGoldField = "long";
        FISH.farmHarvestHeartsField = "try";
        FISH.farmFeedBabyField = "new";
        FISH.farmBuyMilkWithGoldField = "int";
        FISH.farmUpgradeBabyField = "if";
        FISH.farmSaveMethod = "goto";
        FISH.farmDiamondTimerMethod = "byte";
        FISH.farmFishTimerMethod = "break";

        // Auto Câu Cá (Fish build 40: bS.class / _fish_settings)
        FISH.fishClassName = "bS";
        FISH.fishMapField = "if";
        FISH.fishRodField = "do";
        FISH.fishSellTypeField = "for";
        FISH.fishExcludeField = "do";
        FISH.fishAutoBuyTicketField = "do";
        FISH.fishBackToFarmField = "if";
        FISH.fishFarmIntervalField = "case";
        FISH.fishHarvestOnTimeField = "for";
        FISH.fishSellKcxField = "int";
        FISH.fishSellKcxThresholdField = "do";
        FISH.fishSaveMethod = "byte";
        FISH.fishTaskClassName = "bS";
        FISH.fishSingletonMethod = "do";
        FISH.fishTargetMsField = "if";
        FISH.fishCaughtField = "try";
        FISH.fishSharkCountField = "for";
        FISH.fishKcxCountField = "new";

        // Auto Bán Đá (Fish build 40: c.class / JewelSettings)
        FISH.sellOreClassName = "c";
        FISH.sellOreIntervalField = "try";
        FISH.sellOreDelayMsField = "do";
        FISH.sellOreZoneFromField = "for";
        FISH.sellOreZoneToField = "int";
        FISH.sellOreResetNhbField = "do";
        FISH.sellOreResetKcxField = "for";
        FISH.sellOreDropNhbField = "int";
        FISH.sellOreDropKcxField = "if";
        FISH.sellOreSaveMethod = "do";
        FISH.sellOreTaskClassName = "c";
        FISH.sellOreTargetMsField = "if";
        FISH.sellOreStartMsField = "for";
        FISH.zoneClassName = "go";
        FISH.zoneField = "do";

        FISH.taskControllerClassName = "bX";
        FISH.taskArgClassName = "ha";
        FISH.taskStartMethod = "do";
        FISH.taskStopMethod = "new";
        FISH.taskReturnMethod = "for";
        FISH.activeTaskField = "do";
        FISH.farmTaskClassName = "bq";
        FISH.diamondTaskClassName = "aj";
        FISH.farmTraderTaskClassName = "hn";

        // --- 3. ÁNH XẠ BẢN MOD CHIPMIX FULL (Avatar_ChipMix_Full_build13.jar) ---
        CHIP_MIX.name = "Bản ChipMix Full (build13)";
        CHIP_MIX.mainIdentifierClass = "LichRunner";
        CHIP_MIX.superIdentifierClass = "java.lang.Object";

        CHIP_MIX.loginClassName = "fO";
        CHIP_MIX.loginSingletonMethod = "do";
        CHIP_MIX.loginServerIdField = "for";
        CHIP_MIX.loginServerNameField = "for";
        CHIP_MIX.loginMethodName = "do";
        CHIP_MIX.loginExtraGvClass = "gX";
        CHIP_MIX.loginHasConstServerId = false;
        CHIP_MIX.networkClassName = "ag";
        CHIP_MIX.networkSingletonMethod = "do";
        CHIP_MIX.networkConnectedMethod = "do";

        CHIP_MIX.canvasClasses = new String[] { "cA", "bx" };
        CHIP_MIX.dialogContainerClass = "bx";
        CHIP_MIX.dialogClass = "t";
        CHIP_MIX.dialogPointerType = "dL";
        CHIP_MIX.alertDialogClass = "t";
        CHIP_MIX.buttonClasses = new String[] { "fN", "fn" };

        CHIP_MIX.playerContainerClasses = new String[] { "main.AngelChip", "go" };
        CHIP_MIX.playerClassName = "eh";
        CHIP_MIX.playerCoinsArrayField = "do";
        CHIP_MIX.playerLockedGoldField = "do";
        CHIP_MIX.playerNameFields = new String[] { "if", "do", "for", "int" };

        CHIP_MIX.upThueClassName = "aQ";
        CHIP_MIX.upThueSingletonMethod = "do";
        CHIP_MIX.upThueFormatDateMethod = "do";
        CHIP_MIX.targetCoinsField = "if";
        CHIP_MIX.earnedCoinsField = "for";
        CHIP_MIX.collectedHeartsField = "int";
        CHIP_MIX.upDaysField = "do";
        CHIP_MIX.startedTsField = "int";
        CHIP_MIX.startedAtStringField = "if";
        CHIP_MIX.expiresAtStringField = "for";
        CHIP_MIX.upThueSaveRmsClass = "cs";
        CHIP_MIX.upThueSaveRmsMethod = "do";
        CHIP_MIX.upThueResetRmsMethod = "if";

        CHIP_MIX.diamondClassName = "al";
        CHIP_MIX.diamondSingletonMethod = "do";
        CHIP_MIX.kcxCountField = "if";
        CHIP_MIX.nhbCountField = "for";
        CHIP_MIX.diamondIntervalField = "do";
        CHIP_MIX.diamondTargetMsField = "do";
        CHIP_MIX.diamondAbsTargetMsField = "if";
        CHIP_MIX.diamondSellOreOnFullField = "int";
        CHIP_MIX.diamondAutoDropKcxField = "new";
        CHIP_MIX.diamondAutoDropNhbField = "do";
        CHIP_MIX.diamondAutoFarmField = "try";
        CHIP_MIX.diamondHarvestOnTimeField = "if";
        CHIP_MIX.diamondPriorityOrderField = "do";
        CHIP_MIX.diamondSaveMethod = "new";

        CHIP_MIX.farmClassName = "bt";
        CHIP_MIX.farmSingletonMethod = "do";
        CHIP_MIX.farmBabyClassName = "bP";
        CHIP_MIX.farmModeField = "do";
        CHIP_MIX.farmAnimalField = "if";
        CHIP_MIX.farmFishField = "for";
        CHIP_MIX.farmBackupDishesField = "if";
        CHIP_MIX.farmBackupSeedsField = "for";
        CHIP_MIX.farmReplaceSeedThresholdField = "new";
        CHIP_MIX.farmSellProductsField = "do";
        CHIP_MIX.farmSellThresholdField = "byte";
        CHIP_MIX.farmSellQuantityField = "case";
        CHIP_MIX.farmMaxStarfruitLevelField = "try";
        CHIP_MIX.farmDailyAttendanceField = "this";
        CHIP_MIX.farmUpgradeStarfruitField = "else";
        CHIP_MIX.farmHatchDragonField = "char";
        CHIP_MIX.farmTrainDragonField = "long";
        CHIP_MIX.farmDeliverOrdersField = "goto";
        CHIP_MIX.farmNoBuyWithGoldField = "void";
        CHIP_MIX.farmHarvestHeartsField = "do";
        CHIP_MIX.farmFeedBabyField = "new";
        CHIP_MIX.farmBuyMilkWithGoldField = "int";
        CHIP_MIX.farmUpgradeBabyField = "try";
        CHIP_MIX.farmSaveMethod = "this";
        CHIP_MIX.farmDiamondTimerMethod = "final";
        CHIP_MIX.farmFishTimerMethod = "catch";

        CHIP_MIX.fishClassName = "bS";
        CHIP_MIX.fishMapField = "do";
        CHIP_MIX.fishRodField = "if";
        CHIP_MIX.fishSellTypeField = "for";
        CHIP_MIX.fishExcludeField = "do";
        CHIP_MIX.fishAutoBuyTicketField = "for";
        CHIP_MIX.fishBackToFarmField = "do";
        CHIP_MIX.fishFarmIntervalField = "case";
        CHIP_MIX.fishHarvestOnTimeField = "if";
        CHIP_MIX.fishSellKcxField = "int";
        CHIP_MIX.fishSellKcxThresholdField = "int";
        CHIP_MIX.fishSaveMethod = "byte";
        CHIP_MIX.fishTaskClassName = "bS";
        CHIP_MIX.fishSingletonMethod = "do";
        CHIP_MIX.fishTargetMsField = "do";
        CHIP_MIX.fishCaughtField = "new";
        CHIP_MIX.fishSharkCountField = "do";
        CHIP_MIX.fishKcxCountField = "try";

        CHIP_MIX.sellOreClassName = "d";
        CHIP_MIX.sellOreIntervalField = "new";
        CHIP_MIX.sellOreDelayMsField = "for";
        CHIP_MIX.sellOreZoneFromField = "try";
        CHIP_MIX.sellOreZoneToField = "int";
        CHIP_MIX.sellOreResetNhbField = "if";
        CHIP_MIX.sellOreResetKcxField = "for";
        CHIP_MIX.sellOreDropNhbField = "int";
        CHIP_MIX.sellOreDropKcxField = "do";
        CHIP_MIX.sellOreSaveMethod = "do";
        CHIP_MIX.sellOreTaskClassName = "d";
        CHIP_MIX.sellOreTargetMsField = "if";
        CHIP_MIX.sellOreStartMsField = "do";
        CHIP_MIX.zoneClassName = "gs";
        CHIP_MIX.zoneField = "int";

        CHIP_MIX.taskControllerClassName = "bX";
        CHIP_MIX.taskArgClassName = "hc";
        CHIP_MIX.taskStartMethod = "do";
        CHIP_MIX.taskStopMethod = "try";
        CHIP_MIX.taskReturnMethod = "do";
        CHIP_MIX.activeTaskField = "do";
        CHIP_MIX.farmTaskClassName = "bt";
        CHIP_MIX.diamondTaskClassName = "al";
        CHIP_MIX.fishTaskClassName = "bS";
        CHIP_MIX.farmTraderTaskClassName = "hp";
    }

    /**
     * Lấy schema phù hợp với ModType
     */
    public static ModSchema getSchema(ModType type) {
        if (type == ModType.CHIP_MIX) return CHIP_MIX;
        if (type == ModType.FISH) return FISH;
        return UP_XU; // Mặc định Up Xu
    }
}
