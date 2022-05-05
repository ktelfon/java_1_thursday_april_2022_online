package student_olga_dubrovskaja.homework.lesson1;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        System.out.println("Insert username: ");
        username = scanner.next();
        System.out.println("Hello, " + username);
    }
}


//    Написать консольную программу, которая запрашивает
//        имя пользователя и выводит на консоль текст:
//
//        Hello имя пользователя!
