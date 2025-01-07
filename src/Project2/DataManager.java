package Project2;


import java.util.ArrayList;

public class DataManager {
    public static  ArrayList<Property> start() {
    ArrayList<Property> properties=new ArrayList<>();
        properties.add(new Plot("Tel Aviv, Rothschild 10", 500, 2000000, TYPE.INDUSTRIAL));
        properties.add(new Plot("Haifa, Carmel 15", 700, 1500000, TYPE.INDUSTRIAL));


        properties.add(new Apartment("Ramat Gan, Bialik 20", 100, 1200000, 2, 6));
        properties.add(new Apartment("Jerusalem, Jabotinsky 5", 80, 1000000, 3, 7));


        properties.add(new Villa(   "Herzliya, HaSharon 8", 300, 5000000, 5, 5));
        properties.add(new Villa("Eilat, Shaked 3", 400, 4000000, 3, 4));


        properties.add(new Vacation("Tiberias, Kinneret 1", 60, 800000, 3, 10));
        properties.add(new Vacation("Netanya, Hayarkon 12", 90, 1000000, 3, 4));


        properties.add(new Commercial("Ashdod, Industrial Zone 10", 1000, 7000000, true, 15));
        properties.add(new Commercial("Beer Sheva, Negev Mall 5", 1200, 8000000, false, 20));


        properties.add(new Office("Tel Aviv, Azrieli 20", 150, 3000000));
        properties.add(new Office("Haifa, Matam 7", 180, 2500000));
        return properties;
    }

}
