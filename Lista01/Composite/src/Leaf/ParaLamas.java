package Leaf;

import Component.Carro;

public class ParaLamas extends Carro{

    public ParaLamas(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public Double calcularPeso() {
        return this.peso;
    }
    
}
