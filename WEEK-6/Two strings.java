import java.io.*;
import java.util.*;

class Result {

    public static String twoStrings(String s1, String s2) {

        boolean[] present = new boolean[26];

        // Store characters of first string
        for (char c : s1.toCharArray()) {
            present[c - 'a'] = true;
        }

        // Check characters of second string
        for (char c : s2.toCharArray()) {
            if (present[c - 'a']) {
                return "YES";
            }
        }

        return "NO";
    }
}
Sample Input

2
hello
world
hi
world
Sample Output

YES
NO
