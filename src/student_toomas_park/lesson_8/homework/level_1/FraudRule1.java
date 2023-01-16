package student_toomas_park.lesson_8.homework.level_1;

class FraudRule1 extends FraudRule {
    public FraudRule1(String ruleName) {
        super(ruleName);
    }
    public boolean isFraud(Transaction t) {
        return ("Pokemon").equals(t.getTrader().getFullName());
    }
}
