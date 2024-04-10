package Component.ConcreteComponent;

import Component.Cake;

public class ChocolateCake extends Cake {

    public ChocolateCake() {
        CAKE_COST = 3;
    }

    @Override
    public String getDescription() {
        return "Chocolate cake";
    }
}

