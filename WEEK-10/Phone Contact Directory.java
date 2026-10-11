Question 10 - Phone Contact Directory
Scenario
A mobile application stores people's names and phone numbers. Users can search for a contact or update an existing phone number.
  import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> contacts = new HashMap<>();

        System.out.print("Enter number of contacts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String phone = sc.next();
            contacts.put(name, phone);
        }

        System.out.print("Enter name to search: ");
        String searchName = sc.next();

        if (contacts.containsKey(searchName)) {
            System.out.println("Phone number: " +
                               contacts.get(searchName));
        } else {
            System.out.println("Contact not found");
        }

        System.out.print("Enter name to update: ");
        String updateName = sc.next();

        if (contacts.containsKey(updateName)) {
            System.out.print("Enter new phone number: ");
            String newPhone = sc.next();

            contacts.put(updateName, newPhone);

            System.out.println("Contact updated successfully");
            System.out.println("Updated number: " +
                               contacts.get(updateName));
        } else {
            System.out.println("Contact not found");
        }

        sc.close();
    }
}



Sample input
3
Ravi 9876543210
Priya 9876501234
Arun 9123456780
Priya
Priya
9000011111


Sample output
Enter number of contacts: Enter name to search: Phone number: 9876501234
Enter name to update: Enter new phone number: Contact updated successfully
Updated number: 9000011111
