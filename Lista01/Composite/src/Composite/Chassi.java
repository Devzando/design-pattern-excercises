package Composite;

import java.util.ArrayList;
import java.util.List;

import Component.Carro;

public class Chassi extends Carro {

    private List<Carro> pecasChassi = new ArrayList<Carro>();

    public Chassi(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void adicionar(Carro peca) {
        pecasChassi.add(peca);
    }

    @Override
    public Double calcularPeso() {
        Double pesoTotal = this.peso;

        for (Carro peca : pecasChassi) {
            pesoTotal += peca.getPeso();
            System.out.print("\nSomando agora o peso de " + peca.getNome() + ": " + peca.getPeso() + ". Total parcial: " + pesoTotal);
        }

        return pesoTotal;
    }
    
}
