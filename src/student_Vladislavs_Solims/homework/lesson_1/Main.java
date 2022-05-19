package student_Vladislavs_Solims.homework.lesson_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //запустите программу , всё должно быть красиво :)

        //task 10 Внутри метода "main" напишите: System.out.println("Hello World!");
        System.out.println("Write an exersize number (10-12) too see the results  :");


        Scanner scanner = new Scanner(System.in) ;
        int exersizeNum = scanner.nextInt() ;

        //task11 Напишите Java программу, которая выведет на консоль сумму двух чисел.
        //Числа можно придумать любые, их не надо запрашивать у пользователя.
        //
        //Тестовые данные:
        //74 + 36
        //Ожидаемый результат:
        //110
        //
        //-----------------------------------------------------------------
        //
        //Write a Java program to divide two numbers and print on the screen.
        //Test Data :
        //50/3
        //Expected Output :
        //16

        int num1 = 74 ;
        int num2 = 36 ;
        int result = num1+num2 ;

        int num3 = 50 ;
        int num4 = 3 ;
        int result2 = num3/num4 ;

        //task12 Напишите Java программу, которая выведет на консоль результат умножения двух чисел.
        //Числа можно придумать любые, их не надо запрашивать у пользователя.
        //
        //Тестовые данные:
        //50 * 3
        //Ожидаемый результат:
        //150

        int result3 = num3*num4 ;


        //попробую выпендриться
        if(exersizeNum==10) {
            System.out.println("Hello world !");
        }
        if(exersizeNum==11) {
            System.out.println(result) ;
            System.out.println(result2) ;
        }
        if (exersizeNum == 12) {
            System.out.println(result3);

        }
        }


        }



