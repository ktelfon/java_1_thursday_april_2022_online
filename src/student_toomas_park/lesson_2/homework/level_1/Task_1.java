package student_toomas_park.lesson_2.homework.level_1;
import java.util.Scanner;
public class Task_1 {
 public static void main(String[] args){
     Scanner in1 = new Scanner(System.in);
     System.out.println("Введите первое число");
     int number1 = in1.nextInt();

     Scanner in2 = new Scanner(System.in);
     System.out.println("Введите второе число");
     int number2 = in2.nextInt();

     int res1 = number1 + number2;
     int res2 = number1 - number2;
     int res3 = number1 * number2;
     int res4 = number1 / number2;

     System.out.println("Результат сложения двух введенных чисел : "+res1);
     System.out.println("Результат вычитания из первого чсисла второго : "+res2);
     System.out.println("Результат умножения двух введенных чисел : "+res3);
     System.out.println("Результат деления первого числа на второе : "+res4);
 }
}
