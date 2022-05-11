package student_Vladislavs_Solims.homework.lesson2.level3;



import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Задание 3 урока.")
public class Task9 {
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
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Write you number too see multiplication table til 10");

        int userNum = scanner.nextInt();
        int multiplication = 1 ;
        do {
            System.out.println(userNum * multiplication++);

        }while(multiplication<=10);

        System.out.println("Thank you");
        //на это ушло много времени , что бы загуглить и понять как это работает )

        // м


        }

    }

