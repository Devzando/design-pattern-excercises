package Composite;

import java.util.ArrayList;
import java.util.List;

import Component.Carro;

public class Carroceria extends Carro {

    private List<Carro> pecasCarroceria = new ArrayList<Carro>();

    public Carroceria(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void adicionar(Carro peca) {
        pecasCarroceria.add(peca);
    }

    @Override
    public Double calcularPeso() {
        Double pesoTotal = this.peso;

        for (Carro peca : pecasCarroceria) {
            pesoTotal += peca.getPeso();
            System.out.print("\nSomando agora o peso de " + peca.getNome() + ": " + peca.getPeso() + ". Total parcial: " + pesoTotal);
        }

        return pesoTotal;
    }
    
}
