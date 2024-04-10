package Decorator.ConcreteDecorator;

import Component.Cake;
import Decorator.CakeDecorator;

public class Granulated extends CakeDecorator {
    
    public Granulated(Cake cake) {
        this.cake = cake;
    }

    @Override
    public int cost() {
        return cake.getCost() + 2;
    }

    public String getDescription() {
        return cake.getDescription() + " with sprinkles";
    }
}
