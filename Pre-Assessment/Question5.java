import java.util.*;

public class Question5 {
    //Takes numbers to and adds the values up
    public static int sum(int... numbers) {
        int num = 0;
        for (int a : numbers) {
            num += a;
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(4, 5, 6));
    }
}