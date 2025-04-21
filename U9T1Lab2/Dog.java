package U9T1Lab2;

public class Dog extends Animal {
    private boolean hasBeenWalked;
    private int numberOfTimesNeedsToTurnInACircleBeforeGoingToSleep;
    public Dog(String name, int age, double mass, boolean hasBeenWalked, int numberOfTimesNeedsToTurnInACircleBeforeGoingToSleep){
        super(name, age, mass);
        this.hasBeenWalked = false;
        this.numberOfTimesNeedsToTurnInACircleBeforeGoingToSleep = numberOfTimesNeedsToTurnInACircleBeforeGoingToSleep;
    }

    public void walk(){
        hasBeenWalked = true;
    }
    
    public boolean hasBeenWalked(){
        return hasBeenWalked;
    }

    public void goToSleep(){
        System.out.println(getName() + " turned around " + numberOfTimesNeedsToTurnInACircleBeforeGoingToSleep + " times, and then went to sleep.");
    }
}
