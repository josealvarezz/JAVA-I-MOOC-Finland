
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        if (number < 0) {
            int absolute = number * -1;
            System.out.println("The absolute number is " + absolute);
        } else {
            System.out.println(number);
        }
    }
}
