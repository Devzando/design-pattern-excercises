package Component.ConcreteComponent;

import Component.Cake;

public class VanillaCake extends Cake {

    public VanillaCake() {
        CAKE_COST = 2;
    }

    @Override
    public String getDescription() {
        return "Vanilla cake";
    }
}
