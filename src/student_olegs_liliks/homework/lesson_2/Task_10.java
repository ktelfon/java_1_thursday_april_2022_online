package student_olegs_liliks.homework.lesson_2;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert circle radius");
        double radius = scanner.nextDouble();

        double circumference = Math.PI*2*radius;
        System.out.println("Perimeter is " + circumference);
        double area = Math.PI*radius*radius;
        System.out.println("Area is " + area);


    }
}
