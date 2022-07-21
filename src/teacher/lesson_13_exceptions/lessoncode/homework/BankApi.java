package teacher.lesson_13_exceptions.lessoncode.homework;

import java.util.Optional;

public interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
