package ecosystem.model;

import ecosystem.Animal;

public class Cat implements Animal {
    @Override
    public void spawn() {
        System.out.println("Cat spawns");
    }
}
