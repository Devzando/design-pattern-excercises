package Product.ConcrectProdut;

import Product.Inimigo;

public class Criminoso extends Inimigo {

    public Criminoso(String nome) {
        this.nome = nome;
    }

    @Override
    public void atacar() {
        System.out.println("O criminoso " + this.nome + " atacou!");
    }
    
}
