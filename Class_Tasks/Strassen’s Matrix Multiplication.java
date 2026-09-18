import java.util.*;

public class Main {
    static long[][] normalMultiply(long[][] A, long[][] B) {
        int n = A.length;
        long[][] C = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < n; j++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }
    static long[][] add(long[][] A, long[][] B) {
        int n = A.length;
        long[][] C = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        return C;
    }
    static long[][] subtract(long[][] A, long[][] B) {
        int n = A.length;
        long[][] C = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        return C;
    }
    static long[][] strassen(long[][] A, long[][] B) {

        int n = A.length;
        if (n <= 2) {
            return normalMultiply(A, B);
        }

        int half = n / 2;
        long[][] A11 = new long[half][half];
        long[][] A12 = new long[half][half];
        long[][] A21 = new long[half][half];
        long[][] A22 = new long[half][half];
        long[][] B11 = new long[half][half];
        long[][] B12 = new long[half][half];
        long[][] B21 = new long[half][half];
        long[][] B22 = new long[half][half];

        for (int i = 0; i < half; i++) {
            for (int j = 0; j < half; j++) {

                A11[i][j] = A[i][j];
                A12[i][j] = A[i][j + half];
                A21[i][j] = A[i + half][j];
                A22[i][j] = A[i + half][j + half];

                B11[i][j] = B[i][j];
                B12[i][j] = B[i][j + half];
                B21[i][j] = B[i + half][j];
                B22[i][j] = B[i + half][j + half];
            }
        }
        long[][] M1 = strassen(
                add(A11, A22),
                add(B11, B22)
        );

        long[][] M2 = strassen(
                add(A21, A22),
                B11
        );

        long[][] M3 = strassen(
                A11,
                subtract(B12, B22)
        );

        long[][] M4 = strassen(
                A22,
                subtract(B21, B11)
        );

        long[][] M5 = strassen(
                add(A11, A12),
                B22
        );

        long[][] M6 = strassen(
                subtract(A21, A11),
                add(B11, B12)
        );

        long[][] M7 = strassen(
                subtract(A12, A22),
                add(B21, B22)
        );

        long[][] C11 = add(
                subtract(add(M1, M4), M5),
                M7
        );

        long[][] C12 = add(M3, M5);

        long[][] C21 = add(M2, M4);

        long[][] C22 = add(
                subtract(add(M1, M3), M2),
                M6
        );

        long[][] C = new long[n][n];

        for (int i = 0; i < half; i++) {
            for (int j = 0; j < half; j++) {

                C[i][j] = C11[i][j];
                C[i][j + half] = C12[i][j];

                C[i + half][j] = C21[i][j];
                C[i + half][j + half] = C22[i][j];
            }
        }

        return C;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[][] A = new long[n][n];
        long[][] B = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextLong();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextLong();
            }
        }
        long[][] result = strassen(A, B);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j]);

                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
Sample Input
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
16 15 14 13
12 11 10 9
8 7 6 5
4 3 2 1
Sample Output
80 70 60 50
240 214 188 162
400 358 316 274
560 502 444 386
