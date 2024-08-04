public class App {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "tv4");
        PedidoFacade pedidoFacade = new PedidoFacade();
        pedidoFacade.processarPedido(produto);
    }
}
