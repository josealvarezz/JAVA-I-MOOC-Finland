
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.rooms > compared.rooms) {
            return true;
        } else if (this.rooms < compared.rooms) {
            return false;
        }

        if (this.squares > compared.squares) {
            return true;
        } else if (this.squares < compared.squares) {
            return false;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int apartmentValue = this.princePerSquare * this.squares;
        int comparedValue = compared.princePerSquare * compared.squares;
        int difference = apartmentValue - comparedValue;
        return Math.abs(difference); //Valor absoluto
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if ((this.squares * this.princePerSquare) > (compared.squares * compared.princePerSquare)) {
            return true;
        } else if ((this.squares * this.princePerSquare) < (compared.squares * compared.princePerSquare)) {
            return false;
        }
        return false;
    }
}
