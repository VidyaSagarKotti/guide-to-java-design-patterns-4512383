package com.example;

public class App {

    public static void main(String[] args) {

        var checkoutPage = new CheckoutPage();

        checkoutPage.pay(PaymentStrategy.payWithCard);
        checkoutPage.pay(PaymentStrategy.payByBankTransfer);

    }

}
