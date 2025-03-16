package com.example;

public interface PaymentStrategy {

  void pay();

  PaymentStrategy payWithCard = () -> {
    System.out.println("Payment made with card");
  };

  PaymentStrategy payByBankTransfer = () -> {
    System.out.println("Payment made by bank transfer");
  };

}