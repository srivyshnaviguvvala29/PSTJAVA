import java.io.*;
import java.util.*;

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // Adder inherits add() from Arithmetic
}

public class Solution {

    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());

        System.out.println(adder.add(42, 13));
        System.out.println(adder.add(10, 20));
        System.out.println(adder.add(5, 7));
    }
}
