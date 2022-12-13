
import java.util.ArrayList;

public class Statistics {

    private int sum;
    private ArrayList<Integer> numbers = new ArrayList<Integer>();

    public Statistics() {
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.numbers.add(number);
        this.sum += number;
    }

    public int getCount() {
        return this.numbers.size();
    }

    public int sum() {
        //for (int i = 0; i < numbers.size(); i++) {
        //    this.sum = this.sum + numbers.get(i);
        //}
        return this.sum;
    }

    public double average() {
        if (this.numbers.isEmpty()) {
            return 0;
        }
        return (1.0 * sum) / this.numbers.size();
    }

}
