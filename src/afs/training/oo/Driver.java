package afs.training.oo;

public class Driver {


    private Bus bus;

    private Truck truck;

    public Driver(Bus bus){
        this.bus = bus;
    }

    public Driver(Truck truck){
        this.truck = truck;
    }

    public void driveBus(){
        bus.speedUp();
    }

    public void driveTruck(){
        truck.speedUp();
    }
}
