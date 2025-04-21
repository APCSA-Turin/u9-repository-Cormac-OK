package U9T1;

public class Whale extends Cetacean {
    private int baleen;
    public Whale(String name, int mass, int baleen){
        super(name, mass);
        this.baleen = baleen;
    }

    public int getBaleen() {
        return baleen;
    }

    public void eatKrill(){
        System.out.println("Schlorp Schlorp Schlorp");
    }
}
