package U9T1;

public class Bicycle extends Vehicle{

    private int gearCount;

    public Bicycle(String name, int wheels, int gears){
        super(name, wheels);
        gearCount = gears;
    }

    public void ringBell(){
        System.out.println("Ding Ding Ding!!!");
    }

    public int getGearCount() {
        return gearCount;
    }

}