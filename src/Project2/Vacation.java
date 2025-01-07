package Project2;

public class Vacation extends Residential{
    private int guests=1;

    //constractor
    public Vacation(String adress, double area, double price, int parkingSlot, int guests) {
        super(adress, area, price, parkingSlot);
        try {
            setGuests(guests);
        } catch (IllegalArgumentException e) {
            System.out.println("guests needs to be at least 1");
        }
    }

    //getters and settrs
    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        if (guests > 0) {
            this.guests = guests;
        }else{
            throw new IllegalArgumentException("guests needs to be at least 1");
        }
    }

    //methods
    @Override
    public String toString() {
        return "Vacation{" +
                "guests=" + guests +
                '}' + super.toString();
    }

    public double taxIt(){
        return this.getPrice()*0.25;
    }

}
