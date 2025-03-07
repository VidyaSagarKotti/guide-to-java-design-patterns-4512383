package com.example;

public class RedUserInterfaceFactory implements UserInterfaceFactory {
  @Override
  public Button getButton() {
    return new RedButton();
  }

  @Override
  public ScrollBar getScrollBar() {
    return new RedScrollBar();
  }
}