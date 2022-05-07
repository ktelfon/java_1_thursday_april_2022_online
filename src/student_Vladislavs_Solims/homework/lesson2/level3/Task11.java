package student_Vladislavs_Solims.homework.lesson2.level3;

import java.util.Scanner;

public class Task11 {
 /*   Напишите программу, которая запрашивает у пользователя
    три целых числа и выводит их среднее арифметическое
            (складывает все числа и делит на их количество).

    Примечение: обратите внимание, что результат может быть дробным числом. */
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in) ;

     System.out.print("Write three numbers : ");
     double usernum1 = scanner.nextDouble();
     double usernum2 = scanner.nextDouble();
     double usernum3 = scanner.nextDouble();
     double[] nums = { usernum1 , usernum2 , usernum3} ;
     double result = 0;

     for (double d : nums) {
         result += d;
     }
     System.out.println("Average is = " + " " +result / nums.length);
     }



 }

