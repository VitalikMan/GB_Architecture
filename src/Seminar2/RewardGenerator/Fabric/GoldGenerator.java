package Seminar2.RewardGenerator.Fabric;

import Seminar2.RewardGenerator.Interface.iGameItem;
import Seminar2.RewardGenerator.Product.GoldReward;

public class GoldGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
}
