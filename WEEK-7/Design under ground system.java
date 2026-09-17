import java.util.*;

class UndergroundSystem {

    // Stores passenger ID -> check-in station and time
    private Map<Integer, CheckIn> checkIns;

    // Stores route -> total travel time and number of trips
    private Map<String, RouteData> routes;

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        routes = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {

        // Get check-in information
        CheckIn checkIn = checkIns.get(id);

        String route = checkIn.station + "->" + stationName;

        int travelTime = t - checkIn.time;

        // If route doesn't exist, create it
        if (!routes.containsKey(route)) {
            routes.put(route, new RouteData());
        }

        RouteData data = routes.get(route);

        data.totalTime += travelTime;
        data.count++;

        // Passenger is no longer checked in
        checkIns.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {

        String route = startStation + "->" + endStation;

        RouteData data = routes.get(route);

        return (double) data.totalTime / data.count;
    }
}

// Stores passenger's check-in information
class CheckIn {
    String station;
    int time;

    CheckIn(String station, int time) {
        this.station = station;
        this.time = time;
    }
}

// Stores route statistics
class RouteData {
    int totalTime;
    int count;
}
Input
["UndergroundSystem","checkIn","checkIn","checkIn","checkOut","checkOut","checkOut","getAverageTime","getAverageTime","checkIn","getAverageTime","checkOut","getAverageTime"]
[[],[45,"Leyton",3],[32,"Paradise",8],[27,"Leyton",10],[45,"Waterloo",15],[27,"Waterloo",20],[32,"Cambridge",22],["Paradise","Cambridge"],["Leyton","Waterloo"],[10,"Leyton",24],["Leyton","Waterloo"],[10,"Waterloo",38],["Leyton","Waterloo"]]

Output
[null,null,null,null,null,null,null,14.00000,11.00000,null,11.00000,null,12.00000]
