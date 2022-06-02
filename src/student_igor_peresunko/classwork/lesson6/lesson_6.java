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
        /*
        *
        * [
        *   table[0]==[1,2,3,4,5],
        *   table[1]==[1,2,3,4,5],
        *   table[2]==[1,2,3,4,5],
        *   table[3]==[1,2,3,4,1],
        *   table[4]==[1,1,1,1,1]
        *
        *
        *  */

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; i++) {
                table[i][j] = j + 1;
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; i++) {

                System.out.println("i:" + i);
                System.out.println("j:" + i);
                System.out.println("value: " + table[i][j]);
            }
        }
    }
}
