package student_toomas_park.lesson_5.homework.level_5;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }
    public void fillArrayWithRandomNumbers(int[] fillArray) {
        Random fill = new Random();
        for (int i = 0; i < fillArray.length; i++) {
            fillArray[i] = fill.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] array) {

        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < minNumber) {
                minNumber = i;
            }
        }
        return minNumber;
    }

    public void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }


}
