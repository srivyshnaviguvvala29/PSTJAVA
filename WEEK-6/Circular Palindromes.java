import java.util.*;

public class Solution {

    public static int[] circularPalindromes(String s) {

        int n = s.length();
        int[] answer = new int[n];

        String doubled = s + s;

        for (int start = 0; start < n; start++) {

            int maxLength = 1;

            // Odd length palindromes
            for (int center = start; center < start + n; center++) {

                int left = center;
                int right = center;

                while (left >= start &&
                       right < start + n &&
                       doubled.charAt(left) == doubled.charAt(right)) {

                    int length = right - left + 1;

                    if (length > maxLength && length <= n) {
                        maxLength = length;
                    }

                    left--;
                    right++;
                }
            }

            // Even length palindromes
            for (int center = start; center < start + n - 1; center++) {

                int left = center;
                int right = center + 1;

                while (left >= start &&
                       right < start + n &&
                       doubled.charAt(left) == doubled.charAt(right)) {

                    int length = right - left + 1;

                    if (length > maxLength && length <= n) {
                        maxLength = length;
                    }

                    left--;
                    right++;
                }
            }

            answer[start] = maxLength;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int[] result = circularPalindromes(s);

        for (int value : result) {
            System.out.println(value);
        }

        sc.close();
    }
}
Sample Input
5
abcba
Sample Output
5
3
3
3
5
