package teacher.lesson_7_encapsulation.lessoncode.homework;

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

    public void withdraw(int pin, double amountOfMoneyToWithdraw) {
        if (isPinInCorrect(pin)) {
            System.out.println("Wrong pin!");
            return;
        }
        double tmpMoney = balance - amountOfMoneyToWithdraw;
        if (tmpMoney >= 0) {
            System.out.println(" Withdrawn: " + amountOfMoneyToWithdraw);
            balance -= amountOfMoneyToWithdraw;
        } else {
            if (Math.abs(credit + tmpMoney) > creditLimit) {
                System.out.println(" Can withdraw that amount.");
            } else {
                balance = 0;
                credit += tmpMoney;
                System.out.println(" Withdrawn: " + amountOfMoneyToWithdraw);
            }
        }
    }

    public void deposit(int pin, double amountOfMoneyToDeposit) {
        if (isPinInCorrect(pin)) {
            System.out.println("Wrong pin!");
            return;
        }
        if (credit == 0) {
            balance += amountOfMoneyToDeposit;
            return;
        }
        if (credit < 0) {
            double moneyAfterCreditPayout = credit + amountOfMoneyToDeposit;
            if (moneyAfterCreditPayout >= 0) {
                balance += moneyAfterCreditPayout;
                credit = 0;
            } else {
                credit = moneyAfterCreditPayout;
            }
        }

    }

    private boolean isPinInCorrect(int pin) {
        return pin != this.pin;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getBalance() {
        return balance + credit;
    }
}
