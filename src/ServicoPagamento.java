import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ServicoPagamento {
    public static boolean makePayment(double valorProduto) {
        String arquivoConta = "contaCliente.txt";
        double saldoConta = 0.0;

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoConta))) {
            String linha = br.readLine();
            if (linha != null) {
                saldoConta = Double.parseDouble(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de conta: " + e.getMessage());
            return false;
        }

        if (saldoConta >= valorProduto) {
            saldoConta -= valorProduto;
            System.out.println("Pagamento de " + valorProduto + " realizado com sucesso.");
            System.out.println("Novo saldo: " + saldoConta);

            try (FileWriter writer = new FileWriter(arquivoConta)) {
                writer.write(Double.toString(saldoConta));
            } catch (IOException e) {
                System.out.println("Erro ao atualizar o saldo da conta: " + e.getMessage());
                return false;
            }

            return true;
        } else {
            System.out.println("Saldo insuficiente. Pagamento não realizado.");
            return false;
        }
    }
}