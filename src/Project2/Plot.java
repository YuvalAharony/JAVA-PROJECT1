package Project2;

public class Plot extends Property{
    private TYPE type;

    //constractor
    public Plot(String adress, double area, double price, TYPE type) {
        super(adress, area, price);
        this.type = type;
    }

    //getters and setters
    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    //methods
    @Override
    public String toString() {
        return "Plot{" +
                "type=" + type +
                '}'+ super.toString();
    }

    public double taxIt(){
        if(this.type.equals("URBAN")){
            return this.getPrice()*0.1;
        }
        if(this.type.equals("AGRICULTURAL")){
            return this.getPrice()*0.02;
        }
        return this.getPrice()*0.05;


    }
}
