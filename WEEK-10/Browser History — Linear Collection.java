Question: 3 - Browser History — Linear Collection
 
A web browser stores recently visited pages. When the user presses the Back button, the most recently visited page should be removed first.
  import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> history = new Stack<>();

        System.out.print("Enter number of pages: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            history.push(sc.next());
        }

        System.out.println("Browser history: " + history);

        if (!history.isEmpty()) {
            System.out.println("Back from: " + history.pop());
        }

        System.out.println("Current history: " + history);

        sc.close();
    }
}



Sample input
4
Google YouTube GitHub Gmail


Sample output
Enter number of pages: Browser history: [Google, YouTube, GitHub, Gmail]
Back from: Gmail
Current history: [Google, YouTube, GitHub]
