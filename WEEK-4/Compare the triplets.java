public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    
    int aliceScore = 0;
    int bobScore = 0;
    
    for (int i = 0; i < 3; i++) {
        
        if (a.get(i) > b.get(i)) {
            aliceScore++;
        } 
        else if (a.get(i) < b.get(i)) {
            bobScore++;
        }
    }
    
    List<Integer> result = new ArrayList<>();
    result.add(aliceScore);
    result.add(bobScore);
    
    return result;
}

  ##sample input
  17 28 30
  99 16 8
  ##sample output
  2 1
