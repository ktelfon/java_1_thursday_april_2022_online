package student_toomas_park.lesson_8.homework.level_1;

public class FraudRule3 extends FraudRule {
    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return ("Sidney").equals(t.getTrader().getCity());
    }
}
