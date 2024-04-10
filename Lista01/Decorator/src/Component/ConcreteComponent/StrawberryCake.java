package Component.ConcreteComponent;

import Component.Cake;

public class StrawberryCake extends Cake {
    
    public StrawberryCake() {
        CAKE_COST = 4;
    }

    @Override
    public String getDescription() {
        return "Strawberry cake";
    }
}
