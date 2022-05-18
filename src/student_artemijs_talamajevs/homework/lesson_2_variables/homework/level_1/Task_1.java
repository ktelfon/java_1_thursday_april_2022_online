package student_artemijs_talamajevs.homework.lesson_2_variables.homework.level_1;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_1 {
    public static void main(String[] args) {
        //Написать консольную программу, которая запрашивает у пользователя два целых числа и
        //выводит на консоль результаты: сложения, вычитания, умножения и деления.
        //
        //1. Создать класс с нужным именем;
        //2. Создать описать main метод;
        //3. Воспользуйтесь специальным классом Scanner и его методом nextInt() для получения ввода с клавиатуры
        //          Scanner scanner = new Scanner(System.in);
        //          int firstNumber = scanner.nextInt();
        //4. Запишите полученные результаты в переменные;
        //5. При помощи System.out.println() выведите на консоль полученные результаты сложения, вычитания, умножения и деления.
        // (каждый результат на новой строке отдельно).
        System.out.println("addition");
        Scanner scr = new Scanner(System.in);
        int firstNumber = scr.nextInt();

        int b = scr.nextInt();

        int results = firstNumber + b;
        System.out.println("resultsOfAddition" + results);

        int secondNumber = scr.nextInt();
        int thirdNumber = scr.nextInt();
        int resultsOfSubtraction = secondNumber - thirdNumber;
        System.out.println("resultsOfSubtraction" + resultsOfSubtraction);

        int fifthNumber = scr.nextInt();
        int sixthNumber = scr.nextInt();
        int resultsOfMultiplication = fifthNumber * sixthNumber;
        System.out.println("resultsOfMultiplication" + resultsOfMultiplication);

        int eightNumber = scr.nextInt();
        int ninthNumber = scr.nextInt();
        int resultsOfDivision = eightNumber / ninthNumber;
        System.out.println("resultsOfDivision" + resultsOfDivision);


    }
}
