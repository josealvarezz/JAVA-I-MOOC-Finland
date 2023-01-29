
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("end")) {
                break;
            } else {
                int number = Integer.valueOf(input);
                int cube = number * number * number;
                System.out.println(cube);
            }
        }
    }
}
