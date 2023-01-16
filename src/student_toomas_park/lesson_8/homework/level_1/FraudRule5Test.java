package student_toomas_park.lesson_8.homework.level_1;

public class FraudRule5Test {
    public static void main(String[] args) {
        FraudRule5Test fraudRule5Test = new FraudRule5Test();
        fraudRule5Test.testGermanyAmount();
    }

    public void testGermanyAmount () {
        Transaction transaction = new Transaction();
        Trader trader = new Trader();

        trader.setCity("Germany");
        transaction.setTrader(trader);
        transaction.setAmount(1001);

        System.out.println("If city is " + transaction.getTrader().getCity()
                + " and transaction amount is " + transaction.getAmount()
                + " must return true : -> " + isFraud(transaction));

        trader.setCity("Estonia");
        transaction.setTrader(trader);
        transaction.setAmount(1001);

        System.out.println("If city is " + transaction.getTrader().getCity()
                + " and transaction amount is " + transaction.getAmount()
                + " must return false : -> " + isFraud(transaction));

        trader.setCity("Germany");
        transaction.setTrader(trader);
        transaction.setAmount(1000);

        System.out.println("If city is " + transaction.getTrader().getCity()
                + " and transaction amount is " + transaction.getAmount()
                + " must return false : -> " + isFraud(transaction));
    }

    private boolean isFraud(Transaction transaction) {
        FraudRule5 fraudRule5 = new FraudRule5("GermanuAmount");
        return fraudRule5.isFraud(transaction);
    }
}
