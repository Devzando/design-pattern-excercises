package Observer.ConcreteObserver;

import Observer.IObserver;

public class UnitNumber implements IObserver {
    @Override
    public void update(int newDigit) {
        System.out.println("Pressionando: " + newDigit);
        System.out.println(newDigit);
    }
}
