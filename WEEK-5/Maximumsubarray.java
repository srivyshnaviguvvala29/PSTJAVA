import java.io.*;
import java.util.*;

class Result {

    public static List<Integer> maxSubarray(List<Integer> arr) {

        // Maximum Subarray - Kadane's Algorithm
        int currentSum = arr.get(0);
        int maxSubarray = arr.get(0);

        // Maximum Subsequence
        int maxElement = arr.get(0);
        int maxSubsequence = 0;

        for (int i = 0; i < arr.size(); i++) {

            int value = arr.get(i);

            // Maximum subsequence
            maxElement = Math.max(maxElement, value);

            if (value > 0) {
                maxSubsequence += value;
            }

            // Maximum subarray
            if (i > 0) {
                currentSum = Math.max(value, currentSum + value);
                maxSubarray = Math.max(maxSubarray, currentSum);
            }
        }

        // If all elements are negative
        if (maxSubsequence == 0) {
            maxSubsequence = maxElement;
        }

        return Arrays.asList(maxSubarray, maxSubsequence);
    }
}
##sample input
2
4
1 2 3 4
6
2 -1 2 3 4 -5
##Sample Output 
0
10 10
10 11
