package student_toomas_park.lesson_8.homework.level_1;

class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.testPokemon();
        fraudDetectorTest.testAmount();
        fraudDetectorTest.testCity();
        fraudDetectorTest.testGermanyAmount();
    }

    public void testPokemon() {
        Trader trader = new Trader();
        Transaction transaction = new Transaction();

        trader.setFullName("Pokemon");
        transaction.setTrader(trader);
        System.out.println( "If Trader name in transaction is " + transaction.getTrader().getFullName()
                + " must return true : -> " + isFraud(transaction));

        trader.setFullName("NotPokemon");
        transaction.setTrader(trader);
        System.out.println( "If Trader name in transaction is " + transaction.getTrader().getFullName()
                + " must return false : -> " + isFraud(transaction));
    }

    public void testAmount() {
        Transaction transaction = new Transaction();
        Trader trader = new Trader();
        transaction.setTrader(trader);

        transaction.setAmount(1000001);
        System.out.println( "If amount in transaction is " + transaction.getAmount()
                + " must return true : -> " + isFraud(transaction));

        transaction.setAmount(1000000);
        System.out.println( "If amount in transaction is " + transaction.getAmount()
                + " must return false : -> " + isFraud(transaction));
    }

    public void testCity() {
        Transaction transaction = new Transaction();
        Trader trader = new Trader();

        trader.setCity("Sidney");
        transaction.setTrader(trader);
        System.out.println( "If city of trader is " + transaction.getTrader().getCity()
                + " must return true : -> " + isFraud(transaction));

        trader.setCity("Jamaica");
        transaction.setTrader(trader);
        System.out.println( "If city of trader is " + transaction.getTrader().getCity()
                + " must return true : -> " + isFraud(transaction));

        trader.setCity("Estonia");
        transaction.setTrader(trader);
        System.out.println( "If city of trader is " + transaction.getTrader().getCity()
                + " must return false : -> " + isFraud(transaction));
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

        trader.setCity("Germany");
        transaction.setTrader(trader);
        transaction.setAmount(1000);

        System.out.println("If city is " + transaction.getTrader().getCity()
                + " and transaction amount is " + transaction.getAmount()
                + " must return false : -> " + isFraud(transaction));
    }

    private boolean isFraud(Transaction transaction) {
    FraudDetector fraudDetector = new FraudDetector();
    FraudDetectionResult fraudDetectionResult =  fraudDetector.isFraud(transaction);
    System.out.println(fraudDetectionResult.getRuleName());
    return fraudDetectionResult.getFraud();
    }
}
