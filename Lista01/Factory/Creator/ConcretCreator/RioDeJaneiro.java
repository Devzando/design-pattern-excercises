package Lista01.Factory.Creator.ConcretCreator;

import Lista01.Factory.Creator.LocalizacaoFactoryCreator;
import Lista01.Factory.Product.Inimigo;
import Lista01.Factory.Product.ConcrectProdut.Criminoso;

public class RioDeJaneiro extends LocalizacaoFactoryCreator {

    @Override
    public Inimigo criarInimigo() {
        return new Criminoso("Zé Pequeno");
    }
    
}
