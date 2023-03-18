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

public class MessagingService {
    private ArrayList<Message> messageList = new ArrayList<>();
    
    public MessagingService() {
        
    }
    
    public void add (Message message) {
        boolean isShorter;
        if (message.getContent().length() <= 280) {
            isShorter = true;
        } else {
            isShorter = false;
        }
        
        if (isShorter) {
            messageList.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.messageList;
    }

}