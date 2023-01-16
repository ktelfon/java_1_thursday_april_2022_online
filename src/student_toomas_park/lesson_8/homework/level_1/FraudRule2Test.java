package student_toomas_park.lesson_8.homework.level_1;

public class FraudRule2Test {
    public static void main(String[] args) {
        FraudRule2Test fraudRule2Test = new FraudRule2Test();
        fraudRule2Test.testAmount();
    }
    public void testAmount() {
        Transaction transaction = new Transaction();
        Trader trader = new Trader();
        transaction.setTrader(trader);

        transaction.setAmount(1000001);
        System.out.println( "If amount in transaction is " + transaction.getAmount()
                + " must return false : -> " + isFraud(transaction));

        transaction.setAmount(1000000);
        System.out.println( "If amount in transaction is " + transaction.getAmount()
                + " must return true : -> " + isFraud(transaction));
    }

    private boolean isFraud(Transaction transaction) {
        FraudRule2 fraudRule2 = new FraudRule2("Amount");
        return fraudRule2.isFraud(transaction);
    }
}
