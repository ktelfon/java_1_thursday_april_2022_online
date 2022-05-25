package student_olga_dubrovskaja.homework.lesson_4.level_3.task8;

import java.util.Scanner;

class ThreeEqualNumbers {
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
        if (firstNumber==secondNumber && firstNumber == thirdNumber){
            System.out.println("All the numbers are equal");
        } else if (firstNumber!=secondNumber && firstNumber!=thirdNumber && secondNumber!= thirdNumber){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
