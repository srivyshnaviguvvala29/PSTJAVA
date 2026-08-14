#TASK 5: Banking Transaction System
import java.util.*;
class BankAccount {
    private int balance;
    void deposit(int amount) {
        balance += amount;
    }
    void withdraw(int amount) {
        balance -= amount;
    }
    int getBalance() {
        return balance;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BankAccount account = new BankAccount();
        for (int i = 0; i < N; i++) {
            String operation = sc.next();
            int amount = sc.nextInt();
            if (operation.equals("Deposit")) {
                account.deposit(amount);
            }
            else if (operation.equals("Withdraw")) {
                account.withdraw(amount);
            }
        }
        System.out.println(account.getBalance());
        sc.close();
    }
}
Output Format
Display final balance.
Sample Input
3
Deposit 5000
Withdraw 2000
Deposit 1000
Sample Output
4000
