package student_toomas_park.lesson_8.homework.level_1;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }
    public String getRuleName() {
        return ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}