Question: 5 - Music Playlist — Singly Linked List
Scenario
A music application maintains songs in a playlist. Users can add songs to the playlist and remove a song when they no longer want it.
Question
Implement a linked list playlist that supports:
1. Adding songs.
2. Removing a song.
3. Displaying the playlist.
  import java.util.*;

class Node {
    String song;
    Node next;

    Node(String song) {
        this.song = song;
        this.next = null;
    }
}

public class Main {
    static Node head;

    static void addSong(String song) {
        Node newNode = new Node(song);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    static void removeSong(String song) {
        if (head == null) {
            return;
        }

        if (head.song.equals(song)) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null &&
               !temp.next.song.equals(song)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.song);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            addSong(sc.next());
        }

        System.out.println("Playlist:");
        display();

        System.out.print("Enter song to remove: ");
        String song = sc.next();

        removeSong(song);

        System.out.println("Updated playlist:");
        display();

        sc.close();
    }
}



Sample input
4
Melody Alpha Rhythm Dream
Rhythm


Sample output
Enter number of songs: Playlist:
Melody -> Alpha -> Rhythm -> Dream
Enter song to remove: Updated playlist:
Melody -> Alpha -> Dream
