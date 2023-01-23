
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longest = "";
        int sum = 0;
        int  count = 0;
        float average;
        
        while (true) {
            String data = scanner.nextLine();
            if (data.equals("")) {
                break;
            } else {
                String[] pieces = data.split(",");
                if (longest.length() < pieces[0].length()) {
                    longest = pieces[0];
                }
                
                sum += Integer.valueOf(pieces[1]);
                count += 1;
            }
        }
        
        average = (float) ((1.0 * sum) / count);
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + average);
    }
}
