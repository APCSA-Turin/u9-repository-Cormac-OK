package U9T1;

public class Airplane extends Vehicle{
    private int engines;
    private boolean wheelsAreDown = true;

    public Airplane(String name, int wheels, int engines){
        super(name, wheels);
        this.engines = engines;
    }

    public int getEngines(){
        return engines;
    }

    public boolean wheelsAreDown(){
        return wheelsAreDown;
    }

    public void haveEngineFailure(){
        System.out.println("One of my engines has burst into flames!!!!!");
        engines -= 1;
    }

    public void extendWheels(){
        wheelsAreDown = true;
    }

    public void retractWheels(){
        wheelsAreDown = false;
    }
}
