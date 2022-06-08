package student_olga_dubrovskaja.homework.lesson_6.level_3.task_12_to_task_17;

import java.util.Arrays;

class ArrayService {
    public boolean contains(int[] array, int numberToFind) {
        boolean contains = false;
        for (int j : array) {
            if (j == numberToFind) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    public int countOccurrences(int[] array, int numberToFind) {
        int counter = 0;
        for (int j : array) {
            if (j == numberToFind) {
                counter++;
            }
        }
        return counter;
    }

    public boolean replaceFirstOccurrence(int[] array, int numberToReplace, int newNumber) {
        boolean isReplaced = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                isReplaced = true;
                break;
            }
        }
        return isReplaced;
    }

    public int replaceAll(int[] array, int numberToReplace, int newNumber) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                counter++;
            }
        }
        return counter;
    }

    public void revertArray(int[] array) {
        int m = 0;
        for (int i = 0; i < array.length / 2; i++) {
            m = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = m;
        }
    }

    public void sortArray(int[] array) {
        int m;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    m = array[i];
                    array[i] = array[j];
                    array[j] = m;
                }
            }
        }
    }

}
/*
5

 */