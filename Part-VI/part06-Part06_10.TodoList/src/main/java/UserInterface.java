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
    private TodoList list;
    private Scanner sc;
    
    public UserInterface(TodoList list, Scanner sc) {
        this.list = list;
        this.sc = sc;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = sc.nextLine();
            
            switch(command) {
                case "add":
                    System.out.println("To add: ");
                    String toAdd = sc.nextLine();
                    list.add(toAdd);
                    continue;
                    
                case "list":
                    list.print();
                    continue;
                    
                case "remove":
                    System.out.println("Which one is removed? ");
                    int index = Integer.valueOf(sc.nextLine());
                    list.remove(index);
                    continue;
                    
                case "stop":
                    break;
            }
            break;
        }
    }
}
