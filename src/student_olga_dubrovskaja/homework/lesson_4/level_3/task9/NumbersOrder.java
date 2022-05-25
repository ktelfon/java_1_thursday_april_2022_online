package student_olga_dubrovskaja.homework.lesson_4.level_3.task9;
// Write a program that accepts three numbers from the user and prints:
//- "increasing" if the numbers are in increasing order,
//- "decreasing" if the numbers are in decreasing order,
//- "Neither increasing or decreasing order" otherwise.
import java.util.Scanner;

class NumbersOrder {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public void setNumbers() {
        System.out.print("Insert a first number: ");
        Scanner scanner = new Scanner(System.in);
        this.firstNumber = scanner.nextInt();
        System.out.print("Insert a second number: ");
        this.secondNumber = scanner.nextInt();
        System.out.print("Insert a third number: ");
        this.thirdNumber = scanner.nextInt();
    }
    public void compareAndPrint(){
        if (firstNumber < secondNumber && secondNumber < thirdNumber){
            System.out.println("Increasing");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber){
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
