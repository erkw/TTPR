import java.util.*;

public class Question6 {
    // Returns the average of the three numbers
    public static int average(int... numbers) {
        int num = 0;
        for (int a : numbers) {
            num += a;
        }
        return num / numbers.length;
    }

    public static void main(String[] args) {
        System.out.println(average(1, 2, 3));
        System.out.println(average(4, 5, 6));
    }
}