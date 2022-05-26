package student_Vladislavs_Solims.class_exersizes.lesson_3;

import student_Vladislavs_Solims.class_exersizes.lesson_3.Car;

import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Car myCar = new Car();
        myCar.changeBrand(scanner.next());
        System.out.println(myCar.getBrand());
        myCar.drive(scanner.nextInt());
        System.out.println(myCar.getDistance());
        System.out.println(myCar.isWorking());
        //thanks for the lesson


    }
}
