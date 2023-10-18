package ecosystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

public class Main {

    private static HashMap<String, Integer> indexSet = new HashMap<>();

    public static ArrayList<Animal> animalList = EcoSystem.getInstance().animalList;

    private static void initAnimalList() {
        animalList.add(AnimalFactory.getAnimalFactory().getAnimal("DOG"));
        animalList.add(AnimalFactory.getAnimalFactory().getAnimal("CAT"));
        animalList.add(AnimalFactory.getAnimalFactory().getAnimal("RABBIT"));
        animalList.add(AnimalFactory.getAnimalFactory().getAnimal("DUCK"));
        animalList.add(AnimalFactory.getAnimalFactory().getAnimal("WOLF"));
    }

    private static void initIndexSet() {
        indexSet.put("DOG", 0);
        indexSet.put("CAT", 1);
        indexSet.put("RABBIT", 2);
        indexSet.put("DUCK", 3);
        indexSet.put("WOLF", 4);
    }

    public static void main(String[] args) {
        EcoSystem instance = EcoSystem.getInstance();
        initAnimalList();
        initIndexSet();

        int iterationCount = Integer.parseInt(readConfiguration().getProperty("iterationCount"));
        iterateSpawning(iterationCount,new Condition("DOG",5),
                new Condition("CAT",10),new Condition("WOLF",10));
    }

    public static Properties readConfiguration() {
        Properties properties = new Properties();
        try {
            properties.load(Main.class.getResourceAsStream("/app.properties"));
            properties.getProperty("iterationCount");
            return properties;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void iterateSpawning(int iterationCount,Condition condition1, Condition condition2, Condition condition3) {
        for (int i = 1; i < iterationCount; i++) {
            if (i%condition1.conditionValue == 0){
                animalList.get(indexSet.get(condition1.animalType)).spawn();
            }
            if (i % condition2.conditionValue == 0) {
                animalList.get(indexSet.get(condition2.animalType)).spawn();
            }
            if (i % condition3.conditionValue == 0) {
                animalList.get(indexSet.get(condition3.animalType)).spawn();
            }
        }
    }
}
