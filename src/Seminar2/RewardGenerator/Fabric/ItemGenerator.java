package Seminar2.RewardGenerator.Fabric;

import Seminar2.RewardGenerator.Interface.iGameItem;

public abstract class ItemGenerator {
    public abstract iGameItem createItem();

    public void openReward() {
        createItem().open();
    }

}
