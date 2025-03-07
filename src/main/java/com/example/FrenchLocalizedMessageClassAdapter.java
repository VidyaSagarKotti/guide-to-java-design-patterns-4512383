package com.example;

public class FrenchLocalizedMessageClassAdapter extends FrenchLocalizedMessage
    implements LocalizedMessage {

  @Override
  public void sayHello() {
    sayBonjour();
  }

  public void sayBonjour() {
    System.out.println("French Hello");
  }

}
