
public class HealthStation {
    private int weighings;
    
    public HealthStation() {
    weighings = 0;
}
    
    public int weigh(Person person) {
        int weight = person.getWeight();
        weighings++;
        return weight;
    }

    public void feed(Person person) {
        int newWeight = person.getWeight() + 1;
        person.setWeight(newWeight);
    }
    
    public int weighings() {
        return this.weighings;
    }
}
