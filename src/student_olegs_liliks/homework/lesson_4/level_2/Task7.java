package student_olegs_liliks.homework.lesson_4.level_2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first number : ");
        int numberOne = scanner.nextInt();
        System.out.print("Insert second number: ");
        int numberTwo = scanner.nextInt();
        if (numberOne==numberTwo){
            System.out.println("Numbers are equals");}
        else{
            System.out.println("Numbers are different");}
    }}

