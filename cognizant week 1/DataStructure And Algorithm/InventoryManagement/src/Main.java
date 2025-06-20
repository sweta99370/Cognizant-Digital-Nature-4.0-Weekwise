public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(1, "Keyboard", 10, 699.00);
        Product p2 = new Product(2, "Mouse", 15, 499.00);

        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.displayAllProducts();

        System.out.println("\nUpdating product 1...\n");
        manager.updateProduct(1, "Gaming Keyboard", 5, 1199.00);
        manager.displayAllProducts();

        System.out.println("\nDeleting product 2...\n");
        manager.deleteProduct(2);
        manager.displayAllProducts();
    }
}
