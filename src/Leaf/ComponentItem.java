package Leaf;

import Component.CarroComponent;

public class ComponentItem extends CarroComponent {

    public ComponentItem(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public Double calcularPeso() {
       return this.peso;
    }

    @Override
    public void adicionar(CarroComponent peca) {
        throw new UnsupportedOperationException("Unimplemented method 'adicionar'");
    }

    @Override
    public void print(CarroComponent peca, Double pesoParcial) {
        System.out.print("\nSomando agora o peso de " + peca.getNome() + ": " + peca.getPeso() + ". Total parcial: " + pesoParcial);
    }
    
}
