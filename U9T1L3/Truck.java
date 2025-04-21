package U9T1L3;

public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    @Override
    public void printInfo(){
      super.printInfo();
      System.out.println("Number of Axels:  " + axles);
      System.out.println("Has Trailer? " + hasTrailer);
    }

    
    public boolean validateLicensePlate(){
      String lastTwoLetters = getLicensePlate().substring(getLicensePlate().length() - 2);
      if(!hasTrailer){
        return true;
      }
      else if (axles > 4 && lastTwoLetters.equals("MX")) {
        return true;
      }
      else if (axles <= 4 && lastTwoLetters.equals("LX")) {
        return true;
      }
      else{return false;}
    }

    @Override
    public double calculateTollPrice() {
        double price = getTollFee() * axles;
        if(hasTrailer){
          price *= 2;
        }
        return price;
    }

  }
