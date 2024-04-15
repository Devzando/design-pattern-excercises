package Component;

public abstract class CarroComponent {
    public String nome;
    public double peso;

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public abstract Double calcularPeso();
    public abstract void adicionar(CarroComponent peca);
    public abstract void print(CarroComponent peca, Double pesoParcial);
}
