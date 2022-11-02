import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner file = new Scanner("Book1.csv");
        //initialize sum, min and max numbers
        int sum = 0;
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;

        //a for loop to find the sum, largest, and smallest numbers. the average is found by dividing the sum by the
        //number of numbers (10)
        for (int i = 0; i < 10; i++){
            int newInt = file.nextInt();
            sum += newInt;
            if (newInt > large) {
                large = newInt;
            } else if (newInt < small) {
                small = newInt;
            }
        }
        int average = sum / 10;

        //writing the file
        File stats = new File("src/Chapter5HW/stats.txt");
        try {
            FileWriter newStats = new FileWriter(stats);
            newStats.write("The sum of the numbers is: " + sum + "\n" +
                    "The lowest number is: " + small + "\n" +
                    "The highest number is : " + large + "\n" +
                    "The average of the numbers is : " + average);
            newStats.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
