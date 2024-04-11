package Subject;

import Observer.IObserver;

public interface ISubject {
    public void registerObserver(IObserver observer);
    public void notifyObservers(int newDigit); 
}
