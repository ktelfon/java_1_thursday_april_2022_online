package student_olegs_liliks.training_lesson4;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int biggest = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert first number : ");
        int numberOne = scanner.nextInt();
        System.out.print("Insert second number: ");
        int numberTwo = scanner.nextInt();
        System.out.print("Insert third number: ");
        int numberThree = scanner.nextInt();
        if (numberOne>numberTwo && numberOne>numberThree){
            System.out.println("Biggest is number1 " +numberOne);
        }
        else if (numberThree> numberTwo && numberThree>numberOne){
            System.out.println("Number 3 is bigger " + numberThree);
        }
        else {
            System.out.println("Number 2 is bigger " +numberTwo);
        }
    }
}
