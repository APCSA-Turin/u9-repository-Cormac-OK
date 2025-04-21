package U9T1Pt3;

import U9T1Lab2.Desktop;

public class GamingDesktop extends Desktop{

    private String graphicsCard;

    public GamingDesktop(int screenSize, int memory, String graphicsCard){
        super(screenSize, memory, true);
        this.graphicsCard = graphicsCard;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void updateDriver(){
        System.out.println("Driver Updated.");
    }
}