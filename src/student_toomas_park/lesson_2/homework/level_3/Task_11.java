package student_toomas_park.lesson_2.homework.level_3;
import java.util.Scanner;
public class Task_11 {
    public static void main(String[] args){
        System.out.println("Введите первое число");
        Scanner in1 = new Scanner(System.in);
        double num1 = in1.nextDouble();

        System.out.println("Введите второе число");
        Scanner in2 = new Scanner(System.in);
        double num2 = in2.nextDouble();

        System.out.println("Введите третье число");
        Scanner in3 = new Scanner(System.in);
        double num3 = in3.nextDouble();

        double res = (num1+num2+num3)/3;
        System.out.println("Среднее арифметическое : " +res);

    }
}