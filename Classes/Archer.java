package Classes;

import Interface.ClassStrategy;

public class Archer implements ClassStrategy {

    @Override
    public String attackStrategy() {
        return "Archer shoots an arrow!";
    }

    @Override
    public String defenseStrategy() {
        return "Using a shield to defend!\n";
    }
}
