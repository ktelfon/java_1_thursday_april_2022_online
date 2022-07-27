package student_igor_peresunko.homework.lesson13;

import java.util.Optional;

public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
