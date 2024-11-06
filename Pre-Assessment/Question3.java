import java.util.*;

public class Question3 {
    public static List<Character> commonLetters(String str1, String str2) {
        List<Character> commonLetters = new ArrayList<>();
        
        // Loop through each character in the first string
        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);

            // Check if the character is in the second string and not already added
            if (str2.indexOf(char1) != -1 && !commonLetters.contains(char1)) {
                commonLetters.add(char1);
            }
        }

        return commonLetters;
    }

    public static void main(String[] args) {
        String str1 = "peter";
        String str2 = "parker";
        System.out.println("Common Letters: " + commonLetters(str1, str2));
    }
}