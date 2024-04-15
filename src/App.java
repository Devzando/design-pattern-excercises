import Component.CarroComponent;
import Composite.Carro;
import Leaf.ComponentItem;

public class App {
    public static void main(String[] args) throws Exception {
        CarroComponent carroceria = new Carro("Carroceria", 100.0);
        CarroComponent chassi = new Carro("Chassi", 200.0);
        CarroComponent tremForca = new Carro("Trem de Força", 300.0);

        CarroComponent allComponents = new Carro("Carro", 0.0);

        allComponents.adicionar(carroceria);
        allComponents.adicionar(chassi);

        carroceria.adicionar(new ComponentItem("Porta", 10.0));
        carroceria.adicionar(new ComponentItem("Para-lamas", 10.0));
        carroceria.adicionar(new ComponentItem("Painéis", 10.0));
        carroceria.adicionar(new ComponentItem("Porta-malas", 10.0));
        carroceria.adicionar(new ComponentItem("Capô", 10.0));

        chassi.adicionar(new ComponentItem("Suspenção", 10.0));
        chassi.adicionar(tremForca);

        tremForca.adicionar(new ComponentItem("Motor", 10.0));
        tremForca.adicionar(new ComponentItem("Transmissão", 10.0));
        tremForca.adicionar(new ComponentItem("Diferencial", 10.0));
        tremForca.adicionar(new ComponentItem("Rodas", 10.0));

        System.out.println("\nPeso total do carro: " + allComponents.calcularPeso());

    }
}
