package Seminar2.RewardGenerator.Fabric;

import Seminar2.RewardGenerator.Interface.iGameItem;
import Seminar2.RewardGenerator.Product.GemReward;

public class GemGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new GemReward();
    }
}
