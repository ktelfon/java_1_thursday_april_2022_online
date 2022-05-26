package student_olga_dubrovskaja.homework.lesson_4.level_2.task6;
// Написать программу, которая запрашивает у пользователя
//два целых числа и выводит на консоль наименьшее из них.
import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class SmallerNumber {

    private int firstNumber;
    private int secondNumber;

    public void setNumbers() {
        System.out.print("Insert a first number: ");
        Scanner scanner = new Scanner(System.in);
        this.firstNumber = scanner.nextInt();
        System.out.print("Insert a second number: ");
        this.secondNumber = scanner.nextInt();
    }

    public void printSmallerNumber(){
        if (firstNumber < secondNumber){
            System.out.println(this.firstNumber);
        } else if(firstNumber == secondNumber) {
            System.out.println("Numbers are even");
        } else {
            System.out.println(this.secondNumber);
        }
    }
}
