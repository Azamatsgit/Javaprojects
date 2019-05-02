package ArrayList;

import java.util.ArrayList;

public class longName {
    public static void main(String[] args) {
        ArrayList<String> cities= new ArrayList<>();
        cities.add("Chicago");
        cities.add("New York");
        cities.add("Los Angels");
        cities.add("Tampa");
        cities.add("Miami");
        cities.add("Toronto");
        cities.add("Detroit");
        cities.add("Orlando");
        cities.add("San Francisco");
        cities.add("San Diego");

        int countOfCities=cities.size();
        System.out.println(countOfCities);

        for (String city :cities){
            System.out.print(city+"  = ");

        }
        System.out.println();

        for (int i=0; i<cities.size(); i++){
            System.out.print(cities.get(i)+" | ");
        }
        System.out.println();

        ArrayList<String> longNames= new ArrayList<>();
        System.out.println(longNames.size());
        System.out.println(longNames.isEmpty());

        for (String city: cities){
            if (city.length()>6){
                longNames.add(city);
            }
        }
        System.out.println(longNames);
        longNames.clear();
        System.out.println(longNames.isEmpty());

        for (int x=0; x<cities.size(); x++){
            String city=cities.get(x);
            if (city.length() > 6){
                longNames.add(cities.get(x));

            }
        }
        System.out.println("Cities count >6" + longNames.size());
        System.out.println(longNames.toString());


    }
}













