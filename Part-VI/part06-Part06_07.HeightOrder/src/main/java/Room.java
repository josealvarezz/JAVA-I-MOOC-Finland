import java.util.ArrayList;
public class Room {
    private ArrayList<Person> personsList = new ArrayList<>();
    
    public Room() {
        
    }
    
    public void add(Person person) {
        personsList.add(person);
    }
    
    public boolean isEmpty() {
        if (personsList.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons() {
        return this.personsList;
    }
    
    public Person shortest() {
        Person shortest = new Person("",999);
        if (this.personsList.size() == 0) {
            return null;
        } else {
            for (Person p: personsList) {
                if (p.getHeight() < shortest.getHeight()){
                    shortest = p;
                }
            }
        }
        return shortest;
    }
    
    public Person take() {
        Person tempshortest = this.shortest();
        this.personsList.remove(this.shortest());
        return tempshortest;
    }
}
