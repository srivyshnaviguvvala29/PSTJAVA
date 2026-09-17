import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {

    public boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    public PerformOperation isPrime() {
        return n -> {
            if (n < 2) {
                return false;
            }

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return n -> {
            int original = n;
            int reverse = 0;

            while (n > 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n /= 10;
            }

            return original == reverse;
        };
    }
}
##sampe output
  5
1 4
2 5
3 5
4 7
5 121
