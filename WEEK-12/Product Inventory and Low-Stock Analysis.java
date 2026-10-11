Question 10 – Product Inventory and Low-Stock Analysis
Problem
A supermarket maintains product information:
Product ID
Product Name
Stock
Price
Perform the following:
1. Update stock after sales.
2. Find products whose stock is below a given threshold.
3. Display products sorted by remaining stock.
4. Efficiently retrieve products using their ID.
  
import java.util.*;

class Product {
    int id;
    String name;
    int stock;
    double price;

    Product(int id, String name, int stock, double price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String toString() {
        return id + " " + name + " " + stock + " " + price;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<Integer, Product> inventory = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int stock = sc.nextInt();
            double price = sc.nextDouble();

            inventory.put(id, new Product(id, name, stock, price));
        }

        int sales = sc.nextInt();

        for (int i = 0; i < sales; i++) {
            int id = sc.nextInt();
            int quantity = sc.nextInt();

            Product p = inventory.get(id);

            if (p != null && quantity >= 0 && quantity <= p.stock) {
                p.stock -= quantity;
            }
        }

        int threshold = sc.nextInt();

        System.out.println("Low-stock products:");
        for (Product p : inventory.values()) {
            if (p.stock < threshold) {
                System.out.println(p);
            }
        }

        ArrayList<Product> sorted =
            new ArrayList<>(inventory.values());

        sorted.sort((a, b) -> {
            int cmp = Integer.compare(a.stock, b.stock);
            return cmp != 0 ? cmp : Integer.compare(a.id, b.id);
        });

        System.out.println("Sorted inventory:");
        for (Product p : sorted) {
            System.out.println(p);
        }

        int searchId = sc.nextInt();
        Product found = inventory.get(searchId);

        if (found != null) {
            System.out.println("Product found: " + found);
        } else {
            System.out.println("Product not found");
        }

        sc.close();
    }
}
