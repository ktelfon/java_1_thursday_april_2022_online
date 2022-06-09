package student_Vladislavs_Solims.homework.lesson_5.level_2;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task11 {

    /*  Напишите программу, в которой:
              - создайте массив целых чисел длиной 3,
              - заполните каждую ячейку массива числом, запрошенным у пользователя,
              - выведите значение каждой ячейки на консоль.
  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }


}
