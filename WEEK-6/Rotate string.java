class Solution {
    public boolean rotateString(String s, String goal) {

        // Lengths must be equal
        if (s.length() != goal.length()) {
            return false;
        }

        // Check if goal exists inside s + s
        String doubled = s + s;

        return doubled.contains(goal);
    }
}
Input: s = "abcde", goal = "cdeab"
Output: true
