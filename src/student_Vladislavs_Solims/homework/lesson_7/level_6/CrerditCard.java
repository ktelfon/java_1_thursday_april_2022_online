package student_Vladislavs_Solims.homework.lesson_7.level_6;

public class CrerditCard {

    private String number;
    private int pin;
    private double balance = 0;
    private double limit;
    private double creditLimit;
    private double credit = 0;

    public CrerditCard(String number, int pin) {
        this.number = number;
        this.pin = pin;
    }


    public void withdraw(int pin , double amountOfMoneyToWithdraw){
if(isPinIncorrect(pin)){
    System.out.println("Wrong pin !");
    return;
}
double tmpMoney = balance - amountOfMoneyToWithdraw;
if(tmpMoney >= 0){
    System.out.println("Withdrawn : " + amountOfMoneyToWithdraw);
    balance -= amountOfMoneyToWithdraw;
}else{

    if(Math.abs(credit +tmpMoney)>creditLimit){
        System.out.println("Can withdraw that amount.");
    }else{
        balance = 0;
        credit += tmpMoney;
    }
}
    }

    public void deposit(int pin , double amountOfMoneyToDeposit){
if(isPinIncorrect(pin)){
    System.out.println("Wrong PIN !");
    return;
}
if (credit== 0){
    balance += amountOfMoneyToDeposit;
    return;
}
if(credit < 0){
double moneyAfterCreditPayout = credit + amountOfMoneyToDeposit;
if(moneyAfterCreditPayout>=0){
    balance += moneyAfterCreditPayout;
    credit = 0;
}else{
    credit = moneyAfterCreditPayout;
}
}
    }

    private boolean isPinIncorrect(int pin) {
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
