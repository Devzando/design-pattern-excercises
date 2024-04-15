package Product.ConcrectProdut;

import Product.Inimigo;

public class Cangaceiro extends Inimigo {

    public Cangaceiro(String nome) {
        this.nome = nome;
    }

    @Override
    public void atacar() {
        System.out.println("O cangaceiro " + this.nome + " atacou!");
    }
    
}
