package student_olegs_liliks.homework.lesson_4.level_3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first number : ");
        int numberOne = scanner.nextInt();
        System.out.print("Insert second number: ");
        int numberTwo = scanner.nextInt();
        System.out.print("Insert third number: ");
        int numberThree = scanner.nextInt();
        if (numberOne>numberTwo && numberOne>numberThree){
            System.out.println("The biggest is : " + numberOne);}
        else if (numberTwo > numberOne &&  numberTwo > numberThree){
            System.out.println("The biggest is : " + numberTwo);}
        else System.out.println("The biggest is : " +numberThree);
    }}

