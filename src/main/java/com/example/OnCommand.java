package com.example;

public class OnCommand extends AbstractLightCommand {
  public OnCommand(Light light) {
    super(light);
  }

  public void execute() {
    geLight().turnOnLight();
  }
}