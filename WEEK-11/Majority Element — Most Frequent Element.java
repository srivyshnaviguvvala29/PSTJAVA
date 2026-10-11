QUESTION 1 – MOST FREQUENT ELEMENT WITH FIRST INDEX
Inspired by HackerRank (169. Majority Element)
Problem
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
• Input: nums = [3,2,3]
• Output: 3
Example 2:
• Input: nums = [2,2,1,1,1,2,2]
• Output: 2
Constraints:
• n == nums.length
• 1 <= n <= 5 * 104
• -109 <= nums[i] <= 109
• The input is generated such that a majority element will exist in the array.
  
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println(candidate);
        sc.close();
    }
}
