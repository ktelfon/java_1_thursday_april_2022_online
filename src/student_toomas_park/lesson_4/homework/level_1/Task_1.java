package student_toomas_park.lesson_4.homework.level_1;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число : ");
        int number = input.nextInt();
        if (number < 0)
            System.out.println("Введенное число является отрицательным");
        else
            System.out.println("Введенное число является положительным");
    }
}
