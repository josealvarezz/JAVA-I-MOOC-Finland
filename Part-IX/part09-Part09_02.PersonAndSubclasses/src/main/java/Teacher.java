/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Teacher extends Person {
    private int salary;
    
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return this.getName() + "\n  " + this.getAddress() + "\n  salary " + this.salary + " euro/month"; 
    }
    
    public int getSalary() {
        return this.salary;
    }
}
