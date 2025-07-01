public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 1200.0),
            new Order(2, "Bob", 2999.0),
            new Order(3, "Charlie", 450.0),
            new Order(4, "Diana", 1800.0)
        };

        System.out.println("Original Orders:");
        SortUtil.printOrders(orders);

        // Bubble Sort
        System.out.println("\nOrders Sorted by Bubble Sort:");
        SortUtil.bubbleSort(orders);
        SortUtil.printOrders(orders);

        // Reset data for Quick Sort
        orders = new Order[] {
            new Order(1, "Alice", 1200.0),
            new Order(2, "Bob", 2999.0),
            new Order(3, "Charlie", 450.0),
            new Order(4, "Diana", 1800.0)
        };

        System.out.println("\nOrders Sorted by Quick Sort:");
        SortUtil.quickSort(orders, 0, orders.length - 1);
        SortUtil.printOrders(orders);
    }
}
