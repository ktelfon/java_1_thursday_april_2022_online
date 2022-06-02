package student_olegs_liliks.homework.lesson_4.level_3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first number : ");
        int numberOne = scanner.nextInt();
        System.out.print("Insert second number: ");
        int numberTwo = scanner.nextInt();
        System.out.print("Insert third number: ");
        int numberThree = scanner.nextInt();
        if (numberOne<numberTwo && numberTwo<numberThree){
            System.out.println("All numbers are increasing");}
        else if (numberOne > numberTwo &&  numberTwo > numberThree){
            System.out.println("All numbers are decreasing");}
        else System.out.println("Neither increasing or decreasing order");
    }}

