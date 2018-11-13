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
        System.out.println("Account number = " + accountNumber);
        return accountNumber;
    }
    public double getCheckingBal() {
        return checkingBal;
    }
    public double getSavingsBal() {
        return savingsBal;
    }

    // Setters


    public void setCheckingBal(double checkingBal) {
        this.checkingBal = checkingBal;
    }

    public void setSavingsBal(double savingsBal) {
        this.savingsBal = savingsBal;
    }

    // Methods

    public void depositChecking(double amount) {
       checkingBal += Double.valueOf(amount);
        System.out.println("You have deposited " + amount + " in your checking account");
    }

    public void depositSavings(double amount) {
        savingsBal += Double.valueOf(amount);
        System.out.println("You have deposited " + amount + " in your savings account");
    }

    public void withdrawCheckings(double amount) {
        if(Double.valueOf(amount) > getCheckingBal()) {
            System.out.println("You need more money in your account to pull out that much!");
        } else {
            checkingBal -= Double.valueOf(amount);
            System.out.println("You have withdrew " + amount + " from your checkings.");
        }
    }

    public void withdrawSavings(double amount) {
        if(Double.valueOf(amount) > getSavingsBal()) {
            System.out.println("You need more money in your account to pull out that much!");
        } else {
            savingsBal -= Double.valueOf(amount);
            System.out.println("You have withdrew " + amount + " from your savings.");
        }
    }

    public void transferIntoCheckings(double amount) {
        if(Double.valueOf(amount) > getSavingsBal()) {
            System.out.println("I am sorry you do not have enough to transfer that much");
        } else {
            savingsBal -= amount;
            checkingBal += amount;
        }
    }

    public void transferIntoSavings(double amount) {
        if(Double.valueOf(amount) > getCheckingBal()) {
            System.out.println("I am sorry you do not have enough to transfer that much");
        } else {
            checkingBal -= amount;
            savingsBal += amount;
        }
    }

    public double total() {
        totalAmountInBank = savingsBal + checkingBal;
        System.out.println("Savings account = " + String.format("%.2f", savingsBal) + "\nChecking account = " + String.format("%.2f", checkingBal) + "\nTotal = " + String.format("%.2f", totalAmountInBank));
        return totalAmountInBank;
    }
}
