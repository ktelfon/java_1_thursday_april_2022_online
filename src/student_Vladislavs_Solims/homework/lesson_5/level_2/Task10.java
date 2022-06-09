package student_Vladislavs_Solims.homework.lesson_5.level_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task10 {
  /*  Напишите программу, в которой:
            - создайте массив целых чисел длиной 3,
            - заполните каждую ячейку массива любым целым числом,
            - выведите значение каждой ячейки на консоль.
*/

    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }

}
