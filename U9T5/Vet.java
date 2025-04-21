package U9T5;

import java.util.ArrayList;

public class Vet {
    private String vetName;
    private ArrayList<Animal> clients;

    public Vet(String name){
        vetName = name;
        clients = new ArrayList<Animal>();
    }

    public boolean addClient(Animal animal){
        boolean alreadyClient = false;
        for(Animal client: clients){    
            if(client == animal){
                alreadyClient = true;
            }
        }
        if(alreadyClient){
            System.out.println(animal.getName() + " is already a client of " + vetName);
            return false;
        }
        else{
            clients.add(animal);
            System.out.println("Welcome to " + vetName + "'s office, " + animal.getName());
            return true;
        }
    }

    public void printClientList(){
        for(Animal animal: clients){
            System.out.println(animal.getName() + ": " + animal.getClass());
        }
    }
}
