package U9T1L3;

public class VehicleRunner {
    public static void main(String[] args) {
      Taxi taxi = new Taxi("TXGW32", 5.60, 3, false, 4.7);
      Car car = new Car("49j3fq", 3.2, 2, true);
      Truck truck = new Truck("wrgewrej", 9.0, 1, 6, true);
      Vehicle vehicle = new Vehicle("wgerjuiw", 6.7, 5);

      taxi.hitPedestrian();
      System.out.println();

      car.hitPedestrian();
      System.out.println();

      truck.hitPedestrian();
      System.out.println();

      vehicle.hitPedestrian();
      System.out.println();
      
      
    }
}