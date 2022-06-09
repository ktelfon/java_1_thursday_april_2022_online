package student_olga_dubrovskaja.homework.lesson_6.level_4.task_18_to_task_21;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        TwoDimensionalArray demo = new TwoDimensionalArray();
        demo.fillWithRandomNumbers();
        demo.printToConsole();
        System.out.println(" SUM: " + demo.calculateSum());
    }
}
