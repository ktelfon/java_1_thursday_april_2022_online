package student_igor_peresunko.homework.lesson_7.CreditCard;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CreditCard {

    private String number;
    private int pin;
    private double balance = 0;
    private double creditLimit;
    private double credit = 0;

    public CreditCard(String number, int pin) {
        this.number = number;
        this.pin = pin;
    }

    

    public void withdraw(int pin, double amountOfMoneyWithdraw){
        if (isPinCorrect(pin)){
            System.out.println("Wrong pin!");
            return;
        }
        double tmpMoney = balance - amountOfMoneyWithdraw;
        if(tmpMoney >= 0){
            System.out.println("Withdrawn: " + amountOfMoneyWithdraw);
            balance -= tmpMoney;
        }else{

            if (Math.abs(credit + tmpMoney) > creditLimit){
                System.out.println("Can withdrawn that amount.");
            }else{
                balance = 0;
                credit += tmpMoney;
            }
        }

        
    }
    
    public void deposit(int pin, double amountOfMoneyDeposit){
        if (isPinCorrect(pin)){
            System.out.println("Wrong pin!");
            return;
        }
        if (credit == 0){
            balance += amountOfMoneyDeposit;
            return;
        }
        if (credit < 0){
            double moneyAfterCreditPayout = credit + amountOfMoneyDeposit;
            if (moneyAfterCreditPayout >= 0){
                balance += moneyAfterCreditPayout;
                credit = 0;
            }else{
                credit = moneyAfterCreditPayout;
            }
        }
    }

    private boolean isPinCorrect(int pin) {
        return pin != this.pin;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getBalance() {
        return balance;
    }
}
