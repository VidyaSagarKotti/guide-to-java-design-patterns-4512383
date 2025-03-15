package com.example;

public class App {

    public static void main(String[] args) {

        var trafficLight = new TrafficLight();
        var pedestrianCrossingLight = new PedestrianCrossingLight();
        var trafficMediator = new TrafficMediator(pedestrianCrossingLight, trafficLight);

        trafficMediator.changeToGreen();
        trafficMediator.changeToRed();

    }

}
