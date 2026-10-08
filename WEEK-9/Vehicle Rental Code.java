Problem Statement
Design a Vehicle Rental System using Java inheritance and runtime polymorphism.
Create a base class Vehicle with the following attributes:
• vehicleNumber
• rentPerDay
Create three subclasses:
• Car
• Bike
• Truck
 
Each subclass must override the method:
• double calculateRent(int days)
 
The rental amount is calculated as follows:
• Car: rentPerDay × days
• Bike: rentPerDay × days × 0.90 (10% discount)
• Truck: rentPerDay × days × 1.20 (20% additional charge)
 
Input Format:
 
The first line contains an integer N, representing the number of vehicles.
Each of the next N lines contains:
               vehicleType vehicleNumber rentPerDay days
where:
• vehicleType = 1 → Car
• vehicleType = 2 → Bike
• vehicleType = 3 → Truck
 
Output Format
For each vehicle, print:
             vehicleNumber totalRent
Round the total rent to two decimal places.
 
Constraints
• 1 ≤ N ≤ 100
• 1 ≤ rentPerDay ≤ 10000
• 1 ≤ days ≤ 365
 
Sample Input
3
1 CAR101 2000 3
2 BIKE201 500 4
3 TRUCK301 3000 2
Sample Output
CAR101 6000.00
BIKE201 1800.00
TRUCK301 7200.00
  PROGRAM:
import java.util.*;

class Vehicle {
    String vehicleNumber;
    double rentPerDay;

    Vehicle(String vehicleNumber, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.rentPerDay = rentPerDay;
    }

    double calculateRent(int days) {
        return rentPerDay * days;
    }
}

class Car extends Vehicle {

    Car(String vehicleNumber, double rentPerDay) {
        super(vehicleNumber, rentPerDay);
    }

    @Override
    double calculateRent(int days) {
        return rentPerDay * days;
    }
}

class Bike extends Vehicle {

    Bike(String vehicleNumber, double rentPerDay) {
        super(vehicleNumber, rentPerDay);
    }

    @Override
    double calculateRent(int days) {
        return rentPerDay * days * 0.90;
    }
}

class Truck extends Vehicle {

    Truck(String vehicleNumber, double rentPerDay) {
        super(vehicleNumber, rentPerDay);
    }

    @Override
    double calculateRent(int days) {
        return rentPerDay * days * 1.20;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            int vehicleType = sc.nextInt();
            String vehicleNumber = sc.next();
            double rentPerDay = sc.nextDouble();
            int days = sc.nextInt();

            Vehicle vehicle;

            if (vehicleType == 1) {
                vehicle = new Car(vehicleNumber, rentPerDay);
            } 
            else if (vehicleType == 2) {
                vehicle = new Bike(vehicleNumber, rentPerDay);
            } 
            else {
                vehicle = new Truck(vehicleNumber, rentPerDay);
            }

            double totalRent = vehicle.calculateRent(days);

            System.out.printf("%s %.2f%n", vehicle.vehicleNumber, totalRent);
        }

        sc.close();
    }
}
