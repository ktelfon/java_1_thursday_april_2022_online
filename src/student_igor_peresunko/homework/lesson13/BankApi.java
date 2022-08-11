package student_igor_peresunko.homework.lesson13;

import teacher.codereview.CodeReview;

import java.util.Optional;

@CodeReview(approved = true)
public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
