package student_olga_dubrovskaja.homework.lesson_4.level_2.task7;

import teacher.codereview.CodeReview;

import java.util.Scanner;
//Написать программу, которая запрашивает у пользователя
//два целых числа и выводит на консоль:
//- "Numbers are equals" - если числа равны
//- "Numbers are different" - если числа не равны

@CodeReview(approved = true)
class EqualNumbers {
    private int firstNumber;
    private int secondNumber;

    public void setNumbers() {
        System.out.print("Insert a first number: ");
        Scanner scanner = new Scanner(System.in);
        this.firstNumber = scanner.nextInt();
        System.out.print("Insert a second number: ");
        this.secondNumber = scanner.nextInt();
    }

    public void printEqualNumber(){
        if (firstNumber == secondNumber){
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
