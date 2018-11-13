package com.bank_account;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.getAccountNumber();
        bankAccount.setCheckingBal(1565.25);
        bankAccount.setSavingsBal(12098.43);
        bankAccount.total();

        bankAccount.depositChecking(55.00);
        bankAccount.depositSavings(150.45);
        bankAccount.getCheckingBal();
        bankAccount.getSavingsBal();

        bankAccount.withdrawCheckings(1000.25);
        bankAccount.withdrawSavings(2000.25);
        bankAccount.getCheckingBal();
        bankAccount.getSavingsBal();
        bankAccount.total();

        bankAccount.transferIntoCheckings(1000.50);
        bankAccount.total();
    }
}
