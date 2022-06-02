package teacher.lesson_5_arrays_for_loop.lessoncode;

import teacher.lesson_4_if_statement.lessoncode.Cat;

import java.util.Scanner;

public class VetClinicDemo {

    final static String MENU = " Enter : (register(1)) (show_patients(2)) (discharge(3)) (quit(4))";

    public static void main(String[] args) {
        VetClinic clinic = new VetClinic();

        System.out.println("Hello!");

        System.out.println(MENU);
        Scanner scr = new Scanner(System.in);
        int input = scr.nextInt();
        while (4 != input) {
            switch (input) {
                case 1:
                    System.out.println("Enter pets name:");
                    String catName = scr.next();
                    System.out.println("Enter pets age:");
                    int age = scr.nextInt();
                    clinic.receiveCat(new Cat(catName, age));
                    break;
                case 2:
                    clinic.showPatients();
                    break;
                case 3:
                    System.out.println("Enter pets name:");
                    String catNameToDischarge = scr.next();
                    clinic.dischargeCat(catNameToDischarge);
                    break;
                default:
                    System.out.println("Unknown command.");
            }


//            if ("register".equals(input)) {
//                System.out.println("Enter pets name:");
//                String catName = scr.next();
//                System.out.println("Enter pets age:");
//                int age = scr.nextInt();
//                clinic.receiveCat(new Cat(catName, age));
//            } else if ("show_patients".equals(input)) {
//                clinic.showPatients();
//            } else {
//                System.out.println("Unknown command.");
//            }
            System.out.println(MENU);
            input = scr.nextInt();
        }
        System.out.println("Bye!");
    }
}
