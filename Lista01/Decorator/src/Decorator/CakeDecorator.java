package Decorator;

import Component.Cake;

public abstract class CakeDecorator extends Cake {

    private Cake cake;

    public abstract String getDescription();
    
}
