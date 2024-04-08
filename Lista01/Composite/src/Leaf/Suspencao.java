package Leaf;

import Component.Carro;

public class Suspencao extends Carro {
    public Suspencao(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public Double calcularPeso() {
        return this.peso;
    }

}
