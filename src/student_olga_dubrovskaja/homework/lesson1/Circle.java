package student_olga_dubrovskaja.homework.lesson1;
import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius;
        System.out.println("Insert radius: ");
        radius = scanner.nextDouble();

        double perimeter;
        double area;
        double pi = Math.PI;
        perimeter = 2*pi*radius;
        area = pi*radius*radius;

        System.out.println("Radius = " + radius);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);


    }
}


//      7. Напишите программу, которая запрашивает у пользователя
//      радиус круга (вещественное число) и печатает на консоль
//      периметр и площадь круга.
//
//      Test Data:
//      Radius = 7.5
//      Expected Output
//    Perimeter is = 47.12388980384689
//  Area is = 176.71458676442586