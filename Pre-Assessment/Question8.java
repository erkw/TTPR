import java.util.*;

public class Question8 {
    public static int maximum(int... numbers){
        int max = Integer.MIN_VALUE;
        for (int a : numbers) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maximum(1,2,3));
        System.out.println(maximum(3,2,1));
    }
}

