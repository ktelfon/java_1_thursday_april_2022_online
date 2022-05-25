package student_olga_dubrovskaja.homework.lesson_4.level_1.task3;

// Написать программу, которая запрашивает у пользователя
//целое число от 1 до 7 и выводит на консоль соотметствующий
//этому числу день недели.
//
//Пример:
//Ввод: 3
//Вывод: Wednesday
//
//Ввод: 5
//Вывод: Friday

import java.util.Scanner;

class Week {
    private int dayNumber;

    public Week(){
        this.dayNumber=0;
    }

    public void setDayNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            System.out.print("Insert a number 1-7, or 0 to exit: ");
            int userNumber = scanner.nextInt();
            if (userNumber > 0 && userNumber < 8) {
                this.dayNumber = userNumber;
                isTrue=false;
            } else if(userNumber == 0) {
                System.out.println("Good bye!");
                isTrue = false;
            } else {
                System.out.println("This is an invalid number, try again!");
            }
        }
    }

    public void numberToDay (){
        switch (this.dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid user input");
        }
    }
}
