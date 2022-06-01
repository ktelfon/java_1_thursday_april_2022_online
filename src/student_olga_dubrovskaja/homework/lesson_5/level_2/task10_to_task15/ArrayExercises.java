package student_olga_dubrovskaja.homework.lesson_5.level_2.task10_to_task15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayExercises {
    public static void main(String[] args) {
        ArrayExercises exercise = new ArrayExercises();
        int[] array = new int[3];
        exercise.methodForTask10(array);
        exercise.methodForTask11(array);
        exercise.methodForTask12(array);
        exercise.methodForTask13(array);
        exercise.methodForTask14(array);
        exercise.methodForTask15(array);
    }

    /*
    Task 10
    Напишите программу, в которой:
     - создайте массив целых чисел длиной 3,
     - заполните каждую ячейку массива любым целым числом,
    - выведите значение каждой ячейки на консоль.

    */
    public void methodForTask10(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println("Task 10 output: " + Arrays.toString(array));
    }

/*
    Task 14
    Напишите программу, в которой:
    - создайте массив целых чисел длиной 3,
     - заполните каждую ячейку массива случайным числом,
     - посчитайте среднее значение и выведите его на консоль.
 */

    public void methodForTask14(int[] array) {
        Random random = new Random();
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            sum += array[i];
        }
        double mean = sum / array.length;
        System.out.println("Task 14 output: " + Arrays.toString(array) + " Mean: " + mean);
    }

    /*
    Task 11
      Напишите программу, в которой:
    - создайте массив целых чисел длиной 3,
    - заполните каждую ячейку массива числом, запрошенным у пользователя,
    - выведите значение каждой ячейки на консоль.
     */

    public void methodForTask11(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the number: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Task 11 output: " + Arrays.toString(array));
    }
    /*
    Task 12
    Напишите программу, в которой:
     - создайте массив целых чисел длиной 3,
     - заполните каждую ячейку массива случайным числом,
     - выведите значение каждой ячейки на консоль.
     */

    public void methodForTask12(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Task 12 output: " + Arrays.toString(array));
    }

    /*
    Task 13
    Написашите программу, в которой:
    - создайте массив целых чисел длиной 3,
    - заполните каждую ячейку массива случайным числом,
    - посчитайте сумму всех ячеек и распечатайте ее на консоль.

     */
    public void methodForTask13(int[] array) {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            sum += array[i];
        }
        System.out.println("Task 13 output: " + Arrays.toString(array) + " SUM: " + sum);
    }

    /*
    Task 15
    Напишите программу, в которой:
    - создайте массив целых чисел длиной 3,
    - заполните каждую ячейку массива случайным числом,
    - выведите значение каждой ячейки на консоль,
    - увеличьте значение каждой ячейки на 2,
    - выведите значение каждой ячейки на консоль.
     */
    public void methodForTask15(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Task 15 output: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] += 2;
        }
        System.out.println("Task 15 output: " + Arrays.toString(array));
    }
}
