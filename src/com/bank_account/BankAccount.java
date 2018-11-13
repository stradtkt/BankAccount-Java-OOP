package com.bank_account;

import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private double checkingBal;
    private double savingsBal;
    private static int numAccounts;
    private static double totalAmountInBank;

    public BankAccount() {
        generateRandomAccountNumber();
    }


    // private method to generate account number
    private String generateRandomAccountNumber() {
        String numbers = "0123456789";
        String newAccountNumber = "";
        Random random = new Random();
        for(int i = 0; i < 5; i++) {
            int num = numbers.charAt(random.nextInt(10));
            newAccountNumber += num;
        }
        accountNumber = newAccountNumber;
        return newAccountNumber;
    }


    // Getters

    public String getAccountNumber() {
        return accountNumber;
    }
    public double getCheckingBal() {
        return this.checkingBal;
    }
    public double getSavingsBal() {
        return this.savingsBal;
    }

    // Setters


}
