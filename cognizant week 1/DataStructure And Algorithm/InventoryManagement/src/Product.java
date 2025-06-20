public class Product {
    private int productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public void setProductName(String name) { this.productName = name; }
    public void setQuantity(int qty) { this.quantity = qty; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName +
               ", Quantity: " + quantity + ", Price: ₹" + price;
    }
}
