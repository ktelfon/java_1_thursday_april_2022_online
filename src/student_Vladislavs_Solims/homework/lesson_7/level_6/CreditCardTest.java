package student_Vladislavs_Solims.homework.lesson_7.level_6;

import java.sql.SQLOutput;

public class CreditCardTest {
    public static void main(String[] args) {
    CreditCardTest creditCardTest = new CreditCardTest();
addPositivenumberOfMoneyTocard();
withdrawPositivenumberOfMoneyTocard();
withdrawCreditPositivenumberOfMoneyTocard();
    }
private static  void addPositivenumberOfMoneyTocard(){
        CrerditCard crerditCard = new CrerditCard("1234-5678-1234-5678" , 1234);
        crerditCard.deposit(1234 , 10);
        double expectedResult = 10;
        double result = crerditCard.getBalance();
        if(expectedResult == result){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
            System.out.println("Expected was - " + expectedResult + " actual " + result);
        }

    }

    private static  void withdrawPositivenumberOfMoneyTocard() {
        CrerditCard crerditCard = new CrerditCard("1234-5678-1234-5678", 1234);
        crerditCard.deposit(1234, 10);
        crerditCard.withdraw(1234, 10);

        double expectedResult = 0;
        double result = crerditCard.getBalance();
        if (expectedResult == result) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("Expected was - " + expectedResult + " actual " + result);
        }

    }

    private static  void withdrawCreditPositivenumberOfMoneyTocard() {
        CrerditCard crerditCard = new CrerditCard("1234-5678-1234-5678", 1234);

        crerditCard.setCreditLimit(100);

        crerditCard.deposit(1234, 10);
        crerditCard.withdraw(1234, 10);
        crerditCard.withdraw(1234, 10);

        double expectedResult = -10;
        double result = crerditCard.getBalance();
        if (expectedResult == result) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("Expected was - " + expectedResult + " actual " + result);
        }

    }
}
