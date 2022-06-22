package student_igor_peresunko.homework.lesson_7.CreditCard;

import teacher.lesson_7_encapsulation.lessoncode.homework.CreditCard;

public class CreditCardTest {

    public static void main(String[] args) {
        addPositiveNumberOfMoneyToCard();
        withdrawPositiveNumberOfMoneyToCard();
        withdrawCreditPositiveNumberOfMoneyToCard();
    }

    private static void addPositiveNumberOfMoneyToCard() {
        CreditCard creditCard = new CreditCard("1234-5678-1234-3456", 1234);
        creditCard.deposit(1234, 10);
        double expected = 10;
        double result = creditCard.getBalance();
        if (expected == result) {
            System.out.println("addPositiveNumberOfMoneyToCard PASSED");
        } else {
            System.out.println("addPositiveNumberOfMoneyToCard FAILED");
            System.out.println("Expected: " + expected + " Actual: " + result);
        }
    }

    private static void withdrawPositiveNumberOfMoneyToCard() {
        CreditCard creditCard = new CreditCard("1234-5678-1234-3456", 1234);

        creditCard.deposit(1234, 10);
        creditCard.withdraw(1234, 10);

        double expected = 0;
        double result = creditCard.getBalance();
        if (expected == result) {
            System.out.println("withdrawPositiveNumberOfMoneyToCard PASSED");
        } else {
            System.out.println("withdrawPositiveNumberOfMoneyToCard FAILED");
            System.out.println("Expected: " + expected + " Actual: " + result);
        }
    }

    private static void withdrawCreditPositiveNumberOfMoneyToCard() {
        CreditCard creditCard = new CreditCard("1234-5678-1234-3456", 1234);

        creditCard.setCreditLimit(100);

        creditCard.deposit(1234, 10);
        creditCard.withdraw(1234, 10);
        creditCard.withdraw(1234, 10);

        double expected = -10;
        double result = creditCard.getBalance();
        if (expected == result) {
            System.out.println("withdrawCreditPositiveNumberOfMoneyToCard PASSED");
        } else {
            System.out.println("withdrawCreditPositiveNumberOfMoneyToCard FAILED");
            System.out.println("Expected: " + expected + " Actual: " + result);
        }
    }


}
