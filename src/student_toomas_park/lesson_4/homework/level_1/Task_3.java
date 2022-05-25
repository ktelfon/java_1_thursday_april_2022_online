package student_toomas_park.lesson_4.homework.level_1;
import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "don't forget {} when writing if")
public class Task_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число : ");
        int number = input.nextInt();
        if (number == 1)
            System.out.println("Понедельник");
        else if (number == 2)
            System.out.println("Вторние");
        else if (number == 3)
            System.out.println("Среда");
        else if (number == 4)
            System.out.println("Четверг");
        else if (number == 5)
            System.out.println("Пятница");
        else if (number == 6)
            System.out.println("Суббота");
        else if (number == 7)
            System.out.println("Воскресенье");
        else
            System.out.println("Такого дня недели еще не существует");
    }
}
