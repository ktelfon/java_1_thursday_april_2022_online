package student_olga_dubrovskaja.homework.lesson_4.level_3.task8;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ThreeEqualNumbersDemo {
    public static void main(String[] args) {
        ThreeEqualNumbers numbers = new ThreeEqualNumbers();
        numbers.setNumbers();
        numbers.compareAndPrint();
    }
}
