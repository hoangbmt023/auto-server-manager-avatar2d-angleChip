/**
 * ChipMixBuild13Schema
 * 
 * Strategy implementation for the ChipMix Full mod (Avatar_ChipMix_Full_build13.jar).
 */
public class ChipMixBuild13Schema implements IModSchema {

    @Override
    public ModSchema.ModType getType() {
        return ModSchema.ModType.CHIP_MIX;
    }

    @Override
    public String getName() {
        return "Bản ChipMix Full (build13)";
    }

    @Override
    public ModSchema createSchema() {
        ModSchema schema = new ModSchema();
        schema.name = getName();
        schema.mainIdentifierClass = "LichRunner";
        schema.superIdentifierClass = "java.lang.Object";

        schema.loginClassName = "fO";
        schema.loginSingletonMethod = "do";
        schema.loginServerIdField = "for";
        schema.loginServerNameField = "for";
        schema.loginMethodName = "do";
        schema.loginExtraGvClass = "gX";
        schema.loginHasConstServerId = false;
        schema.networkClassName = "ag";
        schema.networkSingletonMethod = "do";
        schema.networkConnectedMethod = "do";

        schema.canvasClasses = new String[] { "cA", "bx" };
        schema.dialogContainerClass = "bx";
        schema.dialogClass = "t";
        schema.dialogPointerType = "dL";
        schema.alertDialogClass = "t";
        schema.buttonClasses = new String[] { "fN", "fn" };

        schema.playerContainerClasses = new String[] { "main.AngelChip", "go" };
        schema.playerClassName = "eh";
        schema.playerCoinsArrayField = "do";
        schema.playerLockedGoldField = "do";
        schema.playerNameFields = new String[] { "if", "do", "for", "int" };

        schema.upThueClassName = "aQ";
        schema.upThueSingletonMethod = "do";
        schema.upThueFormatDateMethod = "do";
        schema.targetCoinsField = "if";
        schema.earnedCoinsField = "for";
        schema.collectedHeartsField = "int";
        schema.upDaysField = "do";
        schema.startedTsField = "int";
        schema.startedAtStringField = "if";
        schema.expiresAtStringField = "for";
        schema.upThueSaveRmsClass = "cs";
        schema.upThueSaveRmsMethod = "do";
        schema.upThueResetRmsMethod = "if";

        schema.diamondClassName = "al";
        schema.diamondSingletonMethod = "do";
        schema.kcxCountField = "if";
        schema.nhbCountField = "for";
        schema.diamondIntervalField = "do";
        schema.diamondTargetMsField = "do";
        schema.diamondAbsTargetMsField = "if";
        schema.diamondSellOreOnFullField = "int";
        schema.diamondAutoDropKcxField = "new";
        schema.diamondAutoDropNhbField = "do";
        schema.diamondAutoFarmField = "try";
        schema.diamondHarvestOnTimeField = "if";
        schema.diamondPriorityOrderField = "do";
        schema.diamondSaveMethod = "new";

        schema.farmClassName = "bt";
        schema.farmSingletonMethod = "do";
        schema.farmBabyClassName = "bP";
        schema.farmModeField = "do";
        schema.farmAnimalField = "if";
        schema.farmFishField = "for";
        schema.farmBackupDishesField = "if";
        schema.farmBackupSeedsField = "for";
        schema.farmReplaceSeedThresholdField = "new";
        schema.farmSellProductsField = "do";
        schema.farmSellThresholdField = "byte";
        schema.farmSellQuantityField = "case";
        schema.farmMaxStarfruitLevelField = "try";
        schema.farmDailyAttendanceField = "this";
        schema.farmUpgradeStarfruitField = "else";
        schema.farmHatchDragonField = "char";
        schema.farmTrainDragonField = "long";
        schema.farmDeliverOrdersField = "goto";
        schema.farmNoBuyWithGoldField = "void";
        schema.farmHarvestHeartsField = "do";
        schema.farmFeedBabyField = "new";
        schema.farmBuyMilkWithGoldField = "int";
        schema.farmUpgradeBabyField = "try";
        schema.farmSaveMethod = "this";
        schema.farmDiamondTimerMethod = "final";
        schema.farmFishTimerMethod = "catch";

        schema.fishClassName = "bS";
        schema.fishMapField = "do";
        schema.fishRodField = "if";
        schema.fishSellTypeField = "for";
        schema.fishExcludeField = "do";
        schema.fishAutoBuyTicketField = "for";
        schema.fishBackToFarmField = "do";
        schema.fishFarmIntervalField = "case";
        schema.fishHarvestOnTimeField = "if";
        schema.fishSellKcxField = "int";
        schema.fishSellKcxThresholdField = "int";
        schema.fishSaveMethod = "byte";
        schema.fishTaskClassName = "bS";
        schema.fishSingletonMethod = "do";
        schema.fishTargetMsField = "do";
        schema.fishCaughtField = "new";
        schema.fishSharkCountField = "do";
        schema.fishKcxCountField = "try";

        schema.sellOreClassName = "d";
        schema.sellOreIntervalField = "new";
        schema.sellOreDelayMsField = "for";
        schema.sellOreZoneFromField = "try";
        schema.sellOreZoneToField = "int";
        schema.sellOreResetNhbField = "do";
        schema.sellOreResetKcxField = "int";
        schema.sellOreDropNhbField = "for";
        schema.sellOreDropKcxField = "if";
        schema.sellOreSaveMethod = "do";
        schema.sellOreTaskClassName = "d";
        schema.sellOreTargetMsField = "if";
        schema.sellOreStartMsField = "do";
        schema.zoneClassName = "gs";
        schema.zoneField = "int";

        schema.taskControllerClassName = "bX";
        schema.taskArgClassName = "hc";
        schema.taskStartMethod = "do";
        schema.taskStopMethod = "try";
        schema.taskReturnMethod = "do";
        schema.activeTaskField = "do";
        schema.farmTaskClassName = "bt";
        schema.diamondTaskClassName = "al";
        schema.fishTaskClassName = "bS";
        schema.farmTraderTaskClassName = "hp";

        return schema;
    }
}
