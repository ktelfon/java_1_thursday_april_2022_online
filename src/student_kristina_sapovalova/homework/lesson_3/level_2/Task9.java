package student_kristina_sapovalova.homework.lesson_3.level_2;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your name please:");

        String userName = scr.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}

/* Учимся работать со строками.

Тема: Считывание строк с консоли.

Программа должна спрашивать как зовут пользователя,
считывать его имя с консоли и выводить приветствие
в виде: "Hello UserName!".

Подсказка: строку с консоли можно считать используя
обьект Scanner. Загуглите как это можно сделать:
"как в Java считать строку с консоли". */
