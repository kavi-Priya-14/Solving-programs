package search;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P101", "Laptop", "Electronics"),
            new Product("P102", "Mouse", "Electronics"),
            new Product("P103", "Shoes", "Fashion"),
            new Product("P104", "Keyboard", "Electronics")
        };

        String searchName = "Shoes";

        System.out.println("=== Linear Search ===");
        Product result1 = SearchEngine.linearSearch(products, searchName);
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("\n=== Binary Search ===");
        Product result2 = SearchEngine.binarySearch(products, searchName);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
