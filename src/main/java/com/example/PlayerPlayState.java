package com.example;

public class PlayerPlayState implements PlayerState{

  public void pressButton(MediaPlayer mediaPlayer){
    mediaPlayer.pause();
    mediaPlayer.setPlayerState(new PlayerPauseState());
  }

}