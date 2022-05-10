package student_artemijs_talamajevs.homework.lesson_2_variables.homework.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CorrectDataTypes {
    //Исправьте ошибки компиляции в данной программе.
    //
    //public class CorrectDataTypes {
    //
    //	public static void main(String[] args) {
    //
    //		int numberOne = 10;
    //		double numberTwo = 20.0;
    //
    //		System.out.println("Number 1 = " + numberOne);
    //		System.out.println("Number 2 = " + numberTwo);
    //
    //		float sum = numberOne + numberTwo;
    //
    //		System.out.println("Sum = " + sum);
    //	}
    //
    //}
    //
    //Цель этого задания: обратить ваше внимание на то,
    //что в языке программирования Java тип результата
    //арифметической операции является
    //типом самого широкого аргумента. Тоесть если:
    //    int a = 1;
    //    long b = 2L;
    //    long result = a + b;
    //
    //то типом результата операции сложения (a + b) будет тип long,
    //так как тип long являтся более широким типом данных чем int.
    //Широкий - в том смысле, что в переменной этого типа данных
    //можно представить значения из большего диапазона.
    //Диапазон типа данных long больше чем диапазон типа int.

    public static void main(String[] args) {
        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        double sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);

    }
}
