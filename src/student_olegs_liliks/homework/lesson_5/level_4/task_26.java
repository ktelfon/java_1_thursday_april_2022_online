package student_olegs_liliks.homework.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write array length: ");
        int arrayLength = scanner.nextInt();
        int [] numbers = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i<arrayLength; i++){
            System.out.println("Numbers are : " + random.nextInt());}

    }
}

