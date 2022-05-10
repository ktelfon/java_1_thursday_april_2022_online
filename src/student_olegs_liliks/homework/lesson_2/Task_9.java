package student_olegs_liliks.homework.lesson_2;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int input;
        input = scanner.nextInt();
        int x;
        int multiple;
        for (x=1; x<11; x++){
        multiple = input *x;
        System.out.println(input + "x" + x +"=" + multiple
                );}



    }
}
