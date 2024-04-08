package Leaf;

import Component.Carro;

public class Transmissao extends Carro {
    public Transmissao(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public Double calcularPeso() {
        return this.peso;
    }

}
