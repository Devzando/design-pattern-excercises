package Leaf;

import Component.Carro;

public class Portas extends Carro {

    public Portas(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public Double calcularPeso() {
        return this.peso;
    }
    
}
