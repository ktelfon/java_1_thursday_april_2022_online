package student_toomas_park.lesson_4.homework.level_3;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_9 {

    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Введите первое целое число : ");
        int number1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Введите второе целое число : ");
        int number2 = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.print("Введите третье целое число : ");
        int number3 = input3.nextInt();
        if (number1 < number2) {
            if (number2 < number3)
                System.out.println("На возрастание");
            else
                System.out.println("В разнобой");
        }
        else if (number1 > number2){
            if (number2 > number3)
                System.out.println("На убывание");
            else
                System.out.println("В разнобой");
        }
    }
}
