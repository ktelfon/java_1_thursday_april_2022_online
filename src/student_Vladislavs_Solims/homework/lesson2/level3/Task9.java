package student_Vladislavs_Solims.homework.lesson2.level3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Write you number too see multiplication table til 10");

        int userNum = scanner.nextInt();
        int multiplication = 1 ;
        do {
            System.out.println(userNum * multiplication++);
        }while(multiplication<=10);
        System.out.println("Thank you");
        //на это ушло много времени , что бы загуглить и понять как это работает )



        }

    }

