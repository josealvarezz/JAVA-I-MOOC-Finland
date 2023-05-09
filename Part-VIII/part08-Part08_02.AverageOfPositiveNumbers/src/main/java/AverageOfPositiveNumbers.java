
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        float average = 0;
        int counter = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                if (sum == 0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    average = (sum / counter);
                    System.out.println(average);
                }
                break;
            } else {
                if (number > 0) {
                    sum += number;
                    counter++;
                }
            }
        }
    }
}
