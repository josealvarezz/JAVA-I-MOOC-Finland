
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        Scanner sc = new Scanner(System.in);
        TodoList list = new TodoList();
        UserInterface ui = new UserInterface(list, sc);

        ui.start();
    }
}
