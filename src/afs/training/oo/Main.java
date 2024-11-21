package afs.training.oo;

public class Main {
    public static void main(String[] args) {
//        new Bus("Cool Bus", 25).speedUp();
//        new Truck("Big Truck", 20).speedUp();
        new Driver(new Bus("Cool Bus", 25)).driveBus();
        new Driver(new Truck("Big Truck", 20)).driveTruck();

    }
}