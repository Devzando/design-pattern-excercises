package Observer.ConcreteObserver;

import java.util.List;

import Observer.IObserver;
import Subject.CroncretSubject.PhoneModel;

public class Screen implements IObserver {
    private final PhoneModel model;
    private final DigitPrinter digitPrinter;
    private final DialingStatusPrinter dialingStatusPrinter;

    public Screen(PhoneModel model) {
        this.model = model;
        this.digitPrinter = new DigitPrinter();
        this.dialingStatusPrinter = new DialingStatusPrinter();
        model.registerObserver(this);
    }

    @Override
    public void update(List<Integer> newDigit) {
        digitPrinter.update(newDigit);
        dialingStatusPrinter.update(newDigit);
    }
}
// public class Screen implements IObserver{
//     private final PhoneModel model;

//     public Screen(PhoneModel model) {
//         this.model = model;
//         model.registerObserver(this);
//     }

//     @Override
//     public void update(List<Integer> newDigit) {
//         System.out.println(newDigit);
//     }
    
// }
