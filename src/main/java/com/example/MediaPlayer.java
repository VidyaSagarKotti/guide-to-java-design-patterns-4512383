package com.example;

public class MediaPlayer {
    private PlayerState playerState;

    public MediaPlayer() {
        playerState = new PlayerPauseState();
    }

    public void pressButton() {
        playerState.pressButton(this);
    }

    public void play() {
        System.out.println("Playing");
        System.out.println("Displaying pause icon");
    }

    public void pause() {
        System.out.println("Paused");
        System.out.println("Displaying play icon");
    }

    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;
    }

}
