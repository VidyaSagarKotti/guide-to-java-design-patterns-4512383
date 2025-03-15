package com.example;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {
  private List<LightCommand> lightCommands = new ArrayList<>();

  public void enqueueCommand(LightCommand command) {
    lightCommands.add(command);
  }
  
  public void execute() {
    lightCommands.forEach(command -> command.execute());
  }
}