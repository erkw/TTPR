import java.util.*;

public class Question7 {
    public static int minimum(int... numbers) {
        // Makes min to the largest int
        int min = Integer.MAX_VALUE;
        for (int a : numbers) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minimum(1, 2, 3));
        System.out.println(minimum(3, 2, 1));
    }
}