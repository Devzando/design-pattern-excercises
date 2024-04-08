package Composite;

import java.util.ArrayList;
import java.util.List;

import Component.Carro;

public class TremForca extends Carro {

    private List<Carro> pecasTremForca = new ArrayList<Carro>();

    public TremForca(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void adicionar(Carro peca) {
        pecasTremForca.add(peca);
    }

    @Override
    public Double calcularPeso() {
        Double pesoTotal = this.peso;

        for (Carro peca : pecasTremForca) {
            pesoTotal += peca.getPeso();
            System.out.print("\nSomando agora o peso de " + peca.getNome() + ": " + peca.getPeso() + ". Total parcial: " + pesoTotal);
        }

        return pesoTotal;
    }
    
}
