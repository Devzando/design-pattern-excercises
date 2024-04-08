package Leaf;

import Component.Carro;

public class Paineis extends Carro {
    public Paineis(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public Double calcularPeso() {
        return this.peso;
    }
}
