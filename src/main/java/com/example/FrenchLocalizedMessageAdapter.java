package com.example;

public class FrenchLocalizedMessageAdapter implements LocalizedMessage {
  private final FrenchLocalizedMessage frenchLocalizedMessage = new FrenchLocalizedMessage();

  @Override
  public void sayHello() {
    frenchLocalizedMessage.sayBonjour();
  }
}