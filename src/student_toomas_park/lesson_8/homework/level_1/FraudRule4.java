package student_toomas_park.lesson_8.homework.level_1;

public class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return ("Jamaica").equals(t.getTrader().getCity());
    }
}