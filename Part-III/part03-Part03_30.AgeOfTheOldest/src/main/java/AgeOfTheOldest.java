
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                String[] pieces = input.split(",");
                int number = Integer.valueOf(pieces[1]);
                if (oldest < number) {
                    oldest = number;
                }
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
