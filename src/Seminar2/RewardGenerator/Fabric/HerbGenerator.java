package Seminar2.RewardGenerator.Fabric;

import Seminar2.RewardGenerator.Interface.iGameItem;
import Seminar2.RewardGenerator.Product.HerbReward;

public class HerbGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new HerbReward();
    }
}
