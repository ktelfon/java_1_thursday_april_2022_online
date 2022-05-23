package student_toomas_park.lesson_4.homework.level_2;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Введите первое целое число : ");
        int number1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Введите второе целое число : ");
        int number2 = input2.nextInt();
        if (number1 < number2)
            System.out.println("Второе число больше первого");
        else
            System.out.println("Первое число больше второго");
    }
}
