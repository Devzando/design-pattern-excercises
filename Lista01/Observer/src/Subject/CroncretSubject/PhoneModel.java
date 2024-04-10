package Subject.CroncretSubject;

import java.util.ArrayList;
import java.util.List;

import Observer.IObserver;
import Subject.ISubject;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel implements ISubject {

    private List<Integer> digits = new ArrayList<>();
    public List<IObserver> observers = new ArrayList<IObserver>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        this.notifyObservers();
    }

    public List<Integer> getDigits() {
        return digits;
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(digits);
        }
    }
}

