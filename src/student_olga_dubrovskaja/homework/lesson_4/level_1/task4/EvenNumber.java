package student_olga_dubrovskaja.homework.lesson_4.level_1.task4;
// Написать программу, которая запрашивает у пользователя
//целое число и выводит на консоль чётное оно или нет.
//
//Подсказка: используйте для определения чётное число или нет
//операцию остаток от деления (%). Если остаток от деления на 2
//равен нулю то число чётное, иначе не чётное.

import java.util.Scanner;

class EvenNumber {
    private int number;

    public void setNumber() {
        System.out.print("Insert a number here: ");
        Scanner scanner = new Scanner(System.in);
        this.number = scanner.nextInt();
    }

    public void printIsEven(){
        if(this.number%2==0){
            System.out.println(this.number + " is an even number");
        } else System.out.println(this.number + " is an odd number");
    }
}
