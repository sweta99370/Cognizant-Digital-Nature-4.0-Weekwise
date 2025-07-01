public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Watch", "Accessories"),
            new Product(4, "Phone", "Electronics")
        };

        System.out.println("Linear Search: Searching for 'Shoes'...");
        Product found1 = SearchUtil.linearSearch(products, "Shoes");
        System.out.println(found1 != null ? found1 : "Product not found.");

        System.out.println("\nBinary Search: Searching for 'Watch'...");
        Product found2 = SearchUtil.binarySearch(products, "Watch");
        System.out.println(found2 != null ? found2 : "Product not found.");
    }
}
