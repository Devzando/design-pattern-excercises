import Lista01.Factory.Creator.LocalizacaoFactoryCreator;
import Lista01.Factory.Creator.ConcretCreator.Amazonia;
import Lista01.Factory.Creator.ConcretCreator.RioDeJaneiro;
import Lista01.Factory.Creator.ConcretCreator.Sertao;
import Lista01.Factory.Product.Inimigo;

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
