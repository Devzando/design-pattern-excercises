package Leaf;

import Component.Carro;

public class Capo extends Carro {
    public Capo(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public Double calcularPeso() {
        return this.peso;
    }

    
}
