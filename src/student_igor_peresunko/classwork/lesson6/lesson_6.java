package student_igor_peresunko.classwork.lesson6;

import java.util.Arrays;


public class lesson_6 {
    public static void main(String[] args) {
        int [] [] table = new int[5][5];
        int[][] tableTwo = {
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5}

        };

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; i++) {
                table[i][j] = j + 1;
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; i++) {

                System.out.println("i:" + i);
                System.out.println("j:" + j);
                System.out.println("value: " + table[i][j]);
            }
        }
    }
}
