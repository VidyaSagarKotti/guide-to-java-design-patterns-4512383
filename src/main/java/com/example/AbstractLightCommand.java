package com.example;

public abstract class AbstractLightCommand implements LightCommand {
  private final Light light;

  public AbstractLightCommand(Light light) {
    this.light = light;
  }

  public Light geLight() {
    return light;
  }
}