package Decorator.ConcreteDecorator;

import Component.Cake;
import Decorator.CakeDecorator;

public class SeveralLayers extends CakeDecorator {

    public SeveralLayers(Cake cake) {
        this.cake = cake;
    }

    @Override
    public int getCost() {
        return cake.getCost() + 5;
    }

    public String getDescription() {
        return "Multi-layered " + cake.getDescription();
    }
}
