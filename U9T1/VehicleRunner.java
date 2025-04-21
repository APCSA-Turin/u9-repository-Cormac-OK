package U9T1;

public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        Bicycle bike = new Bicycle("Bob's Bike", 2, 5);

        System.out.println(bike.getName());
        System.out.println(bike.getWheels());
        System.out.println(bike.getGearCount());

        bike.move(10);
        bike.turn();
        bike.ringBell();
        bike.brake();

        Airplane plane = new Airplane("Boeing 747", 18, 4);
        System.out.println(plane.getName());
        System.out.println(plane.getWheels());
        System.out.println(plane.getEngines());
        System.out.println(plane.wheelsAreDown());

        plane.retractWheels();
        plane.move(100);
        plane.haveEngineFailure();
        plane.turn();
        plane.extendWheels();
        plane.brake();

        Dolphin dolphin = new Dolphin("Bottlenose Dolphin", 175, 90);
        Whale whale = new Whale("Blue Whale", 100000, 300);

        System.out.println(dolphin.getName());
        System.out.println(dolphin.getMass());
        System.out.println(dolphin.getTeeth());
        dolphin.useBlowhole();
        dolphin.eatFish();

        System.out.println(whale.getName());
        System.out.println(whale.getMass());
        System.out.println(whale.getBaleen());
        whale.useBlowhole();
        whale.eatKrill();

    }
}
