import java.util.*;
class InvalidBookingException extends Exception {
    public InvalidBookingException(String message) {
        super(message);
    }
}
abstract class Vehicle {
    protected String vehicleNumber;
    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    abstract double calculateFare(double distance);
}
class Bike extends Vehicle {
    public Bike(String vehicleNumber) {
        super(vehicleNumber);
    }
    @Override
    double calculateFare(double distance) {
        return distance * 5;
    }
}

class Auto extends Vehicle {
    public Auto(String vehicleNumber) {
        super(vehicleNumber);
    }
    @Override
    double calculateFare(double distance) {
        return distance * 12;
    }
}

class Cab extends Vehicle {
    public Cab(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    double calculateFare(double distance) {
        return distance * 12;
    }
}
class Driver {
    private String name;
    public Driver(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Rider {
    private String name;
    public Rider(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Trip {
    private Driver driver;
    private Rider rider;
    private Vehicle vehicle;
    private double distance;
    public Trip(Driver driver, Rider rider, Vehicle vehicle, double distance)
            throws InvalidBookingException {
        if (distance <= 0) {
            throw new InvalidBookingException(
                    "Distance must be greater than 0"
            );
        }
        if (driver == null || rider == null || vehicle == null) {
            throw new InvalidBookingException(
                    "Invalid booking details"
            );
        }
        this.driver = driver;
        this.rider = rider;
        this.vehicle = vehicle;
        this.distance = distance;
    }

    public double getFare() {
        return vehicle.calculateFare(distance);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String rideType = sc.next();
            double distance = sc.nextDouble();
            try {
                Vehicle vehicle;
                if (rideType.equalsIgnoreCase("Bike")) {
                    vehicle = new Bike("B101");

                } else if (rideType.equalsIgnoreCase("Auto")) {
                    vehicle = new Auto("A101");

                } else if (rideType.equalsIgnoreCase("Cab")) {
                    vehicle = new Cab("C101");

                } else {
                    throw new InvalidBookingException(
                            "Invalid ride type"
                    );
                }

                Driver driver = new Driver("Driver1");
                Rider rider = new Rider("Rider1");

                Trip trip = new Trip(
                        driver,
                        rider,
                        vehicle,
                        distance
                );

                System.out.println((int) trip.getFare());

            } catch (InvalidBookingException e) {

                System.out.println("Invalid Booking: " + e.getMessage());
            }
        }

        sc.close();
    }
}
##Sample Input
3
Bike 10
Cab 15
Auto 8
##Sample Output
50
180
96
