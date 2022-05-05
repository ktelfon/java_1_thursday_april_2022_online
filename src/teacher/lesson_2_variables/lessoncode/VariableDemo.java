package teacher.lesson_2_variables.lessoncode;

import java.util.Random;
import java.util.Scanner;

public class VariableDemo {

    // shortcut      psvm
    public static void main(String[] args) {
        byte numberOfWheels = 4;
        short selfEsteem = -1;

        int studentsGraduated = 1001;
        int newStudents = 10;
        int totalStudentCount = studentsGraduated + newStudents;

        // shortcut    sout
        System.out.println("Total student count: " + totalStudentCount);

        int monthsInAMythicalYear = 136;
        int workingMonth = 13;
        int monthsOff = monthsInAMythicalYear % workingMonth;
        System.out.println(monthsOff);

        long height = 80;
        float pie = 3.14f;
        double weight = 70.5;
        boolean hungry = false;
        char lastLetterOfTheAlphabet = 'Z';


        //System.out.println("hello ");

//        Scanner scar = new Scanner(System.in);
//
//        int firstNumber = scar.nextInt();
//        int b = scar.nextInt();
//        int result = firstNumber + b;
//        System.out.println("Result : " + result + " !");


//       1. The program should create random number generator
//        Random rand = new Random();
//        2. Generate random number within 0 - 100 range inclusive
//        int randomNumberBound = 100;
//        int randomNumber = rand.nextInt( randomNumberBound);
//        3. Print result to the console
//        System.out.println(randomNumber);

        System.out.println("Hello guess a number(0-100): ");
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();
        Random rand = new Random();
        int randomNumber = rand.nextInt(101);
        boolean result = number == randomNumber;
        System.out.println(result);
        System.out.println("Number was : " + randomNumber);
    }

}
