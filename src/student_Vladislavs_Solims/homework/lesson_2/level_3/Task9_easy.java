package student_Vladislavs_Solims.homework.lesson_2.level_3;


import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task9_easy {
    /*Напишите программу, которая запрашивает у пользователя целое число
        и печатает на консоль таблицу умножения для этого числа до 10.

        Test Data:
        Input a number: 8

        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80  */

    public static void main(String[] args) {
        System.out.println("Write number too see the multiplication table til 10");

        Scanner scanner = new Scanner(System.in) ;
        int usernum = scanner.nextInt();

        int multiplication2 = usernum*2;
        int multiplication3 = usernum*3;
        int multiplication4 = usernum*4;
        int multiplication5 = usernum*5;
        int multiplication6 = usernum*6;
        int multiplication7 = usernum*7;
        int multiplication8 = usernum*8;
        int multiplication9 = usernum*9;
        int multiplication10 = usernum*10;

        System.out.println(usernum +" " + "* 1" + "=" + usernum) ;
        System.out.println(usernum +" " + "* 2" + "=" + multiplication2) ;
        System.out.println(usernum +" " + "* 3" + "=" + multiplication3) ;
        System.out.println(usernum +" " + "* 4" + "=" + multiplication4) ;
        System.out.println(usernum +" " + "* 5" + "=" + multiplication5) ;
        System.out.println(usernum +" " + "* 6" + "=" + multiplication6) ;
        System.out.println(usernum +" " + "* 7" + "=" + multiplication7) ;
        System.out.println(usernum +" " + "* 8" + "=" + multiplication8) ;
        System.out.println(usernum +" " + "* 9" + "=" + multiplication9) ;
        System.out.println(usernum +" " + "* 10" + "=" + multiplication10) ;
        System.out.println("Thanks for using my app");

    }
}
