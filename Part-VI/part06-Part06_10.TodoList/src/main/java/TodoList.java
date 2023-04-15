/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list = new ArrayList<>();
    
    public TodoList() {
        
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print() {
        int n = 1;
        for (String s: list) {
            System.out.println(n + ": " + s.toString());
            n++;
        }
    }
    
    public void remove(int number) {
        this.list.remove(list.get(number - 1));
    }
}
