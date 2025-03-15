package com.example;

public class StatusCommand extends AbstractLightCommand {
  public StatusCommand(Light light) {
    super(light);
  }

  public void execute() {
    geLight().isOn();
  }
}