package Classes;

import Interface.ClassStrategy;

public class Characters {
    private ClassStrategy strategy;

    public Characters(ClassStrategy strategy) {
        this.strategy = strategy;
    }
    public Characters() {}

    public ClassStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(ClassStrategy strategy) {
        this.strategy = strategy;
    }

    public String attackStrategy() {
        return strategy.attackStrategy();
    }

    public String defenceStrategy() {
        return strategy.defenseStrategy();
    }
}
