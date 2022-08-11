package student_Vladislavs_Solims.homework.lesson_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BankClient {

    private String uid;
    private String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}
