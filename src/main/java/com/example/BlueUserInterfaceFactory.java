package com.example;

public class BlueUserInterfaceFactory implements UserInterfaceFactory {
  @Override
  public Button getButton() {
    return new BlueButton();
  }

  @Override
  public ScrollBar getScrollBar() {
    return new BlueScrollBar();
  }
}