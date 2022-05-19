package student_Vladislavs_Solims.homework.lesson_3.level_7.task_29.task_30;

import java.util.Scanner;

public class CircleDemo {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);
        circle.setRadius(scanner.nextDouble());
        circle.getArea();
        System.out.println(circle.getArea());

    }

}
