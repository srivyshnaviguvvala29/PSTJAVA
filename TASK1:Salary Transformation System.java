## Task1:SALARY TRANSFORMATION SYSTEM
import java.util.*;
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> salaries = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            salaries.add(sc.nextInt());
        }
        salaries.stream()
                .map(salary -> salary + (salary * 10 / 100))
                .forEach(salary -> System.out.print(salary + " "));
    }
}
## Salary Transformation
### Input
5
1000 2000 3000 4000 5000

### Output
1100 2200 3300 4400 5500
