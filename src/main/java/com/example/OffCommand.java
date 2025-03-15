package com.example;

public class OffCommand extends AbstractLightCommand {
  public OffCommand(Light light) {
    super(light);
  }

  public void execute() {
    geLight().turnOffLight();
  }
}