package Seminar2.RewardGenerator.Fabric;

import Seminar2.RewardGenerator.Interface.iGameItem;
import Seminar2.RewardGenerator.Product.CopperReward;

public class CopperGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new CopperReward();
    }
}
