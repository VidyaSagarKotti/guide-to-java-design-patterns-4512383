package com.example;

public abstract class ATM {

    private final ATM nextAtm;

    public ATM(ATM nexAtm) {
        this.nextAtm = nexAtm;
    }

    public abstract void dispense(WithdrawalRequest request);

    public ATM getNextAtm() {
        return nextAtm;
    }

}
