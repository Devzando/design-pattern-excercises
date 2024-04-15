package Creator.ConcretCreator;

import Creator.LocalizacaoFactoryCreator;
import Product.Inimigo;
import Product.ConcrectProdut.Criminoso;

public class RioDeJaneiro extends LocalizacaoFactoryCreator {

    @Override
    public Inimigo criarInimigo() {
        return new Criminoso("Zé Pequeno");
    }
    
}
