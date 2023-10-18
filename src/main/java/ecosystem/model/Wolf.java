package ecosystem.model;

import ecosystem.Animal;

public class Wolf implements Animal {
    @Override
    public void spawn() {
        System.out.println("Wolf spawn");
    }
}
