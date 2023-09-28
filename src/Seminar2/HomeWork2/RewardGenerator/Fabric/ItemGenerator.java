package Seminar2.HomeWork2.RewardGenerator.Fabric;

import Seminar2.HomeWork2.RewardGenerator.Interface.iGameItem;

public abstract class ItemGenerator {
    public abstract iGameItem createItem();

    public void openReward() {
        createItem().open();
    }

}
