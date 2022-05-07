package student_Vladislavs_Solims.homework.lesson2.level3;



import java.util.Scanner;

import static java.lang.Math.PI;

public class Task10 {
    /*7,Напишите программу, которая запрашивает у пользователя
        радиус круга (вещественное число) и печатает на консоль
        периметр и площадь круга.

        Test Data:
        Radius = 7.5

        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        double radius ;
        System.out.println("write you circle radius :") ;
        radius = scanner.nextDouble();

        double perimeter ;
        double area ;
        double pi = PI ;
        perimeter = 2*pi*radius;
        area = pi*radius*radius;

        System.out.println("Perimetr =" + perimeter) ;
        System.out.println("Area = " + area ) ;





    }
}
