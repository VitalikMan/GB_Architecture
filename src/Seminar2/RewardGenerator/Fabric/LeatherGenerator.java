package Seminar2.RewardGenerator.Fabric;

import Seminar2.RewardGenerator.Interface.iGameItem;
import Seminar2.RewardGenerator.Product.LeatherReward;

public class LeatherGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new LeatherReward();
    }
}
