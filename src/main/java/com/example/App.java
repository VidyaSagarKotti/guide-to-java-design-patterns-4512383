package com.example;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        var india = new Country("India");
        var poland = new Country("Poland");
        var nigeria = new Country("Nigeria");
        var canada = new Country("Canada");
        var argentina = new Country("Argentina");

        var world = new World(india, poland, nigeria, canada, argentina);
        Iterator<Country> countryIterator = world.iterator();
        // for (Country country : world) {
        //     System.out.println(country.getName());
        // }
        while (countryIterator.hasNext()) {
            System.out.println(countryIterator.next().getName());
        }

    }

}
