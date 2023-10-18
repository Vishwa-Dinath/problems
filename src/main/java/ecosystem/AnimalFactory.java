package ecosystem;

import ecosystem.model.*;

public class AnimalFactory {
    private static AnimalFactory animalFactory;
    
    private AnimalFactory(){}

    public static AnimalFactory getAnimalFactory() {
        return (animalFactory==null)? animalFactory = new AnimalFactory() : animalFactory;
    }

    public Animal getAnimal(String animal) {
        if (animal.equals("DOG")) {
            return new Dog();
        } else if (animal.equals("CAT")) {
            return new Cat();
        } else if (animal.equals("RABBIT")) {
            return new Rabbit();
        } else if (animal.equals("DUCK")) {
            return new Duck();
        } else if (animal.equals("WOLF")) {
            return new Wolf();
        }else {
            return null;
        }
    }
}
