/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
import java.util.Scanner;

public class UserInterface {

    private JokeManager jm;
    private Scanner sc;

    public UserInterface(JokeManager jm, Scanner sc) {
        this.jm = jm;
        this.sc = sc;
    }

    public void start() {
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - Stop");

            String opcion = sc.nextLine().toLowerCase();

            switch (opcion) {
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = sc.nextLine();
                    jm.addJoke(joke);
                    continue;
                    
                case "2":
                    System.out.println(jm.drawJoke());
                    continue;
                    
                case "3":
                    jm.printJokes();
                    continue;
                    
                case "x":
                    break;
            }
            break;
        }
    }
}
