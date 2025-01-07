package Project2;

public class Office extends Property {

    //constractor
    public Office(String adress, double area, double price) {
        super(adress, area, price);
    }

    //methods
    @Override
    public String toString() {
        return "Office{}"+super.toString();
    }

    public double taxIt(){
        return this.getPrice()*0.05;
    }
}
