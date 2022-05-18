package student_Vladislavs_Solims.class_exersizes.lesson1.lesson2;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        System.out.println("Write two numbers for suming them : ");

        Scanner scanner = new Scanner(System.in);


        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("correct answer is " + sum);


        //программа делает рандомное число
        java.util.Random num3 = new java.util.Random();
        // случайное число дожно быть от 1- 100
        int randomNumber = num3.nextInt(0,100);
        // Println
        System.out.println(randomNumber);

    }

}

