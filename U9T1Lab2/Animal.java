package U9T1Lab2;

public class Animal{
    private String name;
    private int age;
    private boolean vaccinated;
    private double mass;

    public Animal(String name, int age, double mass){
        this.name = name;
        this.age = age;
        this.mass = mass;
        vaccinated = false;
    }

    public void adopt(){
        System.out.println(name + " has been adopted!!!!!");
    }

    public void feed(){
        System.out.println(name + " has been fed.");
    }

    public void giveBath(){
        System.out.println(name + " has been washed.");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public double getMass() {
        return mass;
    }

    


    
}