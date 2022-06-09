package student_Vladislavs_Solims.homework.lesson_5.level_5;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLenght) {
        return new int[arrayLenght];
    }

    public void fillTheArrayRandom(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > maxNumber) {
                maxNumber = j;
            }
        }
        return maxNumber;

    }

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