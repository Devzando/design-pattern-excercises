package Decorator.ConcreteDecorator;

import Component.Cake;
import Decorator.CakeDecorator;

public class SayX extends CakeDecorator {

    private String sayValue = "X";
    
    public SayX(Cake cake, String sayValue) {
        this.cake = cake;
        this.sayValue = sayValue;
    }

    public String getDescription() {
        return cake.getDescription() + " with saying " + sayValue;
    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cost'");
    }
}
