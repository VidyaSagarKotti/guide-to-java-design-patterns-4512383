package com.example;

public class TrafficMediator {

    private final PedestrianCrossingLight pedestrianCrossingLight;
    private final TrafficLight trafficLight;

    public TrafficMediator(PedestrianCrossingLight pedestrianCrossingLight, 
    TrafficLight trafficLight) {
      this.pedestrianCrossingLight = pedestrianCrossingLight;
      this.trafficLight = trafficLight;
    }

    public void changeToRed() {
      trafficLight.changeToAmber();
      trafficLight.changeToRed();
      pedestrianCrossingLight.changeToGreen();
    }

    public void changeToGreen() {
      trafficLight.changeToAmber();
      pedestrianCrossingLight.changeToRed();
      trafficLight.changeToGreen();
    }

}
