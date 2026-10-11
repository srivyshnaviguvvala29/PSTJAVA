Question 1 – Hashtag Frequency Counter
Problem
A social media platform receives N hashtags. Count the frequency of each hashtag and display the hashtags along with their frequencies.
If multiple hashtags have the same frequency, display them in lexicographical order.
  
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TreeMap<String, Integer> freq = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String hashtag = sc.next();
            freq.put(hashtag, freq.getOrDefault(hashtag, 0) + 1);
        }

        for (String hashtag : freq.keySet()) {
            System.out.println(hashtag + " " + freq.get(hashtag));
        }

        sc.close();
    }
}
