Question 3 – Top K Frequent Elements
Inspired by LeetCode 347
Problem
Given an integer array and an integer K, find the K most frequently occurring elements.
  
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        int k = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int cmp = Integer.compare(freq.get(b), freq.get(a));
            return cmp != 0 ? cmp : Integer.compare(a, b);
        });

        pq.addAll(freq.keySet());

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            result.add(pq.poll());
        }

        System.out.println(result);
        sc.close();
    }
}

