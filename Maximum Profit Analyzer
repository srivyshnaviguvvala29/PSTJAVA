#TASK 3:Maximum Profit Analyzer
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < N; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
        sc.close();
    }
}
Sample Input
8
-2 -3 4 -1 -2 1 5 -3
Sample Output
7
