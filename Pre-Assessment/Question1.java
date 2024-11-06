import java.util.*;

public class Question1{
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        Random random = new Random();

        // Makes array with 10 random numbers
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(100));
        }

        // Reverse the list first array
        List<Integer> reverseArray = new ArrayList<>(array);
        for (int i = 0; i < array.size(); i++) {
            reverseArray.set(i, array.get(array.size() - 1 - i));
        }

        System.out.println("Original Array: " + array);
        System.out.println("Reversed Array: " + reverseArray);
    }
}
