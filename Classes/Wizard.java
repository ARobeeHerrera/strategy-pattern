package Classes;

import Interface.ClassStrategy;

public class Wizard implements ClassStrategy {
    @Override
    public String attackStrategy() {
        return "Wizard Cast a spell!";
    }

    @Override
    public String defenseStrategy() {
        return "Create a magic barrier for defense\n";
    }
}
