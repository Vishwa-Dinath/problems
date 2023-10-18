package ecosystem;

import ecosystem.model.*;

import java.util.ArrayList;

public class EcoSystem {
    public ArrayList<Animal> animalList;

    private static final EcoSystem instance = initEcoSystem();

    private EcoSystem(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }

    public static EcoSystem initEcoSystem() {
        ArrayList<Animal> animalList = new ArrayList<>();
        return new EcoSystem(animalList);
    }

    public static EcoSystem getInstance() {
        return instance;
    }
}
