
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 2.50;
        if (payment >= price) {
            double change = payment - price;
            this.money += price;
            this.affordableMeals += 1;
            return change;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        double price = 2.50;
        if (card.balance() >= price) {
            card.takeMoney(price);
            this.affordableMeals += 1;
            return true;
        } else {
            return false;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 4.30;
        if (payment >= price) {
            double change = payment - price;
            this.money += price;
            this.heartyMeals += 1;
            return change;
        } else {
            return payment;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        double price = 4.30;
        if (card.balance() >= price) {
            card.takeMoney(price);
            this.heartyMeals += 1;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
