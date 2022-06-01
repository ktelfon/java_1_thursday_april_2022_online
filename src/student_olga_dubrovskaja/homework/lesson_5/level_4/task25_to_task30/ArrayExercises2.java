package student_olga_dubrovskaja.homework.lesson_5.level_4.task25_to_task30;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayExercises2 {
    public static void main(String[] args) {
        ArrayExercises2 exercise = new ArrayExercises2();
        exercise.methodForTask25();
        exercise.methodForTask26();
        exercise.methodForTask27();
        exercise.methodForTask28();
        exercise.methodForTask29();
        exercise.methodForTask30();

    }

    /*
    Task 25
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
     */
    public void methodForTask25() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter next number: ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }

    /*
    Task 26
    Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
     */
    public void methodForTask26() {
        int[] array = arrayWithRandomNumbers();
        System.out.println(Arrays.toString(array));
    }

    /* Task 27
    Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
     */

    public void methodForTask27() {
        int[] array = arrayWithRandomNumbers();
        int maxNumber = Integer.MIN_VALUE;
        System.out.println(Arrays.toString(array));
        for (int j : array) {
            if (j > maxNumber) {
                maxNumber = j;
            }
        }
        System.out.println("Max number in array: " + maxNumber);

    }
    /* Task 28
    Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
     */

    public void methodForTask28() {
        int[] array = arrayWithRandomNumbers();
        int minNumber = Integer.MAX_VALUE;
        System.out.println(Arrays.toString(array));
        for (int j : array) {
            if (j < minNumber) {
                minNumber = j;
            }
        }
        System.out.println("Min number in array: " + minNumber);
    }

    /*  Task29
    Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.
     */
    public void methodForTask29() {
        int[] array = arrayWithRandomNumbers();
        String evenNumbers = "";
        System.out.println(Arrays.toString(array));
        for (int j : array) {
            if (j % 2 == 0) {
                evenNumbers += j + " ";
            }
        }
        System.out.println("Even numbers in array: " + evenNumbers);
    }

    /* Task30
    Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.
     */

    public void methodForTask30() {
        int[] array = arrayWithRandomNumbers();
        String oddNumbers = "";
        System.out.println(Arrays.toString(array));
        for (int j : array) {
            if (j % 2 != 0) {
                oddNumbers += j + " ";
            }
        }
        System.out.println("Odd numbers in array: " + oddNumbers);
    }

    public int[] arrayWithRandomNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

}
