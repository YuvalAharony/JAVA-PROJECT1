package Project2;

public class Commercial extends Property{
    private boolean storeroom=false;
    private double yield =0;

    //consractors
    public Commercial(String adress, double area, double price, boolean storeroom, double yield) {
        super(adress, area, price);
        this.storeroom = storeroom;
        try {
            setYield(yield);
        }catch (IllegalArgumentException e) {
            System.out.println("yield can't be negative");
        }
    }

    public Commercial(String adress, double area, double price, double yield) {
        super(adress, area, price);
        try {
            setYield(yield);
        }catch (IllegalArgumentException e) {
            System.out.println("yield can't be negative");
        }
    }

    //getters and setters
    public boolean isStoreroom() {
        return storeroom;
    }

    public void setStoreroom(boolean storeroom) {
        this.storeroom = storeroom;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        if (yield > 0) {
            this.yield = yield;
        }else{
            throw new IllegalArgumentException("yield can't be negative");
        }
    }

    //methods
    @Override
    public String toString() {
        return "Commercial{" +
                "storeroom=" + storeroom +
                ", yield=" + yield +
                '}'+super.toString();
    }

    public void tsua(){
        System.out.println(this.getPrice() *(this.yield/100)/12);
    }

    public double taxIt(){
        return this.getPrice()*0.05;
    }
}
