package Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Component.CarroComponent;

public class Carro extends CarroComponent {

    public List<CarroComponent> pecas = new ArrayList<CarroComponent>();

    public Carro(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public Double calcularPeso() {
        Double pesoTotal = this.peso;

        for (CarroComponent peca : pecas) {
            this.print(peca, pesoTotal);
            pesoTotal += peca.calcularPeso();
        }

        return pesoTotal;
    }

    @Override
    public void adicionar(CarroComponent peca) {
        pecas.add(peca);

    }

    @Override
    public void print(CarroComponent peca, Double pesoParcial) {
        System.out.print("\nSomando agora o peso de " + peca.getNome() + ": " + peca.getPeso() + ". Total parcial: " + pesoParcial);
    }
    
}
