import java.util.*;

public class Solution {

    public static int marsExploration(String s) {
        String pattern = "SOS";
        int changes = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != pattern.charAt(i % 3)) {
                changes++;
            }
        }

        return changes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(marsExploration(s));

        sc.close();
    }
}
##sample input
  SOSSPSSQSSOR
  ##sample output
  3
