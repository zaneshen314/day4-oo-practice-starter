package afs.training.oo;

import afs.training.oo.Engine.ElectricEngine;
import afs.training.oo.Engine.GasOlineEngine;
import afs.training.oo.vehicel.Bus;
import afs.training.oo.vehicel.Truck;
import afs.training.oo.vehicel.Vehicel;

public class Main {
    public static void main(String[] args) {
//        new Bus("Cool Bus", 25).speedUp();
//        new Truck("Big Truck", 20).speedUp();
//        new Driver(new Bus("Cool Bus", 25)).driveBus();
//        new Driver(new Truck("Big Truck", 20)).driveTruck();
        new Driver(new Bus("Cool Bus", 25, new GasOlineEngine())).drive();
        new Driver(new Bus("Cool Bus", 25, new ElectricEngine())).drive();
        new Driver(new Truck("Big Truck", 20)).drive();

    }
}