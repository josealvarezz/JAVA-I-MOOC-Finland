
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name?");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Item item = new Item(identifier, name);

            boolean exists = false;
            for (Item i : items) {
                if (item.equals(i)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                items.add(item);
            }
        }

        System.out.println("==Items==");
        for (Item i : items) {
            System.out.println(i.toString());
        }
    }
}
