import java.util.*;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class Solution {

    static String count(ArrayList<Object> mylist) {
        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;

        for (Object obj : mylist) {
            if (obj instanceof Student) {
                studentCount++;
            }
            if (obj instanceof Rockstar) {
                rockstarCount++;
            }
            if (obj instanceof Hacker) {
                hackerCount++;
            }
        }

        return studentCount + " " + rockstarCount + " " + hackerCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Object> mylist = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (s.equals("Student")) {
                mylist.add(new Student());
            } 
            else if (s.equals("Rockstar")) {
                mylist.add(new Rockstar());
            } 
            else if (s.equals("Hacker")) {
                mylist.add(new Hacker());
            }
        }

        System.out.println(count(mylist));

        sc.close();
    }
}
Sample Input

5
Student
Student
Rockstar
Student
Hacker
Sample Output

3 1 1
