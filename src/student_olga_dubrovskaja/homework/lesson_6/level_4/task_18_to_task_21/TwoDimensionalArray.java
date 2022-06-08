package student_olga_dubrovskaja.homework.lesson_6.level_4.task_18_to_task_21;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {
    private int[][] array;

    TwoDimensionalArray() {
        this.array = new int[2][5];
    }

    public void fillWithRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 100);
            }
        }
    }

    public int calculateSum() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public void printToConsole() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
