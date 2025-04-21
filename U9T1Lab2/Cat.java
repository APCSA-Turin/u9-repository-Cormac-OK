package U9T1Lab2;

public class Cat extends Animal {
    private boolean hasBeenPlayedWith;
    private String favoriteFish;
    public Cat(String name, int age, double mass, boolean hasBeenWalked, String favoriteFish){
        super(name, age, mass);
        this.hasBeenPlayedWith = false;
        this.favoriteFish = favoriteFish;
    }

    public void play(){
        hasBeenPlayedWith = true;
    }

    public void feedTreat(){
        System.out.println(getName() + " recieved their favorite snack: a " + favoriteFish);
    }

    public boolean hasBeenPlayedWith(){
        return hasBeenPlayedWith;
    }

    public String getFavoriteFish() {
        return favoriteFish;
    }
}