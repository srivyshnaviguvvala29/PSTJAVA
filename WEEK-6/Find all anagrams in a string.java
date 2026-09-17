import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        // Count characters of p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int windowSize = p.length();

        // Sliding window
        for (int i = 0; i < s.length(); i++) {

            // Add current character
            windowCount[s.charAt(i) - 'a']++;

            // Remove character outside the window
            if (i >= windowSize) {
                windowCount[s.charAt(i - windowSize) - 'a']--;
            }

            // Check whether current window is an anagram
            if (i >= windowSize - 1 &&
                Arrays.equals(pCount, windowCount)) {

                result.add(i - windowSize + 1);
            }
        }

        return result;
    }
}
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
