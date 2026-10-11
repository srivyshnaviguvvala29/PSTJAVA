Question 5 – Frequency Queries
Inspired by HackerRank – Frequency Queries
Problem
Maintain a collection of integers and support three operations:
1 x → Insert x
2 x → Delete one occurrence of x
3 f → Check whether any number occurs exactly f times
Print 1 if an element has frequency f, otherwise print 0.
  
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> freqCount = new HashMap<>();

        for (int i = 0; i < q; i++) {
            int op = sc.nextInt();
            int x = sc.nextInt();

            if (op == 1) {
                int old = freq.getOrDefault(x, 0);

                if (old > 0) {
                    freqCount.put(old, freqCount.get(old) - 1);
                }

                freq.put(x, old + 1);
                freqCount.put(old + 1,
                    freqCount.getOrDefault(old + 1, 0) + 1);

            } else if (op == 2) {
                int old = freq.getOrDefault(x, 0);

                if (old > 0) {
                    freqCount.put(old, freqCount.get(old) - 1);

                    if (old == 1) {
                        freq.remove(x);
                    } else {
                        freq.put(x, old - 1);
                        freqCount.put(old - 1,
                            freqCount.getOrDefault(old - 1, 0) + 1);
                    }
                }

            } else if (op == 3) {
                System.out.println(
                    freqCount.getOrDefault(x, 0) > 0 ? 1 : 0
                );
            }
        }

        sc.close();
    }
}
