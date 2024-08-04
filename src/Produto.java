public class Produto {
    public int productId;
    public String name;
    private double price;
    
    public Produto() {
    }
    
    public Produto(int productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}