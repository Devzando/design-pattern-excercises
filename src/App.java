import Creator.LocalizacaoFactoryCreator;
import Creator.ConcretCreator.Amazonia;
import Creator.ConcretCreator.RioDeJaneiro;
import Creator.ConcretCreator.Sertao;
import Product.Inimigo;

public class App {
    public static void main(String[] args) throws Exception {

      System.out.println("\nJogando na Amazônia:");
      LocalizacaoFactoryCreator amazoniaFactory = new Amazonia();
      Inimigo inimigo = amazoniaFactory.criarInimigo();
      inimigo.atacar();

      System.out.println("\nJogando no Sertão:");
      LocalizacaoFactoryCreator sertaoFactory = new Sertao();
      inimigo = sertaoFactory.criarInimigo();
      inimigo.atacar();

      System.out.println("\nJogando no Rio de Janeiro:");
      LocalizacaoFactoryCreator rioFactory = new RioDeJaneiro();
      inimigo = rioFactory.criarInimigo();
      inimigo.atacar();
    }
}
