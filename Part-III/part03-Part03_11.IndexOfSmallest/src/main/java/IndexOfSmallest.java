
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest = 10000;
        
        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }
            
            list.add(number);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        for (int i = 0; i < list.size(); i++) {
            int compare = list.get(i);
            if (smallest > compare) {
                smallest = compare;
            }
        }
        System.out.println("Smallest number: " + smallest);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
