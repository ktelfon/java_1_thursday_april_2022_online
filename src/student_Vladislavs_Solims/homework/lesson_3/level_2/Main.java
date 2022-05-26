package student_Vladislavs_Solims.homework.lesson_3.level_2;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String myName = "Vlad"; // ???
        String userName = scanner.next();
        String greting = "Hello" + " " + userName + "!";
        System.out.println(greting);
    }
}
