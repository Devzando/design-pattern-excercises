public class App {
    public static void main(String[] args) {
        ProcessadorTexto processadorMaiuscula = new TudoMaiuscula();
        ProcessadorTexto processadorMinuscula = new TudoMinuscula();

        String textoOriginal = "ExEmPlO de TeXtO";
        
        String textoMaiusculo = processadorMaiuscula.processarTexto(textoOriginal);
        System.out.println("Texto em Maiúsculas: " + textoMaiusculo);

        String textoMinusculo = processadorMinuscula.processarTexto(textoOriginal);
        System.out.println("Texto em Minúsculas: " + textoMinusculo);
    }
}
