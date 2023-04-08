import java.util.Scanner;
public class TextUI {
    private Scanner sc;
    private SimpleDictionary SD;
    
    public TextUI(Scanner scanner, SimpleDictionary SD) {
        this.sc = scanner;
        this.SD = SD;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = sc.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")){
                System.out.print("Word:");
                String word = sc.nextLine();
                System.out.print("Translation:");
                String translation = sc.nextLine();
                SD.add(word, translation);
            } else if (command.equals("search")) {
                System.out.print("To be translated:");
                String word = sc.nextLine();
                if (SD.translate(word) == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                System.out.println("Translation: " + SD.translate(word));
                }
            } else {
                System.out.println("Command not found");
            }
        }
    }
}
