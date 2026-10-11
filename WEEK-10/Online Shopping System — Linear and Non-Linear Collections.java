Question 1: Advanced Problem-Solving Approach using linear and non-linear collections.
An online shopping system must maintain products, quickly search products by ID, and process orders according to priority.
import java.util.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return id + " " + name + " " + price;
    }
}

class Order implements Comparable<Order> {
    int orderId;
    int priority;

    Order(int orderId, int priority) {
        this.orderId = orderId;
        this.priority = priority;
    }

    public int compareTo(Order o) {
        return Integer.compare(o.priority, this.priority);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        HashMap<Integer, Product> productMap = new HashMap<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double price = sc.nextDouble();

            Product p = new Product(id, name, price);
            products.add(p);
            productMap.put(id, p);
        }

        System.out.println("Products:");
        for (Product p : products) {
            System.out.println(p);
        }

        System.out.print("Enter product ID to search: ");
        int searchId = sc.nextInt();

        if (productMap.containsKey(searchId)) {
            System.out.println("Found: " + productMap.get(searchId));
        } else {
            System.out.println("Product not found");
        }

        PriorityQueue<Order> orders = new PriorityQueue<>();

        System.out.print("Enter number of orders: ");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int orderId = sc.nextInt();
            int priority = sc.nextInt();
            orders.add(new Order(orderId, priority));
        }

        System.out.println("Orders by priority:");
        while (!orders.isEmpty()) {
            Order o = orders.poll();
            System.out.println(o.orderId + " " + o.priority);
        }

        sc.close();
    }
}
Sample input
3
101 Laptop 55000
102 Mouse 800
103 Keyboard 1500
102
3
201 2
202 5
203 1


Sample output
Enter number of products: Products:
101 Laptop 55000.0
102 Mouse 800.0
103 Keyboard 1500.0
Enter product ID to search: Found: 102 Mouse 800.0
Enter number of orders: Orders by priority:
202 5
201 2
203 1
