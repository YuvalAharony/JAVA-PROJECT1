package Project2;

import java.util.ArrayList;

public class RealEstateMnager {
    private String name;
    private ArrayList<Property> properties;

    //constractor
    public RealEstateMnager(String name) {
        this.name = name;
    }

    //getters and seters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    //methods
    public void addProperty(Property p){
        this.properties.add(p);
    }

    public ArrayList<Property> cheaperThanPrice(int price){
        ArrayList<Property> pr=new ArrayList<>();
        for(Property property:this.properties){
            if(property.getPrice()<price){
                pr.add(property);
            }
        }
        return pr;
    }

    public double sum(){
        double sum=0;
        for(Property property:this.properties){
            sum+=property.getPrice();
        }
        return sum;
    }



}
