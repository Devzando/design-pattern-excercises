package Creator.ConcretCreator;

import Creator.LocalizacaoFactoryCreator;
import Product.Inimigo;
import Product.ConcrectProdut.Animal;

public class Amazonia extends LocalizacaoFactoryCreator {

    @Override
    public Inimigo criarInimigo() {
        return new Animal("Onça");
    }
    
}
