package Seminar2.RewardGenerator;

import Seminar2.RewardGenerator.Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        // Рандомайзер
        Random random = ThreadLocalRandom.current();

        // Инициализация фабрик и их списка
        List<ItemGenerator> fabrics = initFabrics();

        for (int i = 0; i < 200; i++) {
            // Выбрасываем вес шанса (0 <= вес < 1)
            int index = random.nextInt(fabrics.size());
            fabrics.get(index).openReward();
        }
    }


    // Фабричный инициализатор
    public static List<ItemGenerator> initFabrics() {
        List<ItemGenerator> fabrics = new ArrayList<>();

        fabrics.add(new GemGenerator());

        for (int i = 0; i < 3; i++) {
            fabrics.add(new GoldGenerator());
        }

        for (int i = 0; i < 10; i++) {
            fabrics.add(new SilverGenerator());
            fabrics.add(new ClayGenerator());
            fabrics.add(new CopperGenerator());
            fabrics.add(new HerbGenerator());
            fabrics.add(new LeatherGenerator());
            fabrics.add(new PotionGenerator());
        }

        return fabrics;
    }
}
