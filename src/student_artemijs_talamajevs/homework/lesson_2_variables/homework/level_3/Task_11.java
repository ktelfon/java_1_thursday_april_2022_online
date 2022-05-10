package student_artemijs_talamajevs.homework.lesson_2_variables.homework.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        //Напишите программу, которая запрашивает у пользователя
        //три целых числа и выводит их среднее арифметическое
        //(складывает все числа и делит на их количество).
        //
        //Примечение: обратите внимание, что результат может быть дробным числом.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write 3 integer number");
       double firstNumber=scanner.nextInt();
        double secondNumber= scanner.nextInt();
        double thirdNumber= scanner.nextInt();
        double results=firstNumber+secondNumber+thirdNumber;
        double resultsDivided=results/3;
        System.out.println("sum and divided by amount of numbers"+resultsDivided);



    }
}
