package sortorders;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O101", "Alice", 4500.0),
            new Order("O102", "Bob", 3200.0),
            new Order("O103", "Charlie", 8000.0),
            new Order("O104", "Diana", 1200.0)
        };

        System.out.println("=== Bubble Sort (Descending by Total Price) ===");
        Sorter.bubbleSort(orders);
        Sorter.printOrders(orders);

        System.out.println("\n=== Quick Sort (Descending by Total Price) ===");
        Order[] quickOrders = {
            new Order("O101", "Alice", 4500.0),
            new Order("O102", "Bob", 3200.0),
            new Order("O103", "Charlie", 8000.0),
            new Order("O104", "Diana", 1200.0)
        };
        Sorter.quickSort(quickOrders, 0, quickOrders.length - 1);
        Sorter.printOrders(quickOrders);
    }
}
