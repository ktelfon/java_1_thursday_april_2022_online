package student_toomas_park.lesson_9.homework.level_3;

public class LoanSystem2 extends LoanSystem {
    boolean canReceiveLoan(Human human) {
        return human.getName().equals("Mike");
    }
}
