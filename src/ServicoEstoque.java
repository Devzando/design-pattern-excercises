import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ServicoEstoque {
    public static Produto isAvailable(Produto product) {
        String arquivo = "produtos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosProduto = linha.split(",");
                int idProduto = Integer.parseInt(dadosProduto[0]);
                String nomeProduto = dadosProduto[1];
                Double precoProduto = Double.parseDouble(dadosProduto[2]);

                if (idProduto == product.productId && nomeProduto.equals(product.name)) {
                    System.out.println("Produto " + product.name + " está disponível no estoque.");
                    product.setPrice(precoProduto);
                    return product;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        System.out.println("Produto " + product.name + " não está disponível no estoque.");
        return null;
    }
}