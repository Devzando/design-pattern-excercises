package Component;

public abstract class Carro {
    public String nome;
    public double peso;

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public abstract Double calcularPeso();
}
