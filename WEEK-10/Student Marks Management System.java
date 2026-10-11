Question: 2 - Student Marks Management System
A teacher wants to create a Java program to store the marks of students in a class. 
The number of students is not known in advance, so the program should use a dynamic array. 
The teacher can add marks one by one, and the array should automatically increase its size when it becomes full.
  import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[2];
        int size = 0;

        System.out.print("Enter number of marks: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int mark = sc.nextInt();

            if (size == marks.length) {
                marks = Arrays.copyOf(marks, marks.length * 2);
            }

            marks[size++] = mark;
        }

        System.out.println("Student marks:");
        for (int i = 0; i < size; i++) {
            System.out.print(marks[i] + " ");
        }

        sc.close();
    }
}



Sample input
5
85 90 78 95 88


Sample output
Enter number of marks: Student marks:
85 90 78 95 88
