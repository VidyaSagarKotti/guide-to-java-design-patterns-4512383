package com.example;

public class App {

    public static void main(String[] args) {

        var location1 = new Location();
        var location2 = new Location();
        var weatherUpdates = new WeatherUpdates();
        var weatherUpdates2 = new WeatherUpdates2();
        location1.addPropertyChangeListener(weatherUpdates);
        location1.addPropertyChangeListener(weatherUpdates2);
        location2.addPropertyChangeListener(weatherUpdates);

        location1.setWeatherEvent("Risk of flooding");
        location2.setWeatherEvent("Risk of drought");

        weatherUpdates.printUpdates();
        weatherUpdates2.printUpdates();
    }

}
