package student_olga_dubrovskaja.homework.lesson_3.level_2;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your username: ");
        String userName = scanner.next();
        System.out.println("Hello, "+ userName);
    }
}



//Учимся работать со строками.
//
//Тема: Считывание строк с консоли.
//
//Программа должна спрашивать как зовут пользователя,
//считывать его имя с консоли и выводить приветствие
//в виде: "Hello UserName!".
//
//Подсказка: строку с консоли можно считать используя
//обьект Scanner. Загуглите как это можно сделать:
//"как в Java считать строку с консоли".