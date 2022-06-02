package student_olga_dubrovskaja.homework.lesson_4.level_4.task11_task15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CalculatorDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        Calculator calc = new Calculator();
        System.out.println(a + " + " + b + " = " + calc.sum(a,b));
        System.out.println(a + " - " + b +" = " + calc.subtraction(a,b));
        System.out.println(a + " * " + b + " = " + calc.multiplication(a,b));
        System.out.println(a + " / " + b + " = " + calc.division(a,b));
    }

}
