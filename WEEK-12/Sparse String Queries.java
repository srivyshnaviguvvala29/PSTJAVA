Question 2 – Sparse String Queries
Inspired by HackerRank – Sparse Arrays
Problem
You are given a collection of strings followed by a collection of query strings. For every query, determine how many times it occurs in the original collection.
For large input, the solution should avoid scanning the entire collection for every query.
  
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            String query = sc.next();
            System.out.println(freq.getOrDefault(query, 0));
        }

        sc.close();
    }
}
