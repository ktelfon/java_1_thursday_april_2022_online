package student_Vladislavs_Solims.homework.lesson_5.level_2;

import java.util.Random;

public class Task12 {

  /*  Напишите программу, в которой:
            - создайте массив целых чисел длиной 3,
            - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль.
*/

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        numbers[0] = random.nextInt(0 ,100);
        numbers[1] = random.nextInt(100 , 200);
        numbers[2] = random.nextInt(300 , 340);
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);


        }
    }
}


