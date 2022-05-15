package student_olegs_liliks.homework.lesson_2.level_3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Write number 1: ");
        double firstNumber = sc.nextInt();
        System.out.println("Write number 2: ");
        double secondNumber = sc.nextInt();
        System.out.println("Write number 3: ");
        double thirdNumber = sc.nextInt();
        double average = (firstNumber+secondNumber+thirdNumber)/3;
        System.out.println("Average is  "+ average);

}}
