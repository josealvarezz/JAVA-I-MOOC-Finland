
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            } else {
                System.out.println("Duration: ");
                int minutes = Integer.valueOf(scanner.nextLine());
                programs.add(new TelevisionProgram(name, minutes));
            }
        }
        System.out.println("Program's maximum duration?");
        int duration = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram TelevisionProgram : programs) {
            if (TelevisionProgram.getDuration() <= duration) {
                System.out.println(TelevisionProgram);
            }
        }
    }
}
