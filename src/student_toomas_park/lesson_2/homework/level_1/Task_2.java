package student_toomas_park.lesson_2.homework.level_1;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args){
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите первое число");
        float number1 = in1.nextFloat();

        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите второе число");
        float number2 = in2.nextFloat();

        float res1 = number1 + number2;
        float res2 = number1 - number2;
        float res3 = number1 * number2;
        float res4 = number1 / number2;

        System.out.println("Результат сложения двух введенных чисел : "+res1);
        System.out.println("Результат вычитания из первого чсисла второго : "+res2);
        System.out.println("Результат умножения двух введенных чисел : "+res3);
        System.out.println("Результат деления первого числа на второе : "+res4);
    }
}
