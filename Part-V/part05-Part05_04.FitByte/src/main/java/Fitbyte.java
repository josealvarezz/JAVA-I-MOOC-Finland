/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Fitbyte {
    private int age;
    private int restingRate;
     
    public Fitbyte(int age, int restingRate) {
        this.age = age;
        this.restingRate = restingRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        double max = 206.3 - (0.711 * age);
        return ((max - restingRate) * percentageOfMaximum + restingRate);
    }   
}
