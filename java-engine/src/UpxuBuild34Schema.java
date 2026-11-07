/**
 * UpxuBuild34Schema
 * 
 * Strategy implementation for the Up Xu mod (avatar_upxu_build34.jar).
 */
public class UpxuBuild34Schema implements IModSchema {

    @Override
    public ModSchema.ModType getType() {
        return ModSchema.ModType.UP_XU;
    }

    @Override
    public String getName() {
        return "Bản Up Xu (build34)";
    }

    @Override
    public ModSchema createSchema() {
        ModSchema schema = new ModSchema();
        schema.name = getName();
        schema.mainIdentifierClass = "gO";
        schema.superIdentifierClass = "dL";

        schema.loginClassName = "gO";
        schema.loginSingletonMethod = "do";
        schema.loginServerIdField = "try";
        schema.loginServerNameField = "try";
        schema.loginMethodName = "do";
        schema.loginExtraGvClass = null;
        schema.loginHasConstServerId = false;
        schema.networkClassName = "I";
        schema.networkSingletonMethod = "do";
        schema.networkConnectedMethod = "do";

        schema.canvasClasses = new String[] { "cA", "br" };
        schema.dialogContainerClass = "br";
        schema.dialogClass = "h";
        schema.dialogPointerType = "bt";
        schema.alertDialogClass = null;
        schema.buttonClasses = new String[] { "ei" };

        schema.playerContainerClasses = new String[] { "main.AngelChip", "go", "fE" };
        schema.playerClassName = "dD";
        schema.playerCoinsArrayField = "do";
        schema.playerLockedGoldField = "do";
        schema.playerNameFields = new String[] { "if", "do" };

        schema.upThueClassName = "aQ";
        schema.upThueSingletonMethod = "do";
        schema.upThueFormatDateMethod = "goto";
        schema.targetCoinsField = "for";
        schema.earnedCoinsField = "do";
        schema.collectedHeartsField = "if";
        schema.upDaysField = "do";
        schema.startedTsField = "if";
        schema.startedAtStringField = "for";
        schema.expiresAtStringField = "do";
        schema.upThueSaveRmsClass = "el";
        schema.upThueSaveRmsMethod = "if";
        schema.upThueResetRmsMethod = "for";

        schema.diamondClassName = "X";
        schema.diamondSingletonMethod = "do";
        schema.kcxCountField = "for";
        schema.nhbCountField = "do";
        schema.diamondIntervalField = "if";
        schema.diamondTargetMsField = "if";
        schema.diamondAbsTargetMsField = "do";
        schema.diamondSellOreOnFullField = "int";
        schema.diamondAutoDropKcxField = "for";
        schema.diamondAutoDropNhbField = "do";
        schema.diamondAutoFarmField = "new";
        schema.diamondHarvestOnTimeField = "try";
        schema.diamondPriorityOrderField = "if";
        schema.diamondSaveMethod = "int";

        schema.farmClassName = "aC";
        schema.farmSingletonMethod = "do";
        schema.farmBabyClassName = "bJ";
        schema.farmModeField = "if";
        schema.farmAnimalField = "do";
        schema.farmFishField = "for";
        schema.farmBackupDishesField = "do";
        schema.farmBackupSeedsField = "for";
        schema.farmReplaceSeedThresholdField = "char";
        schema.farmSellProductsField = "if";
        schema.farmSellThresholdField = "for";
        schema.farmSellQuantityField = "byte";
        schema.farmMaxStarfruitLevelField = "try";
        schema.farmDailyAttendanceField = "for";
        schema.farmUpgradeStarfruitField = "if";
        schema.farmHatchDragonField = "new";
        schema.farmTrainDragonField = "do";
        schema.farmDeliverOrdersField = "try";
        schema.farmNoBuyWithGoldField = "int";
        schema.farmHarvestHeartsField = "new";
        schema.farmFeedBabyField = "for";
        schema.farmBuyMilkWithGoldField = "do";
        schema.farmUpgradeBabyField = "if";
        schema.farmSaveMethod = "else";
        schema.farmDiamondTimerMethod = "goto";
        schema.farmFishTimerMethod = "goto";

        // Auto Bán Đá
        schema.sellOreClassName = "al";
        schema.sellOreIntervalField = "try";
        schema.sellOreDelayMsField = "for";
        schema.sellOreZoneFromField = "int";
        schema.sellOreZoneToField = "for";
        schema.sellOreResetNhbField = "for";
        schema.sellOreResetKcxField = "do";
        schema.sellOreDropNhbField = "int";
        schema.sellOreDropKcxField = "if";
        schema.sellOreSaveMethod = "do";
        schema.sellOreTaskClassName = "al";
        schema.sellOreTargetMsField = "if";
        schema.sellOreStartMsField = "do";
        schema.zoneClassName = "fE";
        schema.zoneField = "for";

        schema.taskControllerClassName = "bP";
        schema.taskArgClassName = "fQ";
        schema.taskStartMethod = "do";
        schema.taskStopMethod = "if";
        schema.taskReturnMethod = "try";
        schema.activeTaskField = "do";
        schema.farmTaskClassName = "aC";
        schema.diamondTaskClassName = "X";
        schema.fishTaskClassName = "";
        schema.farmTraderTaskClassName = "";

        return schema;
    }
}
