Question 6 – Maximum Number of Distinct Elements in a Sliding Window
Problem
Given an array and a window size K, find the maximum number of distinct elements present in any contiguous window of size K.
  
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        if (k < 1 || k > n) {
            System.out.println("Invalid window size");
            sc.close();
            return;
        }

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < k; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        int maxDistinct = freq.size();

        for (int i = k; i < n; i++) {
            int outgoing = arr[i - k];
            int count = freq.get(outgoing);

            if (count == 1) {
                freq.remove(outgoing);
            } else {
                freq.put(outgoing, count - 1);
            }

            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            maxDistinct = Math.max(maxDistinct, freq.size());
        }

        System.out.println(maxDistinct);
        sc.close();
    }
}
