public class PedidoFacade {
    private ServicoEstoque servicoEstoque;
    private ServicoPagamento servicoPagamento;
    private ServicoRemessa servicoRemessa;

    public PedidoFacade() {
        servicoEstoque = new ServicoEstoque();
        servicoPagamento = new ServicoPagamento();
        servicoRemessa = new ServicoRemessa();
    }

    public void processarPedido(Produto produto) {
        if (ServicoEstoque.isAvailable(produto) != null) {
            if (ServicoPagamento.makePayment(produto.getPrice())) {
                ServicoRemessa.shipProduct(produto);
                System.out.println("Pedido processado com sucesso.");
            } else {
                System.out.println("Falha no pagamento. Pedido não processado.");
            }
        } else {
            System.out.println("Produto indisponível no estoque. Pedido não processado.");
        }
    }
}