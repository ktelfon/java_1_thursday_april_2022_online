package student_Vladislavs_Solims.homework.lesson_13;

import teacher.codereview.CodeReview;

import java.util.Optional;

@CodeReview(approved = true)
public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;






}
