package student_toomas_park.lesson_5.homework.level_2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        int[] number = new int[3];
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите первое число");
        number[0] = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите первое число");
        number[1] = in2.nextInt();

        Scanner in3 = new Scanner(System.in);
        System.out.println("Введите первое число");
        number[2] = in3.nextInt();

        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
    }
}
