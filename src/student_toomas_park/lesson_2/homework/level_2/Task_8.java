package student_toomas_park.lesson_2.homework.level_2;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name1 = name.nextLine();
        System.out.println("Здравствуйте "+name1);
    }
}
