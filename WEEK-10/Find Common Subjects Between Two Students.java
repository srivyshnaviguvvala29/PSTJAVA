Question: 8 Find Common Subjects Between Two Students
 
Scenario:
 
Two students have selected different subjects. Write a Java program using retainAll() to find the subjects common to both.
  import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> student1 = new ArrayList<>();
        ArrayList<String> student2 = new ArrayList<>();

        System.out.print("Enter number of subjects for Student 1: ");
        int n1 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            student1.add(sc.next());
        }

        System.out.print("Enter number of subjects for Student 2: ");
        int n2 = sc.nextInt();

        for (int i = 0; i < n2; i++) {
            student2.add(sc.next());
        }

        student1.retainAll(student2);

        System.out.println("Common subjects: " + student1);

        sc.close();
    }
}



Sample input
4
Java Python DBMS OS
3
Python DBMS AI


Sample output
Enter number of subjects for Student 1: Enter number of subjects for Student 2: Common subjects: [Python, DBMS]
