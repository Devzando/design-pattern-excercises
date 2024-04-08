package Leaf;

import Component.Carro;

public class Diferencial extends Carro {
    public Diferencial(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public Double calcularPeso() {
        return this.peso;
    }
}
