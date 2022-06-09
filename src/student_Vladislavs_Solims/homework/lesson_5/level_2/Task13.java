package student_Vladislavs_Solims.homework.lesson_5.level_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task13 {

  /*  Написашите программу, в которой:
            - создайте массив целых чисел длиной 3,
            - заполните каждую ячейку массива случайным числом,
 - посчитайте сумму всех ячеек и распечатайте ее на консоль.
*/

    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
            System.out.println("Summ of all numbers = " + sum);

        }
    }
}



