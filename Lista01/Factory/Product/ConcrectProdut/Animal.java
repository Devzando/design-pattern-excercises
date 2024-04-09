package Lista01.Factory.Product.ConcrectProdut;

import Lista01.Factory.Product.Inimigo;

public class Animal extends Inimigo {

    public Animal(String nome) {
        this.nome = nome;
    }

    @Override
    public void atacar() {
        System.out.println("O animal " + this.nome + " atacou!");
    }
    
}
