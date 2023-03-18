/**
 *
 * @author jose
 */
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stringList = new ArrayList<>();
    
    public Stack() {
       
    }
    
    public boolean isEmpty() {
        if (this.stringList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add (String value) {
        this.stringList.add(0, value);
    }
    
    public ArrayList<String> values() {
        return stringList;
    }
    
    public String take() {
        String newString = stringList.get(0);
        stringList.remove(0);
        return newString;
    }
}
