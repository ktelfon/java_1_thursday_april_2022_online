package student_toomas_park.lesson_8.homework.level_1;


public class FraudRule1Test {
    public static void main(String[] args) {
        FraudRule1Test fraudRule1Test = new FraudRule1Test();
        fraudRule1Test.testPokemon();
    }
    void testPokemon() {
        Trader trader = new Trader();
        Transaction transaction = new Transaction();

        trader.setFullName("Pokemon");
        transaction.setTrader(trader);
        System.out.println( "If Trader name in transaction is " + transaction.getTrader().getFullName()
                + " must return false : -> " + isFraud(transaction));

        trader.setFullName("NotPokemon");
        transaction.setTrader(trader);
        System.out.println( "If Trader name in transaction is " + transaction.getTrader().getFullName()
                + " must return true : -> " + isFraud(transaction));
    }

    private boolean isFraud(Transaction transaction) {
        return false;
    }
}
