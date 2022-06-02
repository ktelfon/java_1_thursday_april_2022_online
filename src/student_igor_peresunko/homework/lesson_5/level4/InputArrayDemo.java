package student_igor_peresunko.homework.lesson_5.level4;

import java.util.Arrays;
import java.util.Scanner;

public class InputArrayDemo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter array size");
        int arraySize = scr.nextInt();
        int[] ar = new int [arraySize];

        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter number -" + (i + 1) + ":");
            ar[i] = scr.nextInt();
        }

        System.out.println(Arrays.toString(ar));

        System.out.println("Enter array size:");
        arraySize = scr.nextInt();
        int[] numbers = new int[arraySize];
        int i = 0;
        while (i< numbers.length){
            System.out.println("Enter number -" + (i + 1) + ":");
            numbers[i] = scr.nextInt();
            ++i;
        }

        String arrayInTextForm = Arrays.toString(numbers);
        System.out.println(arrayInTextForm);


    }
}
