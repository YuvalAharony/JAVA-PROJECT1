package Project2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.exit;

public class main {

    private static RealEstateMnager manager = new RealEstateMnager("yuval");
    private static ArrayList<Property> properties = DataManager.start();


    public static void main(String[] args) throws PriceExeption {
        Scanner scanner = new Scanner(System.in);
        manager.setProperties(properties);
        int index = -2;
        while (index != -1) {
            System.out.println("press 1 to search properties");
            System.out.println("press 2 to watch financial report");
            System.out.println("press 3 to watch Commercial real estate returns");
            System.out.println("press 4 to watch properties per city");
            System.out.println("press 5 to watch number of cities");
            System.out.println("press -1 to exit");
            index = scanner.nextInt();
            scanner.nextLine();
            ;
            switch (index) {
                case (1):
                    System.out.println("please enter price");
                    int price = index = scanner.nextInt();
                    if (price < 0) {
                        throw new PriceExeption("price cant be negative");
                    }
                    ex1(price);
                    break;
                case 2:
                    ex2(manager.getProperties());
                    break;
                case 3:
                    ex3(manager.getProperties());
                    break;
                case 4:
                    System.out.println("please enter city");
                    String city = scanner.nextLine();
                    ex4(manager.getProperties(),city);
                    break;
                case 5:

                    ex5(manager.getProperties());
                    break;
                case -1:
                    exit(0);
            }
        }
    }

    //1 pressed
    public static void ex1(int price) {

        for (Property property : properties) {
            if (property.getPrice() < price) {
                System.out.println(property);
            }
        }

    }

    //2 pressed
    public static void ex2(ArrayList<Property> pr) {
        for (Property property : pr) {

            System.out.println(property.taxIt());

        }


    }


    //3 pressed
    public static double ex3(ArrayList<Property> pr) {
        double sum = 0;
        for (Property property : pr) {
            if (property instanceof Commercial) {
                sum += ((Commercial) property).getYield();
            }
        }
        System.out.println(sum);
        return sum;

    }

    //4 pressed
    public static void ex4(ArrayList<Property> pr, String city) {
        String name=city.toLowerCase();
        name=name.replace("-"," ");
        String splits[]=name.split(" ");
        for(int i=0;i< splits.length;i++){
            splits[i]=((char)(splits[i].charAt(0)-32))+splits[i].substring(1);
        }
        name=String.join(" ",splits);
        boolean found = false;
        for (Property property : pr) {
            city = property.getAdress();
            if (city.contains(name)) {
                System.out.println(property);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No properties found for the city: " + name + ".");
        }
    }

    public static void ex5(ArrayList<Property> pr){

            HashMap<String,Integer> map=new HashMap<>();
            for (Property property : pr) {
                String city=property.getAdress();
                String result = city.substring(0,city.indexOf(','));
                System.out.println(result);
                if(map.containsKey(result)){
                    map.replace(result,map.get(result)+1);
                }else{
                    map.put(result,1);
                }
            }
            int count=0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                count++;
                System.out.println("City: " + entry.getKey());
            }
            System.out.println("number of cities= "+count);

        }
    }


