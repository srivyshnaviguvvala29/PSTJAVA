QUESTION 3 – DEGREE OF ARRAY
Inspired by HackerRank
Problem
Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
 
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            first.putIfAbsent(nums[i], i);
            last.put(nums[i], i);
        }

        int degree = Collections.max(freq.values());
        int minLength = n;

        for (int key : freq.keySet()) {
            if (freq.get(key) == degree) {
                int length = last.get(key) - first.get(key) + 1;
                minLength = Math.min(minLength, length);
            }
        }

        System.out.println(minLength);
        sc.close();
    }
}
