package student_olegs_liliks.homework.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

public class task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write array length: ");
        int arrayLength = scanner.nextInt();
        int [] numbers = new int[arrayLength];
        for (int i = 0; i<arrayLength; i++){
        System.out.print("Write numbers : ");}
        int allNumbers = scanner.nextInt();
        System.out.println("Numbers are : " + Arrays.toString(numbers));

    }
}
