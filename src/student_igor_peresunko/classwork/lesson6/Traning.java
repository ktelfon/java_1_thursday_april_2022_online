package student_igor_peresunko.classwork.lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Traning {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write an array size");
        int arraySize = scanner.nextInt();
        int[] userArray = new int[arraySize];

        System.out.println("enter array size again");
        arraySize=scanner.nextInt();
        int[] numbers = new int[arraySize];
        int i = 0;
        while (i<numbers.length){
            System.out.println("Enter number #" + (i+1) + ":");
            numbers[i]=scanner.nextInt();
            ++i;
        }
        String arrayInTelstForm = Arrays.toString(numbers);
        System.out.println(arrayInTelstForm);

    }

}
