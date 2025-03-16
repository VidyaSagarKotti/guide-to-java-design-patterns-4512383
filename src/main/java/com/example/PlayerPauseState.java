package com.example;

public class PlayerPauseState implements PlayerState{

  public void pressButton(MediaPlayer mediaPlayer) {
    mediaPlayer.play();
    mediaPlayer.setPlayerState(new PlayerPlayState());
  }

}