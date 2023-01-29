import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> List = new ArrayList();
        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            } else {
                System.out.println("Pages: ");
                int pages = Integer.valueOf(scanner.nextLine());
                System.out.println("Publication year: ");
                int year = Integer.valueOf(scanner.nextLine());
                
                List.add(new Book(title, pages, year));
            }
        }
        System.out.println("What information will be printed? ");
        String info = scanner.nextLine().toLowerCase();
        if (info.equals("everything")) {
            for (Book Book : List) {
                System.out.println(Book.toString());;
            }
        } else if (info.equals("name")) {
            for (Book Book : List) {
                System.out.println(Book.getName());
            }
        }
    }
}
