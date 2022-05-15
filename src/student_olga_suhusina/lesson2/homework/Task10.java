package student_olga_suhusina.lesson2.homework;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task10 {
    public static void main(String[] args){
        System.out.println("Input a radius: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        System.out.println("Expected Output: ");
        double perimeter = 2*radius*3.14;
        System.out.println("Perimeter is = "+perimeter);
        double area = 3.14*radius*radius;
        System.out.println("Area is = "+area);



    }

}
