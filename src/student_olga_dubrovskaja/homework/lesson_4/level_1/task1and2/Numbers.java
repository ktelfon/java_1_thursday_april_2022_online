package student_olga_dubrovskaja.homework.lesson_4.level_1.task1and2;
//Написать программу, которая запрашивает у
//пользователя
//целое число и выводит на консоль
//положительное оно или отрицательное.

import java.util.Scanner;

class Numbers {
    private int number;

    public void setNumber() {
        System.out.print("Insert a number here: ");
        Scanner scanner = new Scanner(System.in);
        this.number = scanner.nextInt();
    }

    public int getNumber() {
        return number;
    }

    public void printNumber() {
        if (this.number > 0) {
            System.out.println("Your number is " + this.number + ". This is a positive number");
        } else if (this.number < 0) {
            System.out.println("Your number is " + this.number + ". This is a negative number");
        } else System.out.println("Your number is zero");
    }

}
