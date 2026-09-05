class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {

        // First: score in decreasing order
        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);
        }

        // If score is same: name in alphabetical order
        return a.name.compareTo(b.name);
    }
}
##sample input
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
##Sample Output
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
