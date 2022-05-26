package student_Vladislavs_Solims.class_exersizes.lesson_5;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] number = new int[10];
        number[0] = 1001;

        for (int i = 0; i < number.length; i++) {
            number[i] = i * 100;
            System.out.println(number[i]);
        }
        for (int k : number) {
            System.out.println(k);
        }
        int specialNumber = 700;
        int positionOfSpecialNumber = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == specialNumber) {
                positionOfSpecialNumber = i;
            }
        }
            System.out.println("Increase 700 to 7001");
            number[positionOfSpecialNumber] = 7001;
            System.out.println(Arrays.toString(number));


            int[] someNumbers = {45, 76, 897, 23, 165, 8, 34, 123, 8, 345, 123, -234, -456456};
            int result = Integer.MAX_VALUE;
            for (int j = 0; j < someNumbers.length; j++) {
                if (result > someNumbers[j]) {
                    result = someNumbers[j];
                }
            }
            System.out.println(result);
        }


    }

