package student_toomas_park.lesson_8.homework.level_1;


import java.sql.Array;
import java.util.ArrayList;

public class FraudDetector {
    ArrayList<FraudRule> ruleList = new ArrayList<>();
    FraudDetectionResult fraudDetectionResult = new FraudDetectionResult();

    public FraudDetector() {
        ruleList.add(new FraudRule1("Pokemon"));
        ruleList.add(new FraudRule2("Amount"));
        ruleList.add(new FraudRule3("Sidney"));
        ruleList.add(new FraudRule4("Jamaica"));
        ruleList.add(new FraudRule5("GermanyAmount"));

    }

    public FraudDetectionResult isFraud(Transaction t) {
        for(int i = 0; ruleList.size() > i; i++) {
            FraudRule fraudRule = ruleList.get(i);
            if (fraudRule.isFraud(t)) {
                fraudDetectionResult.setRuleName(fraudRule.getRuleName());
                fraudDetectionResult.setFraud(true);
                System.out.println(t.toString());
                return fraudDetectionResult;
            }
        }
        fraudDetectionResult.setFraud(false);
        return fraudDetectionResult;
    }

}
