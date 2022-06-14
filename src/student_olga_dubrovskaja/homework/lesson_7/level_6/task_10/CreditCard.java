package student_olga_dubrovskaja.homework.lesson_7.level_6.task_10;

import java.util.Scanner;

class CreditCard {
    private String cardNumber;
    private int pin;
    private float balance;
    private float creditLimit;
    private float debt;

    public CreditCard(String cardNumber, int pin){
        this.pin = pin;
        this.cardNumber = cardNumber;
        this.balance = 0f;
        this.debt = 0f;
    }

    public void deposit(){
        if(checkPin(getPinFromUser())){
            float amountToDeposit = getMoneyAmountFromUser("deposit");
            if(checkCreditDeposit()){
                payDebt(amountToDeposit);
            } else {
                addToBalance(amountToDeposit);
            }
        } else {
            operationDeclined("wrong pin");
        }
    }

    public void withdraw(){
        if(checkPin(getPinFromUser())){
            float amountToWithdraw = getMoneyAmountFromUser("withdraw");
            if (checkBalanceWithdraw(amountToWithdraw)){
                getMoneyFromBalance(amountToWithdraw);
            } else if (checkCreditWithdraw(amountToWithdraw)) {
                getMoneyFromCredit(amountToWithdraw);
            } else {
                operationDeclined("Not enough money");
            }
        } else {
            operationDeclined("wrong pin");
        }
    }
    private int getPinFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pin:");
        return scanner.nextInt();
    }

    private boolean checkPin(int userPin){
        return this.pin == userPin;
    }

    private void operationDeclined(String reason){
        System.out.println("Operation declined: " + reason);
    }

    private boolean checkBalanceWithdraw(float amountFromUser){
        return amountFromUser <= this.balance;
    }

    private boolean checkCreditWithdraw(float amount){
        return this.creditLimit - this.debt <= (this.balance - amount) ;
    }

    private void getMoneyFromBalance(float amount){
        this.balance = this.balance - amount;
    }

    private void getMoneyFromCredit(float amount){
            this.debt = (amount - this.balance) * -1;
            this.balance = 0;
    }

    private boolean checkCreditDeposit(){
        return this.debt < 0;
    }

    private void payDebt(float amount){
        if (this.debt + amount <= 0) {
            this.debt = this.debt + amount;
        } else {
            this.balance += this.debt + amount;
            this.debt = 0;
        }
    }
    private void addToBalance(float amount){
        this.balance += amount;
    }
    private float getMoneyAmountFromUser(String operationName){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to " + operationName);
        return scanner.nextFloat();
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit * -1;
    }

    public void printCreditCardInfo(){
        System.out.println("Credit card nr: " + this.cardNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("Credit debt: " + debt);
        System.out.println("Credit limit: " + creditLimit);
    }
}
