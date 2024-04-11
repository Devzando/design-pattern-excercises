

import Observer.ConcreteObserver.CompleteNumber;
import Observer.ConcreteObserver.UnitNumber;
import Subject.CroncretSubject.PhoneModel;

public class Screen {
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
        model.registerObserver(new UnitNumber());
        model.registerObserver(new CompleteNumber(model));
    }
}
