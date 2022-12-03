
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String text = scan.nextLine();
        System.out.println("Give an integer:");
        int numInt = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double numDoub = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean trueFalse = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + numInt);
        System.out.println("You gave the double " + numDoub);
        System.out.println("You gave the boolean " + trueFalse);
    }
}
