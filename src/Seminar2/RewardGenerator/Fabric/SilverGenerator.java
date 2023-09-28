package Seminar2.RewardGenerator.Fabric;

import Seminar2.RewardGenerator.Interface.iGameItem;
import Seminar2.RewardGenerator.Product.SilverReward;

public class SilverGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new SilverReward();
    }
}
