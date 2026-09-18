#TASK2 Real-Time Stream Analytics Engine
import java.util.*;
import java.util.stream.*;
class SensorReading {
    String sensorId;
    double temperature;
    SensorReading(String sensorId, double temperature) {
        this.sensorId = sensorId;
        this.temperature = temperature;
    }
    public String getSensorId() {
        return sensorId;
    }
    public double getTemperature() {
        return temperature;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<SensorReading> readings = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String sensorId = sc.next();
            double temperature = sc.nextDouble();
            readings.add(new SensorReading(sensorId, temperature));
        }
        Map<String, Double> averageTemperatures = readings.stream()
                .filter(r -> r.getTemperature() > 50)
                .collect(Collectors.groupingBy(
                        SensorReading::getSensorId,
                        Collectors.averagingDouble(SensorReading::getTemperature)
                ));
        averageTemperatures.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(entry ->
                        System.out.println(entry.getKey() + " " + entry.getValue())
                );
        sc.close();
    }
}
Sample Input
6
S1 60
S2 40
S1 80
S3 70
S2 90
S3 30
Sample Output
S1 70.0
S2 90.0
S3 70.0
