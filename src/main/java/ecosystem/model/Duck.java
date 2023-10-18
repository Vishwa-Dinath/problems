package ecosystem.model;

import ecosystem.Animal;

public class Duck implements Animal {
    @Override
    public void spawn() {
        System.out.println("Duck spawns");
    }
}
