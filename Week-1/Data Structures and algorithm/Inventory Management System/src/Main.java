package inventory;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product("P101", "Laptop", 10, 55000);
        Product p2 = new Product("P102", "Mouse", 50, 500);
        Product p3 = new Product("P103", "Keyboard", 40, 1500);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println("=== Initial Inventory ===");
        manager.showInventory();

        manager.updateProduct("P102", 45, 520);
        System.out.println("\n=== After Updating Mouse ===");
        manager.showInventory();

        manager.deleteProduct("P101");
        System.out.println("\n=== After Deleting Laptop ===");
        manager.showInventory();
    }
}
