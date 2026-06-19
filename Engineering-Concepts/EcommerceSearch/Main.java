public class Main {

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Fashion")
        };

        int searchId = 104;

        Product result1 = SearchAlgorithms.linearSearch(products, searchId);

        if (result1 != null) {
            System.out.println("Linear Search Found: " + result1.productName);
        } else {
            System.out.println("Product not found");
        }

        Product result2 = SearchAlgorithms.binarySearch(products, searchId);

        if (result2 != null) {
            System.out.println("Binary Search Found: " + result2.productName);
        } else {
            System.out.println("Product not found");
        }
    }
}