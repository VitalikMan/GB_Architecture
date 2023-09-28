package Seminar3.CarUp.Classes;

import Seminar3.CarUp.Enumerators.TypeCar;
import Seminar3.CarUp.Enumerators.TypeFuel;
import Seminar3.CarUp.Enumerators.TypeGearBox;
import Seminar3.CarUp.Interfaces.ICarWash;
import Seminar3.CarUp.Interfaces.IFuelStation;

import java.awt.*;

public class Pickup extends Car implements IFuelStation, ICarWash {

    private int loadCap;

    public Pickup(String make, String model,
                  int numberWheels, TypeFuel fuelType, TypeGearBox gearBoxType,
                  Color bodyColor, int engineCap, int loadCap) {

        super(make, model, TypeCar.PICKUP, numberWheels, fuelType, gearBoxType, bodyColor, engineCap);

        this.loadCap = loadCap;

    }


    @Override
    public void fuel() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }

    @Override
    public void wipMirrors() {

    }

}
