package student_toomas_park.lesson_7.homework.level_6;


import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class CreditCard {

    private final String cardNumber;
    private final int pin;
    private float balance;
    private float creditLimit;
    private float debt;

    public CreditCard(String cardNumber, int pin) {
        this.pin = pin;
        this.cardNumber = cardNumber;
        this.balance = 0f;
        this.debt = 0f;
    }

    public void deposit() {
        if (checkPin(getPinFromUser())) {
            float amountToDeposit = getMoneyAmountFromUser("deposit");
            if (checkCreditDeposit()) {
                payDebt(amountToDeposit);
            } else {
                addToBalance(amountToDeposit);
            }
        } else {
            operationDeclined("wrong pin");
        }
    }

    public void deposit(int pin, float amount) {
        if (checkPin(pin)) {
            if (checkCreditDeposit()) {
                payDebt(amount);
            } else {
                addToBalance(amount);
            }
        } else {
            operationDeclined("wrong pin");
        }
    }

    public void withdraw() {
        if (checkPin(getPinFromUser())) {
            float amountToWithdraw = getMoneyAmountFromUser("withdraw");
            if (checkBalanceWithdraw(amountToWithdraw)) {
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

    public void withdraw(int pin, float amount) {
        if (checkPin(pin)) {
            if (checkBalanceWithdraw(amount)) {
                getMoneyFromBalance(amount);
            } else if (checkCreditWithdraw(amount)) {
                getMoneyFromCredit(amount);
            } else {
                operationDeclined("Not enough money");
            }
        } else {
            operationDeclined("wrong pin");
        }
    }

    private int getPinFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pin:");
        return scanner.nextInt();
    }
    public float getBalance() {
        return balance;
    }

    public float getDebt() {return debt;}
    private boolean checkPin(int userPin) {
        return this.pin == userPin;
    }

    private void operationDeclined(String reason) {
        System.out.println("Operation declined: " + reason);
    }

    private boolean checkBalanceWithdraw(float amountFromUser) {
        return amountFromUser <= this.balance;
    }

    private boolean checkCreditWithdraw(float amount) {
        return this.creditLimit - this.debt <= (this.balance - amount);
    }

    private void getMoneyFromBalance(float amount) {
        this.balance = this.balance - amount;
    }

    private void getMoneyFromCredit(float amount) {
        this.debt = (amount - this.balance) * -1;
        this.balance = 0;
    }

    private boolean checkCreditDeposit() {
        return this.debt < 0;
    }

    private void payDebt(float amount) {
        if (this.debt + amount <= 0) {
            this.debt = this.debt + amount;
        } else {
            this.balance += this.debt + amount;
            this.debt = 0;
        }
    }

    private void addToBalance(float amount) {
        this.balance += amount;
    }

    private float getMoneyAmountFromUser(String operationName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to " + operationName);
        if (scanner.hasNextFloat()) {
            float moneyAmount = scanner.nextFloat();
            if (moneyAmount > 0) {return moneyAmount;}
            else {operationDeclined("Invalid amount");return 0;}
        } else { operationDeclined("Invalid amount");}
        return 0;
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit * -1;
    }

    public void printCreditCardInfo() {
        System.out.println("Credit card nr: " + this.cardNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("Credit debt: " + debt);
        System.out.println("Credit limit: " + creditLimit);
    }
}
