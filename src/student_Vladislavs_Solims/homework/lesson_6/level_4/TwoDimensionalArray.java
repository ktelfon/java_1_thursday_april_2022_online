package student_Vladislavs_Solims.homework.lesson_6.level_4;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] arr = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
            arr[i][j] = random.nextInt(0,100);
            }
            System.out.println(Arrays.toString(arr));

        }
    }

}
