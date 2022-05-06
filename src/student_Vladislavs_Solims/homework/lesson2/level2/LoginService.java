package student_Vladislavs_Solims.homework.lesson2.level2;
//task 7 , 8
import java.util.Scanner;

public class LoginService {
    public static void main(String[] args) {

        System.out.println("You can login!");

        Scanner scr = new Scanner(System.in) ;
        String login = scr.next() ;
        System.out.println("Hello "+ login) ;
    }
}
