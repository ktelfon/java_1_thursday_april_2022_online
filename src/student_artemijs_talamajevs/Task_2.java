package student_artemijs_talamajevs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_2 {
    public static void main (String[] args) {
        //zНаписать консольную программу, которая запрашивает у пользователя два вещественных числа
//(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
//Вещественные числа можно запрашивать с консоли используя обьект Scanner
//следующим образом:
//
//    Scanner scanner = new Scanner(System.in);
//    double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Addition");
        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber=scanner.nextDouble();
        double secondDoubleNumber=scanner.nextDouble();
        double resultsFirstDouble=firstDoubleNumber+secondDoubleNumber;
        System.out.println("resultsFirstDouble"+ resultsFirstDouble);

        System.out.println("subtraction");
        double thirdDoubleNumber=scanner.nextDouble();
        double fourthDoubleNumber=scanner.nextDouble();
        double resultsThirdFourth=thirdDoubleNumber-fourthDoubleNumber;
        System.out.println("resultsThhirdFourth"+resultsThirdFourth);

        System.out.println("Multiplication");
        double fifthDoubleNumber=scanner.nextDouble();
        double sixthDoubleNumber=scanner.nextDouble();
        double resultsFifthSixth=fifthDoubleNumber*sixthDoubleNumber;
        System.out.println("resultsFifthSixth"+resultsFifthSixth);

        System.out.println("Division");
        double seventhDoubleNumber=scanner.nextDouble();
        double eigthDoubleNumber=scanner.nextDouble();
        double resultsSevenEigth=seventhDoubleNumber/eigthDoubleNumber;
        System.out.println("resultsSevenEigth"+resultsSevenEigth);



    }
}
