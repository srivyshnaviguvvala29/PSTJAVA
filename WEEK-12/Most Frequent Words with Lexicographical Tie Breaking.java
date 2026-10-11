Question 8 – Most Frequent Words with Lexicographical Tie Breaking
Inspired by LeetCode 692
Problem
Given N words and an integer K, find the K most frequent words.
Rules:
1. Higher frequency comes first.
2. If two words have the same frequency, the lexicographically smaller word comes first.
  
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        int k = sc.nextInt();

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int cmp = Integer.compare(freq.get(b), freq.get(a));
            return cmp != 0 ? cmp : a.compareTo(b);
        });

        pq.addAll(freq.keySet());

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            result.add(pq.poll());
        }

        System.out.println(result);
        sc.close();
    }
}

