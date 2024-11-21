package afs.training.oo;

import afs.training.oo.vehicel.Bus;
import afs.training.oo.vehicel.Truck;
import afs.training.oo.vehicel.Vehicel;

public class Driver {


    private Vehicel vehicel;

    public Driver(Vehicel vehicel){
        this.vehicel = vehicel;
    }

    public void drive(){
        vehicel.speedUp();
    }
}
