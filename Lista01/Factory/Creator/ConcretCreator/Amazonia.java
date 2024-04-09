package Lista01.Factory.Creator.ConcretCreator;

import Lista01.Factory.Creator.LocalizacaoFactoryCreator;
import Lista01.Factory.Product.Inimigo;
import Lista01.Factory.Product.ConcrectProdut.Animal;

public class Amazonia extends LocalizacaoFactoryCreator {

    @Override
    public Inimigo criarInimigo() {
        return new Animal("Onça");
    }
    
}
