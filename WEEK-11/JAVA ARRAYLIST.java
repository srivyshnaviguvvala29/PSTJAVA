QUESTION 5 - JAVA ARRAYLIST
Inspired by HackerRank
Problem
You are given lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in position of line.
Take your input from System.in.
Input Format
The first line has an integer . In each of the next lines there will be an integer denoting number of integers on that line and then there will be space-separated integers. In the next line there will be an integer denoting number of queries. Each query will consist of two integers and .
• Each number will fit in signed integer.
• Total number of integers in lines will not cross .
Output Format
In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"
  
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                list.add(sc.nextInt());
            }

            lines.add(list);
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x >= 1 && x <= n &&
                y >= 1 && y <= lines.get(x - 1).size()) {
                System.out.println(lines.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}
