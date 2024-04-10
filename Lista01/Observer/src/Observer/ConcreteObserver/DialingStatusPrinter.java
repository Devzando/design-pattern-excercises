package Observer.ConcreteObserver;

import java.util.List;

import Observer.IObserver;

public class DialingStatusPrinter implements IObserver {
  @Override
  public void update(List<Integer> newDigit) {
      // Cria uma string representando o número de telefone
      StringBuilder phoneNumber = new StringBuilder();
      for (Integer digit : newDigit) {
          phoneNumber.append(digit);
      }

      // Imprime mensagem de discagem
      System.out.println("Agora discando " + phoneNumber.toString() + "...");
  }
}