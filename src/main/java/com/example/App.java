package com.example;

public class App {

    public static void main(String[] args) {
        var light = new Light();
        var executor = new CommandExecutor();
        executor.enqueueCommand(new StatusCommand(light));
        executor.enqueueCommand(new OnCommand(light));
        executor.enqueueCommand(new StatusCommand(light));
        executor.enqueueCommand(new OffCommand(light));
        executor.enqueueCommand(new StatusCommand(light));

        executor.execute();
    }

}
