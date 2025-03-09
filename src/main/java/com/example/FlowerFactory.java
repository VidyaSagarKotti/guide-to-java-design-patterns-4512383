package com.example;

import java.util.Map;
import java.util.HashMap;

public class FlowerFactory {
  
  private static Map<String, Flower> flowerMap = new HashMap<>();

  public static Flower getFlower(String name){
    return flowerMap.computeIfAbsent(name, Flower::new);
  }

}