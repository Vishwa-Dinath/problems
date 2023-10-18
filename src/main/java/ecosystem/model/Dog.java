package ecosystem.model;

import ecosystem.Animal;

public class Dog implements Animal {
    @Override
    public void spawn() {
        System.out.println("Dog Spawns");
    }
}
