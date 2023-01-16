package student_toomas_park.lesson_8.homework.level_1;

public class FraudRule4Test {
    public static void main(String[] args) {
        FraudRule4Test fraudRule4Test = new FraudRule4Test();
        fraudRule4Test.testJamaica();
    }

    public void testJamaica() {
        Transaction transaction = new Transaction();
        Trader trader = new Trader();

        trader.setCity("Jamaica");
        transaction.setTrader(trader);
        System.out.println( "If city of trader is " + transaction.getTrader().getCity()
                + " must return false : -> " + isFraud(transaction));

        trader.setCity("Estonia");
        transaction.setTrader(trader);
        System.out.println( "If city of trader is " + transaction.getTrader().getCity()
                + " must return true : -> " + isFraud(transaction));
    }

    private boolean isFraud(Transaction transaction) {
        FraudRule4 fraudRule4 = new FraudRule4("Jamaica");
        return fraudRule4.isFraud(transaction);
    }
}
