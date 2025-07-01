package inventory;

import java.util.HashMap;

public class InventoryManager {
    private HashMap<String, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    public void showInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
    }
}
