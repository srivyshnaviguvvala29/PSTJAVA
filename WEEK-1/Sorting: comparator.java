import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {

        if (a.score != b.score) {
            return Integer.compare(b.score, a.score);
        }

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
##sample output
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
