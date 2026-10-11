Question 9 – Student Marks Indexing System
Problem
A university stores student records containing:
Student ID
Student Name
Marks
Given multiple queries containing a student ID, efficiently retrieve the corresponding student's name and marks.
The solution must avoid scanning all student records for each query.
  
import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<Integer, Student> students = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int marks = sc.nextInt();

            students.put(id, new Student(name, marks));
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int id = sc.nextInt();

            if (students.containsKey(id)) {
                Student s = students.get(id);
                System.out.println(s.name + " " + s.marks);
            } else {
                System.out.println("Student not found");
            }
        }

        sc.close();
    }
}
