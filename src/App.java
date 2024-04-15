import Component.Cake;
import Component.ConcreteComponent.ChocolateCake;
import Component.ConcreteComponent.StrawberryCake;
import Component.ConcreteComponent.VanillaCake;
import Decorator.ConcreteDecorator.Granulated;
import Decorator.ConcreteDecorator.SayX;
import Decorator.ConcreteDecorator.SeveralLayers;

public class App {
    public static void main(String[] args) throws Exception {
        Cake cake1 = new ChocolateCake();

        Cake cake2 = new VanillaCake();
        cake2 = new SayX(cake2, "PLAIN!");
        
        Cake cake3 = new VanillaCake();
        cake3 = new Granulated(cake3);
        cake3 = new SayX(cake3, "FANCY!");

        Cake cake4 = new StrawberryCake();
        cake4 = new SeveralLayers(cake4);
        cake4 = new Granulated(cake4);
        cake4 = new Granulated(cake4);
        cake4 = new SayX(cake4, "One of"); 
        cake4 = new SayX(cake4, "EVERYTHING"); 

        Order order = new Order();
        order.addCake(cake1);
        order.addCake(cake2);
        order.addCake(cake3);
        order.addCake(cake4);

        order.printOrder();

    }
}
