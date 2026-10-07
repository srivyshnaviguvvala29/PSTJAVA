import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Object> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        Iterator<Object> iterator = list.iterator();

        while (iterator.hasNext()) {
            Object value = iterator.next();

            if (value instanceof Integer) {
                System.out.println(value);
            }
        }
    }
}
##Sample Output
  Hello
Java
