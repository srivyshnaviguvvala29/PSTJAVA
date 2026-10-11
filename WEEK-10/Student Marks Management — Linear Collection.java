Question: 4 - Student Marks Management — Linear Collection
 
A teacher does not know the number of students in advance. Student marks need to be stored dynamically.
Question
 
Write a Java program using an ArrayList to:
• Store marks.
• Display marks.
• Find the highest mark.
• Calculate the average
  import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            marks.add(sc.nextInt());
        }

        System.out.println("Marks: " + marks);

        int highest = Collections.max(marks);
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        double average = (double) sum / marks.size();

        System.out.println("Highest mark: " + highest);
        System.out.printf("Average mark: %.2f%n", average);

        sc.close();
    }
}



Sample input
5
85 90 78 95 82


Sample output
Enter number of students: Marks: [85, 90, 78, 95, 82]
Highest mark: 95
Average mark: 86.00
