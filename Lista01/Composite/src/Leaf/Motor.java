package Leaf;

import Component.Carro;

public class Motor extends Carro {
    public Motor(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public Double calcularPeso() {
        return this.peso;
    }

}
