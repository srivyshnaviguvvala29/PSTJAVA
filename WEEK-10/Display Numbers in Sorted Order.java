Question: 7 Display Numbers in Sorted Order
 
Scenario: A teacher enters students' marks, but some marks are repeated.
Write a Java program using a TreeSet to display the unique marks in ascending order.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> marks = new TreeSet<>();

        System.out.print("Enter number of marks: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            marks.add(sc.nextInt());
        }

        System.out.println("Sorted unique marks: " + marks);

        sc.close();
    }
}



Sample input
7
85 70 95 85 60 70 90


Sample output
Enter number of marks: Sorted unique marks: [60, 70, 85, 90, 95]
