package student_toomas_park.lesson_7.homework.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.testDeposit();
        test.testWithdrawCredit();
        test.withdrawFromBalanceAndCredit();
        test.depositToBalanceAndCredit();
        test.testWrongPin();
    }

    public void testDeposit() {
        CreditCardTest test = new CreditCardTest();
        CreditCard card = new CreditCard("1111 1111 1111 1111", 1111);
        float expectedResult = 1000;
        checkResult(expectedResult == card.getBalance(), "deposit");
    }

    public void testWithdrawCredit() {
        CreditCard card = new CreditCard("1111 1111 1111 1111", 1111);
        card.setCreditLimit(1000);
        card.withdraw(1111, 100);
        float expectedResult = -100;
        checkResult(expectedResult == card.getDebt(), "withdraw");
    }

    public void withdrawFromBalanceAndCredit() {
        CreditCard card = new CreditCard("1111 1111 1111 1111", 1111);
        card.setCreditLimit(1000);
        card.deposit(1111, 50);
        card.withdraw(1111, 100);
        float expectedResult = -50;
        checkResult(expectedResult == card.getDebt(), "withdraw balance and credit");
    }

    public void depositToBalanceAndCredit() {
        CreditCard card = new CreditCard("1111 1111 1111 1111", 1111);
        card.setCreditLimit(1000);
        card.withdraw(1111, 50);
        card.deposit(1111, 100);
        float expectedResult = 50;
        checkResult(expectedResult == card.getBalance(), "deposit to balance and credit");
    }


    public void testWrongPin() {
        CreditCard card = new CreditCard("1111 1111 1111 1111", 1111);
        card.deposit(2222, 1000);
        float expectedResult = 0;
        checkResult(expectedResult == card.getBalance(), "wrong pin");
    }


    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " Working ");
        } else {
            System.out.println(testName + " Fail ");
        }
    }

}