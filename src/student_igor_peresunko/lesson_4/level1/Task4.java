package student_igor_peresunko.lesson_4.level1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if(number %2 == 0){
        System.out.println("The number entered is even");}
        else {
        System.out.println("The number entered is not even");}



    }
}
