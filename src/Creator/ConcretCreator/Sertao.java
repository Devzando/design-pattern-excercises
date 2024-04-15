package Creator.ConcretCreator;

import Creator.LocalizacaoFactoryCreator;
import Product.Inimigo;
import Product.ConcrectProdut.Cangaceiro;

public class Sertao extends LocalizacaoFactoryCreator {

    @Override
    public Inimigo criarInimigo() {
        return new Cangaceiro("Lampião");
    }
    
}
