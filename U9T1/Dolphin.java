package U9T1;

public class Dolphin extends Cetacean {
    private int teeth;
    public Dolphin(String name, int mass, int teeth){
        super(name, mass);
        this.teeth = teeth;
    }

    public int getTeeth() {
        return teeth;
    }

    public void eatFish(){
        System.out.println("Chomp Chomp Chomp");
    }
    
}
