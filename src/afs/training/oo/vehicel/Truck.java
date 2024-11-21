package afs.training.oo.vehicel;

import afs.training.oo.Engine.GasOlineEngine;

public class Truck extends Vehicel{

    public Truck(String name, Integer speed) {
        super(name, speed, new GasOlineEngine());
    }
}
