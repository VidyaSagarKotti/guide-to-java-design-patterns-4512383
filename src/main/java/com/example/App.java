package com.example;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.EUR);
        var atm = getChain();
        atm.dispense(request);
    }

    private static ATM getChain() {
        var euAtm = new EuroATM(null);
        var atm = new UsDollarATM(euAtm);
        return atm;
    }

}
