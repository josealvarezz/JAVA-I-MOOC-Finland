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
import java.util.Random;
public class JokeManager {
    private ArrayList<String> jokeList = new ArrayList<>();
    
    public JokeManager() {
        
    }
    
    public void addJoke(String joke) {
        jokeList.add(joke);
    }
    
    public String drawJoke() {
        String joke = "";
        if (jokeList.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random rand = new Random();
            int index = rand.nextInt(jokeList.size());
            joke = jokeList.get(index);
        }
        return joke;
    }
    
    public void printJokes() {
        for (String s: jokeList) {
            System.out.println(s);
        }
    }
}
