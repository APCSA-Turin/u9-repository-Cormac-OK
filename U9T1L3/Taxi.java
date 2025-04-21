package U9T1L3;

public class Taxi extends Car{
    private double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected){
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Total Fare Collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider){
        setPassengers(getPassengers()+numRiders);
        fareCollected += farePerRider * numRiders;
        if(getPassengers() >= 4 && !isDiscountApplied()){
            setDiscountApplied(true);
            setTollFee(getTollFee()/2);
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider){
        int passengers = getPassengers() - 1;
        fareCollected += passengers * farePerRider;
        return dropOffPassengers(passengers);
    }

    @Override
    public void hitPedestrian() {
        super.hitPedestrian();
        System.out.println("The driver lost their taxi medalion!");
    }
}
