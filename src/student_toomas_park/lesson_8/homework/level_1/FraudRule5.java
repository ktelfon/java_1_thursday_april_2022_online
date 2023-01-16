package student_toomas_park.lesson_8.homework.level_1;

public class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        if(("Germany").equals(t.getTrader().getCity()) && t.getAmount() > 1000) {
            return true;
        }
        return false;
    }
}
