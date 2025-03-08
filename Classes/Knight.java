package Classes;

import Interface.ClassStrategy;

public class Knight implements ClassStrategy {
    @Override
    public String attackStrategy() {
        return "Knight attack with a sword";
    }

    @Override
    public String defenseStrategy() {
        return "Using a shield to defend \n" +
                "Dodging to avoid attack! \n" +
                "Creating a magic barrier for defense!\n";
    }
}
