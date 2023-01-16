package student_toomas_park.lesson_8.homework.level_1;

public class FraudRule3Test {
    public static void main(String[] args) {
        FraudRule3Test fraudRule3Test = new FraudRule3Test();
        fraudRule3Test.testSidney();
    }

    public void testSidney() {
        Transaction transaction = new Transaction();
        Trader trader = new Trader();

        trader.setCity("Sidney");
        transaction.setTrader(trader);
        System.out.println( "If city of trader is " + transaction.getTrader().getCity()
                + " must return false : -> " + isFraud(transaction));

        trader.setCity("Estonia");
        transaction.setTrader(trader);
        System.out.println( "If city of trader is " + transaction.getTrader().getCity()
                + " must return true : -> " + isFraud(transaction));
    }

    private boolean isFraud(Transaction transaction) {
        FraudRule3 fraudRule3 = new FraudRule3("Sidney");
        return fraudRule3.isFraud(transaction);
    }

}
