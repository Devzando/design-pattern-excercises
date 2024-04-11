package Observer.ConcreteObserver;

import Observer.IObserver;
import Subject.CroncretSubject.PhoneModel;

public class CompleteNumber implements IObserver {
    private final PhoneModel model;

    public CompleteNumber(PhoneModel model) {
        this.model = model;
    }

  @Override
  public void update(int newDigit) {
      if (model.getDigits().size() == 12) {
          String number = "";
          for (Integer digit : model.getDigits()) {
              number += digit.toString();
          }
          System.out.println("Agora discando: " + number + "...");
      }
  }
}