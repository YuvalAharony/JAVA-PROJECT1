package Project2;

public class Apartment extends Residential {
    private int rooms = 1;

    //constractor
    public Apartment(String adress, double area, double price, int parkingSlot, int rooms) {
        super(adress, area, price, parkingSlot);
        try {
            setRooms(rooms);
        } catch (IllegalArgumentException e) {
            System.out.println("Rooms needs to be more then 1");
        }
    }

    //getters and setters
    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if (rooms > 1) {
            this.rooms = rooms;
        }else{
            throw new IllegalArgumentException("Rooms needs to be more then 1");
        }
    }

    //methods
    @Override
    public String toString() {
        return "Apartment{" +
                "rooms=" + rooms +
                '}'+super.toString();
    }


}
