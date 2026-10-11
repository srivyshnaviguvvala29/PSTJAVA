Question: 9 - Student Marks Using HashMap
 
Scenario:
 
A teacher wants to store the marks of students using their roll numbers as keys. 
  Write a Java program to display the marks of a particular student.
  import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> marks = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int rollNo = sc.nextInt();
            int mark = sc.nextInt();

            marks.put(rollNo, mark);
        }

        System.out.print("Enter roll number to search: ");
        int searchRoll = sc.nextInt();

        if (marks.containsKey(searchRoll)) {
            System.out.println("Student mark: " +
                               marks.get(searchRoll));
        } else {
            System.out.println("Student not found");
        }

        sc.close();
    }
}



Sample input
3
101 85
102 92
103 78
102


Sample output
Enter number of students: Enter roll number to search: Student mark: 92
