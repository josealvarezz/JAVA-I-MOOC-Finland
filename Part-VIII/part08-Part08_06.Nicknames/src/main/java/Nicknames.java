
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> list = new HashMap<>();
        
        list.put("matthew", "matt");
        list.put("michael", "mix");
        list.put("arthur", "artie");
        
        System.out.println(list.get("matthew"));
    }

}
