package afs.training.oo.vehicel;

import afs.training.oo.Engine.Engine;

public abstract class Vehicel {
    private String name;
    private Integer speed;
    private Engine engine;

    public Vehicel(String name, Integer speed, Engine engine)
    {
        this.name = name;
        this.speed = speed;
        this.engine = engine;
    }

    public void speedUp()
    {
        this.speed += this.engine.getAccelerationSpeed();
        System.out.printf("%s:speed up to %d km/h%n", this.name, this.speed);
    }
}
