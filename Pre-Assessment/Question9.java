import java.util.*;
import java.io.*;

public class Question9 {
    public static void main(String[] args) {
        File scores = new File("D:\\TTP Residency\\TTPR\\Pre-Assessment\\scores.txt");
        try {
            Scanner input = new Scanner(scores);

            int sum = 0;
            int count = 0;

            while (input.hasNextInt()) {
            sum += input.nextInt();
            count++;

            }

            System.out.println("The average is: " + sum / count);
            
            input.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
