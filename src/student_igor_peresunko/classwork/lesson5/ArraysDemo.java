package student_igor_peresunko.classwork.lesson5;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String [] args){
        int[] number = new int[10];
        number[0] = 1001;
        for (int i = 0; i < number.length; i++){
            number[i] = i * 100;
            System.out.println(number[i]);

        }

        for (int k : number) {
            System.out.println(k);
        }

        int specialNumbers = 700;
        int positionOfSpecialNumber = 0;
        for (int i = 0; i<number.length;i++){
            if (number[i]==specialNumbers){
                positionOfSpecialNumber = i;
            }
        }
        System.out.println("Increase 700or 7001");
        number[positionOfSpecialNumber] = 7001;
        System.out.println(Arrays.toString(number));

        // searching for min value
        int[] someNumbers = {47,76,989,8,345,567,-76,-56,-67};
        int result =Integer.MAX_VALUE;
        for (int i = 0; i<someNumbers.length; i++){
            if (result>someNumbers[i]){
                result = someNumbers[i];

            }
        }

        System.out.println(result);


    }
}
