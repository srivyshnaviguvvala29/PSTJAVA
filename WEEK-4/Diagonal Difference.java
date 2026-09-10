public static int diagonalDifference(List<List<Integer>> arr) {
    int primarySum = 0;
    int secondarySum = 0;
    int n = arr.size();
    for (int i = 0; i < n; i++) {
        primarySum += arr.get(i).get(i);
        secondarySum += arr.get(i).get(n - 1 - i);
    }
    return Math.abs(primarySum - secondarySum);
}
##sample input
  STDIN      Function
-----      --------
3           arr[][] sizes n = 3, m = 3
11 2 4     arr = [[11, 2, 4], [4, 5, 6], [10, 8, -12]]
4 5 6
10 8 -12
  ##sample output
  15
