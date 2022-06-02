package teacher.lesson_6_arrays_while_loop.lessoncode;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArrayDemo {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
//        System.out.println("Enter array size:");
//        int arraySize = scr.nextInt();
//        int[] ar = new int[arraySize];
//
//        for (int i = 0; i < ar.length; i++) {
//            System.out.println("Enter number #" + (i + 1) + ":");
//            ar[i] = scr.nextInt();
//        }
//
//        System.out.println(Arrays.toString(ar));

//        System.out.println("Enter array size again:");
//        arraySize = scr.nextInt();
//        int[] numbers = new int[arraySize];
//        int i = 0;
//        while (i < numbers.length) {
//            System.out.println("Enter number #" + (i + 1) + ":");
//            numbers[i] = scr.nextInt();
//            ++i;
//        }
//
//        String arrayInTextForm = Arrays.toString(numbers);
//        System.out.println(arrayInTextForm);


        int[][] table = new int[5][5];
        int[][] tableTwo = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };
        /*
         *
         *   [
         *       table[0]==[1,2,3,4,5],
         *       table[1]==[1,2,3,4,5],
         *       table[2]==[1,2,3,4,5],
         *       table[3]==[1,2,3,4,5],
         *       table[4]==[1,2,3,4,5]
         *   ]
         * */

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = j + 1;
            }
        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.println("i: " + i);
                System.out.println("j: " + j);
                System.out.println("value: " + table[i][j]);
            }
        }
    }
}
