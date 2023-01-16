package student_toomas_park.lesson_8.homework.level_1;


class FraudDetectionResult {
    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult() {
    }

    public FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public boolean getFraud() {
        return fraud;
    }

    public String getRuleName() {
        return ruleName;
    }
}
