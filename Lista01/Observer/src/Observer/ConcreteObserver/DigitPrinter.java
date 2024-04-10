package Observer.ConcreteObserver;

import java.util.List;

import Observer.IObserver;

public class DigitPrinter implements IObserver {
    @Override
    public void update(List<Integer> newDigit) {
        // Imprime o dígito mais recente na tela
        System.out.println(newDigit.get(newDigit.size() - 1));
    }
}
