package student_olga_dubrovskaja.homework.lesson_7.level_7.task_15_to_task_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UserEntityTest {
    public static void main(String[] args) {
        UserEntityTest test = new UserEntityTest();
        test.testUniquePersonalNumber();
        test.testDeleteUser();

    }

    public void testUniquePersonalNumber() {
        UserEntityRepository repository = new UserEntityRepository();
        repository.createUser("Cat", "Catkin", 123);
        boolean expectedResult = false;
        System.out.println(repository.getUserByName("Cat").getId());
        checkResult(repository.createUser("Ishtar", "Ishtarkin", 123) == expectedResult, "Unique personal nr test:");
    }

    public void testDeleteUser() {
        UserEntityRepository repository = new UserEntityRepository();
        repository.createUser("Cat", "Catkin", 123);
        System.out.println(repository.getUserByName("Cat").getId());

    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }

}
