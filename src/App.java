public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Criando intância 1");
        GameConfig gameConfig1 = GameConfig.getInstance();
        System.out.println("DlcName: " + gameConfig1.getDlcName());
        System.out.println("Criando instância 2");
        GameConfig gameConfig2 = GameConfig.getInstance();

        if(gameConfig1 == gameConfig2){
            System.out.println("As instâncias são iguais");
        } else {
            System.out.println("As instâncias são diferentes");
        }
    }
}
