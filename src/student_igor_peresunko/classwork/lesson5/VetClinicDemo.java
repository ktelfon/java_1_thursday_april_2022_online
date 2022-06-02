package student_igor_peresunko.classwork.lesson5;

import student_igor_peresunko.cardemo.Cat;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class VetClinicDemo {

    final static String menu = "Enter : (register(1)) (Show_patients(2)) (discharge(3)) (quit(4))";

    public static void main(String[] args) {
        VetClinic clinic = new VetClinic();

        System.out.println("Hello");

        Scanner scr = new Scanner(System.in);
        int input = scr.nextInt();
        while (3 != input) {
            switch (input) {

                case 1:
                    System.out.println("Enter pats name: ");
                    String catName = scr.next();
                    System.out.println("Enter pets age: ");
                    int age = scr.nextInt();
                    clinic.receiveCat(new Cat("Cezar", 12));
                    break;
                case 2:
                    clinic.showPatients();
                    break;
                case 3:
                    System.out.println("Enter pats name: ");
                    String catNameToDischarge = scr.next();
                    clinic.dischargeCat(catNameToDischarge);
                    break;
                default:
                    System.out.println("Unknown command");


            }
        }
        //      if ("register".equals(input)){
        //          System.out.println("Enter pats name: ");
        //          String catName = scr.next();
        //          System.out.println("Enter pets age: ");
        //         int age = scr.nextInt();
        //         clinic.receiveCat(new Cat("Cezar",12));
        //   } else if ("show_patients".equals(input)) {
        //     clinic.showPatients();

        //  }else {
        //      System.out.println("Unknown command");
        //  }
        System.out.println(menu);
        input = scr.nextInt();


        System.out.println("Bye");
    }


    // clinic.receiveCat(new Cat("Cezar", 12));
    //clinic.receiveCat(new Cat("Rik", 12));
    //clinic.receiveCat(new Cat("Bob", 12));
    //clinic.receiveCat(new Cat("Dori", 12));
    //clinic.receiveCat(new Cat("Alpha", 12));
    //clinic.receiveCat(new Cat("Leon", 12));

       // clinic.showPatients();
}

