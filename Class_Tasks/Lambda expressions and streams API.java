import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> marks =
            Arrays.asList(45, 78, 32, 90, 65, 88, 40, 95);

        List<Integer> updatedMarks = marks.stream()
                .filter(mark -> mark >= 60)
                .map(mark -> mark + 5)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Updated marks in descending order:");
        System.out.println(updatedMarks);

        double average = updatedMarks.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Average: " + average);
    }
}
##sample input:
  78, 90, 65, 88, 95
  ##sample output:
Updated marks in descending order:
[100, 95, 93, 83, 70]
Average: 88.2
