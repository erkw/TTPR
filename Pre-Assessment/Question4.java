import java.util.*;

public class Question4 {
    //Takes numbers to see if value will be between lower and upper
    public static boolean between(int value, int lower, int upper) {
        return value > lower && value < upper;
    }

    public static void main(String[] args) {
        //Prints out the results of the between method
        System.out.println(between(3, 0, 7));  // true
        System.out.println(between(3, 7, 9));  // false
    }
}