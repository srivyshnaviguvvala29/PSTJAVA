Question 6: Find All Unique Items Purchased
 
Scenario:
A customer purchases several items, including repeated items. 
Write a Java program using a LinkedHashSet to display only unique items in the order they were purchased.
  import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> items = new LinkedHashSet<>();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            items.add(sc.next());
        }

        System.out.println("Unique items: " + items);

        sc.close();
    }
}



Sample input
7
Milk Bread Eggs Milk Rice Bread Juice


Sample output
Enter number of items: Unique items: [Milk, Bread, Eggs, Rice, Juice]
