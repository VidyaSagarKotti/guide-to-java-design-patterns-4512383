package com.example;

public class UsDollarATM extends ATM {

    public UsDollarATM(ATM nexAtm) {
        super(nexAtm);
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if (WithdrawalRequest.Currency.USD.equals(request.getCurrency())) {
            System.out.println("Dispensing $" + request.getAmount());
        } else if (getNextAtm() != null) {
            getNextAtm().dispense(request);
        }
    }

}
