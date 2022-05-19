package student_artemijs_talamajevs.lesson_3.level_7;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double radius=scanner.nextInt();
        Circle circle=new Circle(radius);
       double circleArea=circle.calculateArea(circle.getRadius());
        System.out.println("Area is "+ circleArea);

    }
}
