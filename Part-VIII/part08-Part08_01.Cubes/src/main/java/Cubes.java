
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String option = scanner.nextLine();
            
            if (option.equals("end")) {
                break;
            } else {
                int number = Integer.valueOf(option);
                int cube = (number * number * number);
                System.out.println(cube);
            }
        }
    }
}
