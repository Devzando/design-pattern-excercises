package Lista01.Factory.Creator.ConcretCreator;

import Lista01.Factory.Creator.LocalizacaoFactoryCreator;
import Lista01.Factory.Product.Inimigo;
import Lista01.Factory.Product.ConcrectProdut.Cangaceiro;

public class Sertao extends LocalizacaoFactoryCreator {

    @Override
    public Inimigo criarInimigo() {
        return new Cangaceiro("Lampião");
    }
    
}
