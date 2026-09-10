class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] prefix = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prefix[i + 1][j + 1] =
                        prefix[i][j + 1]
                        + prefix[i + 1][j]
                        - prefix[i][j]
                        + mat[i][j];
            }
        }
        int[][] answer = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int rowStart = Math.max(0, i - k);
                int colStart = Math.max(0, j - k);

                int rowEnd = Math.min(m - 1, i + k);
                int colEnd = Math.min(n - 1, j + k);

                answer[i][j] =
                        prefix[rowEnd + 1][colEnd + 1]
                        - prefix[rowStart][colEnd + 1]
                        - prefix[rowEnd + 1][colStart]
                        + prefix[rowStart][colStart];
            }
        }

        return answer;
    }
}
##sample input
mat =[[1,2,3],[4,5,6],[7,8,9]]
k =1
##sample Output
[[12,21,16],[27,45,33],[24,39,28]]
