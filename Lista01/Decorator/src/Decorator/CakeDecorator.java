package Decorator;

import Component.Cake;

public abstract class CakeDecorator extends Cake {

    public Cake cake;

    public abstract int cost();
    
}
