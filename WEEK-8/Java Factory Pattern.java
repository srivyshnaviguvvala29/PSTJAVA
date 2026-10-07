import java.util.*;

interface Food {
    String getType();
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class Pizza implements Food {

    public String getType() {
        return "Someone ordered Fast Food!";
    }
}

class FoodFactory {

    public Food getFood(String order) {

        if (order.equals("cake")) {
            return new Cake();
        } 
        else if (order.equals("pizza")) {
            return new Pizza();
        }

        return null;
    }
}
Sample Input 1

cake
Sample Output 1

The factory returned class Cake
Someone ordered a Dessert!
