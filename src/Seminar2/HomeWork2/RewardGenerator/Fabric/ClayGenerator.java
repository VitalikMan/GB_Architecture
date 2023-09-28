package Seminar2.HomeWork2.RewardGenerator.Fabric;

import Seminar2.HomeWork2.RewardGenerator.Interface.iGameItem;
import Seminar2.HomeWork2.RewardGenerator.Product.ClayReward;

public class ClayGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new ClayReward();
    }
}
