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


    public void setCheckingBal(double checkingBal) {
        this.checkingBal = checkingBal;
    }

    public void setSavingsBal(double savingsBal) {
        this.savingsBal = savingsBal;
    }

    // Methods

    public void depositChecking(double checkingBal) {
        this.setCheckingBal(checkingBal);
        totalAmountInBank += checkingBal;
    }

    public void depositSavings(double savingsBal) {
        this.setSavingsBal(savingsBal);
        totalAmountInBank += savingsBal;
    }

    public void withdrawCheckings(int amount) {
        if(Double.valueOf(amount) > getCheckingBal()) {
            System.out.println("You need more money in your account to pull out that much!");
        } else {
            setCheckingBal(getCheckingBal() - Double.valueOf(amount));
        }
    }

    public void withdrawSavings(int amount, double savingsBal) {
        if(Double.valueOf(amount) > getSavingsBal()) {
            System.out.println("You need more money in your account to pull out that much!");
        } else {
            setSavingsBal(getSavingsBal() - Double.valueOf(amount));
        }
    }

    public void transferIntoCheckings(int amount) {
        if(Double.valueOf(amount) > getSavingsBal()) {
            System.out.println("I am sorry you do not have enough to transfer that much");
        } else {
            setSavingsBal(getSavingsBal() - Double.valueOf(amount));
            setCheckingBal(getCheckingBal() + Double.valueOf(amount));
        }
    }

    public void transferIntoSavings(int amount) {
        if(Double.valueOf(amount) > getCheckingBal()) {
            System.out.println("I am sorry you do not have enough to transfer that much");
        } else {
            setCheckingBal(getCheckingBal() - Double.valueOf(amount));
            setSavingsBal(getSavingsBal() + Double.valueOf(amount));
        }
    }

    public double total() {
        totalAmountInBank = savingsBal + checkingBal;
        return totalAmountInBank;
    }
}
