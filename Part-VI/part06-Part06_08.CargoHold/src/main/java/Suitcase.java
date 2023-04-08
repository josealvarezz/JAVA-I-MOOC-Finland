import java.util.ArrayList;
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> itemsList = new ArrayList<>();
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        int weightSum = 0;
        
        for (Item i: itemsList) {
            weightSum += i.getWeight();
        }
        
        if (weightSum + item.getWeight() <= this.maxWeight) {
            itemsList.add(item);
        }
    }
    
    public String toString() {
        int weightSum = 0;
        for (Item i: itemsList) {
            weightSum += i.getWeight();
        }
        
        if (itemsList.size() == 0) {
            return "no items (0 kg)";
        } else if (itemsList.size() == 1) {
            return "1 item" + " (" + itemsList.get(0).getWeight() + " kg)";
        }
        return String.valueOf(itemsList.size()) + " items" + " (" + weightSum + " kg)";
    }
    
    public void printItems() {
        for (Item i: itemsList) {
            System.out.println(i.toString());
        }
    }
    
    public int totalWeight() {
        int weightSum = 0;
        for (Item i: itemsList) {
            weightSum += i.getWeight();
        }
        return weightSum;
    }
    
    public Item heaviestItem() {
        Item heaviest = new Item("example", 0);
        if (itemsList.size() == 0) {
            return null;
        } else {
            for (Item i: itemsList) {
                if (i.getWeight() > heaviest.getWeight()) {
                    heaviest = i;
                }
            }
        }
        return heaviest;
    }
}
