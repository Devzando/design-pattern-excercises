package Leaf;

import Component.Carro;

public class Rodas extends Carro {
    public Rodas(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public Double calcularPeso() {
        return this.peso;
    }
}
