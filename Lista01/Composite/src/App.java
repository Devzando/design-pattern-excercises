import Component.Carro;
import Composite.Carroceria;
import Composite.Chassi;
import Composite.TremForca;
import Leaf.Capo;
import Leaf.Diferencial;
import Leaf.Motor;
import Leaf.Paineis;
import Leaf.ParaLamas;
import Leaf.PortaMalas;
import Leaf.Portas;
import Leaf.Rodas;
import Leaf.Suspencao;
import Leaf.Transmissao;

public class App {
    public static void main(String[] args) throws Exception {
        Carroceria carroceria = new Carroceria("Carroceria", 100.0);
        carroceria.adicionar(new ParaLamas("Para-lamas", 10.0));
        carroceria.adicionar(new Portas("Portas", 20.0));
        carroceria.adicionar(new Paineis("Painéis", 30.0));
        carroceria.adicionar(new PortaMalas("Porta-malas", 40.0));
        carroceria.adicionar(new Capo("Capô", 50.0));

        Chassi chassi = new Chassi("Chassi", 200.0);
        TremForca tremForca = new TremForca("Trem de Força", 150.0);
        tremForca.adicionar(new Motor("Motor", 100.0));
        tremForca.adicionar(new Transmissao("Transmissão", 50.0));
        tremForca.adicionar(new Diferencial("Diferencial", 30.0));
        tremForca.adicionar(new Rodas("Rodas", 20.0));
        tremForca.calcularPeso();
        chassi.adicionar(new TremForca("Trem de Força", tremForca.peso));
        chassi.adicionar(new Suspencao("Suspensão", 60.0));

        System.out.println("\n Peso total do carro: " + carroceria.calcularPeso() + chassi.calcularPeso() + " kg.");


    }
}
