import java.util.ArrayList;
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> holdSuitcases= new ArrayList<>();
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase s: holdSuitcases) {
            totalWeight += s.totalWeight();
        }
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            holdSuitcases.add(suitcase);
        }
    }
    
    public String toString() {
        return holdSuitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Suitcase s: holdSuitcases) {
            s.printItems();
        }
    }
}
