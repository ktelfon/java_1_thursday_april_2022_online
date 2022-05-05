package student_olga_dubrovskaja.homework.lesson1;

import java.util.Scanner;

public class Numbers {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Insert first number here:");
                int firstNumber = scanner.nextInt();
                System.out.println("Insert second number here:");
                int secondNumber = scanner.nextInt();
                int sumResult = firstNumber + secondNumber;
                int subtraction = firstNumber - secondNumber;
                int multiplication = firstNumber * secondNumber;
                int division = firstNumber / secondNumber;
                System.out.println(firstNumber + " + " + secondNumber + " = " + sumResult);
                System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);
                System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);
                System.out.println(firstNumber + " / " + secondNumber + " = " + division);


        }
}


// Написать консольную программу, которая запрашивает у пользователя два целых числа и
//      выводит на консоль результаты: сложения, вычитания, умножения и деления.
//     1. Создать класс с нужным именем;
//    2. Создать описать main метод;
//        3. Воспользуйтесь специальным классом Scanner и его методом nextInt() для получения ввода с клавиатуры
//        Scanner scanner = new Scanner(System.in);
//       int firstNumber = scanner.nextInt();
//        4. Запишите полученные результаты в переменные;
//       5. При помощи System.out.println() выведите на консоль полученные результаты сложения, вычитания, умножения и деления.
//      (каждый результат на новой строке отдельно).