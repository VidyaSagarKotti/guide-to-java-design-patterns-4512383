package com.example;

public class EuroATM extends ATM {

    public EuroATM(ATM nexAtm) {
        super(nexAtm);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if (WithdrawalRequest.Currency.EUR.equals(request.getCurrency())) {
            System.out.println("Dispensing €" + request.getAmount());
        } else if (getNextAtm() != null) {
            getNextAtm().dispense(request);
        }

    }
}
