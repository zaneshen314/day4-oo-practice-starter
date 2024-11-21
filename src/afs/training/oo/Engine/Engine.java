package afs.training.oo.Engine;

public abstract class Engine {

    private final Integer accelerationSpeed;

    public Engine(Integer accelerationSpeed){
        this.accelerationSpeed = accelerationSpeed;
    }

    public Integer getAccelerationSpeed(){
        return accelerationSpeed;
    }

}
