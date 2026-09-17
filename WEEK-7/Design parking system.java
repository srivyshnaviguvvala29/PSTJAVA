class ParkingSystem {
      int big;
      int medium;
      int small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    public boolean addCar(int carType) {
        if(carType == 1){
            if(big > 0){
                big--;
                return true;
            }
        }
        if(carType == 2){
            if(medium > 0){
                medium--;
                return true;
            }
        }
        if(carType == 3){
            if(small > 0){
                small--;
                return true;
            }
        }
        return false;
    }
}
Input
["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
[[1, 1, 0], [1], [2], [3], [1]]
Output
[null, true, true, false, false]
