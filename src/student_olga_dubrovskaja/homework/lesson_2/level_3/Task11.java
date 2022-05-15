package student_olga_dubrovskaja.homework.lesson_2.level_3;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers;
        int arrayLength;
        arrayLength = 3;
        numbers = new int[arrayLength];
        double sumNumbers = 0;
        double mean;
        int counter;
        for (counter = 0; counter < arrayLength; counter++) {
            System.out.println("insert " + (counter + 1) + ". number: ");
            numbers[counter] = scanner.nextInt();
        }
        System.out.print("Your numbers are: ");

        for (counter = 0; counter < arrayLength; counter++) {
            System.out.print(numbers[counter] + " ");
            sumNumbers = sumNumbers + numbers[counter];
        }
        mean = sumNumbers / arrayLength;
        System.out.println("Their mean value is " + mean);

    }
}

//Напишите программу, которая запрашивает у пользователя
//три целых числа и выводит их среднее арифметическое
//(складывает все числа и делит на их количество).
//
//Примечение: обратите внимание, что результат может быть дробным числом.