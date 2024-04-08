package Leaf;

import Component.Carro;

public class PortaMalas extends Carro {
    public PortaMalas(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public Double calcularPeso() {
        return this.peso;
    }

    
}
