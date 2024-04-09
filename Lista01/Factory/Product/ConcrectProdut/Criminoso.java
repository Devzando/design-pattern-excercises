package Lista01.Factory.Product.ConcrectProdut;

import Lista01.Factory.Product.Inimigo;

public class Criminoso extends Inimigo {

    public Criminoso(String nome) {
        this.nome = nome;
    }

    @Override
    public void atacar() {
        System.out.println("O criminoso " + this.nome + " atacou!");
    }
    
}
