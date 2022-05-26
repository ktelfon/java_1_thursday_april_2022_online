package student_olga_dubrovskaja.homework.lesson_4.level_3.task9;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class NumbersOrderDemo {
    public static void main(String[] args) {
        NumbersOrder numbers = new NumbersOrder();
        numbers.setNumbers();
        numbers.compareAndPrint();
    }
}
