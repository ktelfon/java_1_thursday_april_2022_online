package student_toomas_park.lesson_2.homework.level_3;
import java.util.Scanner;
public class Task_10 {
    public static void main(String[] args){
        Scanner rad1 = new Scanner(System.in);
        System.out.println("Введите радиус");

        double radius = rad1.nextDouble();
        double perimetr = Math.PI*2*radius;
        double area = Math.PI*radius*radius;

        System.out.println("Радиус : " + radius);
        System.out.println("Периметр : " + perimetr);
        System.out.println("Площадь : " + area);
    }
}