/**
 * FishBuild40Schema
 * 
 * Strategy implementation for the Fish mod (avatar_fish_build40.jar).
 */
public class FishBuild40Schema implements IModSchema {

    @Override
    public ModSchema.ModType getType() {
        return ModSchema.ModType.FISH;
    }

    @Override
    public String getName() {
        return "Bản Câu Cá (build40)";
    }

    @Override
    public ModSchema createSchema() {
        ModSchema schema = new ModSchema();
        schema.name = getName();
        schema.mainIdentifierClass = "fK";
        schema.superIdentifierClass = "en";

        schema.loginClassName = "fK";
        schema.loginSingletonMethod = "do";
        schema.loginServerIdField = "const";
        schema.loginServerNameField = "try";
        schema.loginMethodName = "do";
        schema.loginExtraGvClass = "gV";
        schema.loginHasConstServerId = true;
        schema.networkClassName = "ae";
        schema.networkSingletonMethod = "do";
        schema.networkConnectedMethod = "do";

        schema.canvasClasses = new String[] { "cA", "bx" };
        schema.dialogContainerClass = "bx";
        schema.dialogClass = "s";
        schema.dialogPointerType = "dJ";
        schema.alertDialogClass = "fA";
        schema.buttonClasses = new String[] { "fL" };

        schema.playerContainerClasses = new String[] { "main.AngelChip", "go" };
        schema.playerClassName = "ef";
        schema.playerCoinsArrayField = "do";
        schema.playerLockedGoldField = "do";
        schema.playerNameFields = new String[] { "if", "do" };

        schema.upThueClassName = "aQ";
        schema.upThueSingletonMethod = "do";
        schema.upThueFormatDateMethod = "try";
        schema.targetCoinsField = "int";
        schema.earnedCoinsField = "if";
        schema.collectedHeartsField = "for";
        schema.upDaysField = "for";
        schema.startedTsField = "int";
        schema.startedAtStringField = "for";
        schema.expiresAtStringField = "if";
        schema.upThueSaveRmsClass = "cp";
        schema.upThueSaveRmsMethod = "if";
        schema.upThueResetRmsMethod = "for";

        schema.diamondClassName = "aj";
        schema.diamondSingletonMethod = "do";
        schema.kcxCountField = "do";
        schema.nhbCountField = "for";
        schema.diamondIntervalField = "if";
        schema.diamondTargetMsField = "if";
        schema.diamondAbsTargetMsField = "do";
        schema.diamondSellOreOnFullField = "do";
        schema.diamondAutoDropKcxField = "int";
        schema.diamondAutoDropNhbField = "new";
        schema.diamondAutoFarmField = "try";
        schema.diamondHarvestOnTimeField = "for";
        schema.diamondPriorityOrderField = "if";
        schema.diamondSaveMethod = "int";

        schema.farmClassName = "bq";
        schema.farmSingletonMethod = "do";
        schema.farmBabyClassName = "bP";
        schema.farmModeField = "do";
        schema.farmAnimalField = "for";
        schema.farmFishField = "if";
        schema.farmBackupDishesField = "for";
        schema.farmBackupSeedsField = "do";
        schema.farmReplaceSeedThresholdField = "char";
        schema.farmSellProductsField = "if";
        schema.farmSellThresholdField = "goto";
        schema.farmSellQuantityField = "else";
        schema.farmMaxStarfruitLevelField = "byte";
        schema.farmDailyAttendanceField = "this";
        schema.farmUpgradeStarfruitField = "char";
        schema.farmHatchDragonField = "goto";
        schema.farmTrainDragonField = "else";
        schema.farmDeliverOrdersField = "void";
        schema.farmNoBuyWithGoldField = "long";
        schema.farmHarvestHeartsField = "try";
        schema.farmFeedBabyField = "new";
        schema.farmBuyMilkWithGoldField = "int";
        schema.farmUpgradeBabyField = "if";
        schema.farmSaveMethod = "goto";
        schema.farmDiamondTimerMethod = "byte";
        schema.farmFishTimerMethod = "break";

        // Auto Câu Cá
        schema.fishClassName = "bS";
        schema.fishMapField = "if";
        schema.fishRodField = "do";
        schema.fishSellTypeField = "for";
        schema.fishExcludeField = "do";
        schema.fishAutoBuyTicketField = "do";
        schema.fishBackToFarmField = "if";
        schema.fishFarmIntervalField = "case";
        schema.fishHarvestOnTimeField = "for";
        schema.fishSellKcxField = "int";
        schema.fishSellKcxThresholdField = "do";
        schema.fishSaveMethod = "byte";
        schema.fishTaskClassName = "bS";
        schema.fishSingletonMethod = "do";
        schema.fishTargetMsField = "if";
        schema.fishCaughtField = "try";
        schema.fishSharkCountField = "for";
        schema.fishKcxCountField = "new";

        // Auto Bán Đá
        schema.sellOreClassName = "c";
        schema.sellOreIntervalField = "try";
        schema.sellOreDelayMsField = "do";
        schema.sellOreZoneFromField = "for";
        schema.sellOreZoneToField = "int";
        schema.sellOreResetNhbField = "for";
        schema.sellOreResetKcxField = "do";
        schema.sellOreDropNhbField = "if";
        schema.sellOreDropKcxField = "int";
        schema.sellOreSaveMethod = "do";
        schema.sellOreTaskClassName = "c";
        schema.sellOreTargetMsField = "if";
        schema.sellOreStartMsField = "for";
        schema.zoneClassName = "go";
        schema.zoneField = "do";

        schema.taskControllerClassName = "bX";
        schema.taskArgClassName = "ha";
        schema.taskStartMethod = "do";
        schema.taskStopMethod = "new";
        schema.taskReturnMethod = "for";
        schema.activeTaskField = "do";
        schema.farmTaskClassName = "bq";
        schema.diamondTaskClassName = "aj";
        schema.fishTaskClassName = "bS";
        schema.farmTraderTaskClassName = "hn";

        return schema;
    }
}
