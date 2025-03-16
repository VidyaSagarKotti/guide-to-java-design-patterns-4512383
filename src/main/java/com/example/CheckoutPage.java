package com.example;

public class CheckoutPage {

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay();
    }

}
