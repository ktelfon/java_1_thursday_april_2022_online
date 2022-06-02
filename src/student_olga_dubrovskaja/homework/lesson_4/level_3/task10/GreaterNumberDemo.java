package student_olga_dubrovskaja.homework.lesson_4.level_3.task10;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class GreaterNumberDemo {
    public static void main(String[] args) {
        GreaterNumber number = new GreaterNumber();
        number.setNumbers();
        number.compareAndPrint();
    }
}
