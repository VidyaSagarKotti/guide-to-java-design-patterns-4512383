package com.example;

import java.util.Map;
import java.util.HashMap;
import java.util.function.Supplier;
import java.lang.IllegalArgumentException;

public class UserInterfaceFactoryMaker {
  private static Map<String, Supplier<UserInterfaceFactory>> factoryMap = new HashMap<>();

  static {
    factoryMap.put("RED", RedUserInterfaceFactory::new);
    factoryMap.put("BLUE", BlueUserInterfaceFactory::new);
  }

  public static UserInterfaceFactory getUserInterfaceFactory(String color) {
    if (factoryMap.get(color) != null) {
      return factoryMap.get(color).get();
    } else {
      throw new IllegalArgumentException("Color not supported");
    }
  }

}