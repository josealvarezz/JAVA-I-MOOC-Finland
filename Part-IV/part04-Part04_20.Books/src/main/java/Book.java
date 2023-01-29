/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Book {
    private String name;
    private int pages; 
    private int year;
    
    public Book (String inputname, int inputpages, int inputyear) {
        this.name = inputname;
        this.pages = inputpages;
        this.year = inputyear;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.year;
    }
}
