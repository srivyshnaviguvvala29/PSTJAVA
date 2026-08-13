#TASK7:HashTag Frequency Counter
 import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<String, Integer> frequency = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String hashtag = sc.next();
            
            frequency.put(hashtag, frequency.getOrDefault(hashtag, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        sc.close();
    }
}
##Sample Input
5
java
python
java
ai
python
##Sample Output
java 2
python 2
ai 1
