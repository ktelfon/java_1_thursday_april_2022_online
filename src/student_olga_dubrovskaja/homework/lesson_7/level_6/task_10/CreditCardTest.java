package student_olga_dubrovskaja.homework.lesson_7.level_6.task_10;

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
        CreditCard card = new CreditCard("1111 1111 1111 1111", 1111);
        card.deposit(1111, 1000);
        float expectedResult = 1000;
        checkResult(expectedResult == card.getBalance(), "test simple deposit");
    }

    public void testWithdrawCredit() {
        CreditCard card = new CreditCard("1111 1111 1111 1111", 1111);
        card.setCreditLimit(1000);
        card.withdraw(1111, 100);
        float expectedResult = -100;
        checkResult(expectedResult == card.getDebt(), "test withdraw from credit");
    }

    public void withdrawFromBalanceAndCredit() {
        CreditCard card = new CreditCard("1111 1111 1111 1111", 1111);
        card.setCreditLimit(1000);
        card.deposit(1111, 50);
        card.withdraw(1111, 100);
        float expectedResult = -50;
        checkResult(expectedResult == card.getDebt(), "test withdraw from balance and credit");
    }

    public void depositToBalanceAndCredit() {
        CreditCard card = new CreditCard("1111 1111 1111 1111", 1111);
        card.setCreditLimit(1000);
        card.withdraw(1111, 50);
        card.deposit(1111, 100);
        float expectedResult = 50;
        checkResult(expectedResult == card.getBalance(), "test deposit to balance and credit");
    }


    public void testWrongPin() {
        CreditCard card = new CreditCard("1111 1111 1111 1111", 1111);
        card.deposit(2222, 1000);
        float expectedResult = 0;
        checkResult(expectedResult == card.getBalance(), "test wrong pin");
    }


    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }

}
