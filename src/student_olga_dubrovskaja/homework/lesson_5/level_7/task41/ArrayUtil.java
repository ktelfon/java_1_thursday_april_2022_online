package student_olga_dubrovskaja.homework.lesson_5.level_7.task41;

import teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@CodeReview(approved = true)
class ArrayUtil {

    public int getArrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        return scanner.nextInt();
    }

    public void fillArrayWithNumbersFromUser(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter next number: ");
            array[i] = scanner.nextInt();
        }
    }

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] array) {
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

    public String findEvenNumbers(int[] array) {
        String evenNumbers = "";
        for (int j : array) {
            if (j % 2 == 0) {
                evenNumbers += j + " ";
            }
        }
        return evenNumbers;
    }

    public String findOddNumbers(int[] array) {
        String oddNumbers = "";
        for (int j : array) {
            if (j % 2 != 0) {
                oddNumbers += j + " ";
            }
        }
        return oddNumbers;
    }

}
