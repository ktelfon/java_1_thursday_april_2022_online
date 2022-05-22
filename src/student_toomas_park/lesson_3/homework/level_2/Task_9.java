package student_toomas_park.lesson_3.homework.level_2;
import java.util.Scanner;
public class Task_9 {
    public static void main(String[] args){

        Scanner user = new Scanner(System.in);
        System.out.print("Ваше имя : ");
        String userName = user.nextLine();
        System.out.println("Здравствуйте " + userName + " !");
    }
}
