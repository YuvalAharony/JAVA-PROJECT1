package Project2;

public abstract class Residential extends Property{
    int parkingSlot=0;


    //constractor
    public Residential(String adress, double area, double price, int parkingSlot) {
        super(adress, area, price);
        try{
            setParkingSlot(parkingSlot);
        } catch (IllegalArgumentException e) {
            System.out.println("Parking Slot cant be negative");
        }
    }

    //getters and setters

    public int getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(int parkingSlot) {
        if(parkingSlot>=0) {
            this.parkingSlot = parkingSlot;
        }else
            throw new IllegalArgumentException("Parking Slot cant be negative");
    }

    //methods
    @Override
    public String toString() {
        return "Residential{" +
                "parkingSlot=" + parkingSlot +
                '}'+ super.toString();
    }

    public  double taxIt(){
        return this.getPrice()*0.08;
    }
}
