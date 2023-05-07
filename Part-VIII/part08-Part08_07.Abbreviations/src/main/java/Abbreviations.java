import java.util.HashMap;

public class Abbreviations {
    
    private HashMap<String, String> map = new HashMap<>();
    
    public Abbreviations() {
        
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.map.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return this.map.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        return this.map.get(abbreviation);
    }
}
