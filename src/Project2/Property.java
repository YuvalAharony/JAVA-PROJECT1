package Project2;

public abstract class Property {
    private String adress = "Na,na";
    private double area = 0;
    private double price = 0;

    //constractor
    public Property(String adress, double area, double price) {
        try {
            setAdress(adress);
        }catch (IllegalArgumentException e) {
            System.out.println("Address must not be null, empty, and must contain at least two words.");
        }
        try {
            setArea(area);
        }catch (IllegalArgumentException e) {
            System.out.println("Area can't be negative");
        }
        try {
            setPrice(price);
        }catch (IllegalArgumentException e) {
            System.out.println("Price can't be negative");
        }

    }

    //Getters and Setters
    public void setAdress(String adress) {
        if(adress!=null&&adress.split(",").length >= 2&&!this.adress.equals("")) {
            this.adress = adress;
        }else{
            throw new IllegalArgumentException("Address must not be null, empty, and must contain at least two words.");
        }
    }

    public void setArea(double area) {
        if (area > 0) {
            this.area = area;
        }else{
            throw new IllegalArgumentException("Area can't be negative");
        }
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }else{
            throw new IllegalArgumentException("Price can't be negative");
        }
    }

    public String getAdress() {
        return adress;
    }

    public double getArea() {
        return area;
    }

    public double getPrice() {
        return price;
    }

    //Methods
    @Override
    public String toString() {
        return "{" +
                "adress='" + adress + '\'' +
                ", area=" + area +
                ", price=" + price
                ;
    }

    public abstract double taxIt();

}
