package U9T1;

public class Cetacean {
    private String name;
    private int mass;

    public Cetacean(String name, int mass){
        this.name = name;
        this.mass = mass;
    }

    public void useBlowhole(){
        System.out.println("bwwwfshshshshhshshsh");
    }

    public int getMass() {
        return mass;
    }

    public String getName() {
        return name;
    }
}
