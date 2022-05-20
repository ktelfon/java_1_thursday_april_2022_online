package student_olga_dubrovskaja.homework.lesson_4.level_3.task10;
//Написать программу, которая запрашивает у пользователя
//три целых числа и выводит на консоль наибольшее из них.
//
//PS: перед решением этой задачи распишите на бумаге
//или в коментарии все возможные варианты (комбинации).
//Это поможет вам правильно написать программу!
//Нельзя пользоваться классом Math.

import java.util.Scanner;

class GreaterNumber {
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
        int greaterNumber = firstNumber;
        if (secondNumber > firstNumber) {
            greaterNumber = secondNumber;
        } if (thirdNumber > greaterNumber){
            greaterNumber = thirdNumber;
        }
        System.out.println(greaterNumber);
    }
}
