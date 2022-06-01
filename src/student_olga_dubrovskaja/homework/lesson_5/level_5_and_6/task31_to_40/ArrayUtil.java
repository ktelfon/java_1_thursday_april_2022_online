package student_olga_dubrovskaja.homework.lesson_5.level_5_and_6.task31_to_40;

/* Task 31
Создайте класс ArrayUtil.
Напишите в этом классе метод для создания
массива целых чисел указанной длины.
 */

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    /* Task 33
    Создайте в классе ArrayUtil метод для
    заполнения массива случайными целыми числами.
     */

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    /*
    Task 34
    Создайте в классе ArrayUtil метод для
    распечатки массива целых чисел на консоль.
     */

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    /*
    Task 35
    Создайте в классе ArrayUtil метод для
    нахождения максимального числа в массиве целых чисел.
     */
    public int findMaxNumber(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > maxNumber) {
                maxNumber = j;
            }
        }
        return maxNumber;
    }

    /*
    Task 37
    Создайте в классе ArrayUtil метод для
    нахождения минимального числа в массиве целых чисел.
     */
    public int findMinNumber(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < minNumber) {
                minNumber = j;
            }
        }
        return minNumber;
    }

}
