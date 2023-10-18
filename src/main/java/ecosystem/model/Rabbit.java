package ecosystem.model;

import ecosystem.Animal;

public class Rabbit implements Animal {
    @Override
    public void spawn() {
        System.out.println("Rabbit spawns");
    }
}
