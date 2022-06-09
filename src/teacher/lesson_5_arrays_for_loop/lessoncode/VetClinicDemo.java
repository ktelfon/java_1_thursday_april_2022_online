package teacher.lesson_5_arrays_for_loop.lessoncode;

import teacher.lesson_4_if_statement.lessoncode.Cat;

import java.util.Scanner;

public class VetClinicDemo {

    final static String MENU = " Enter : (register(1)) (show_patients(2)) (discharge(3)) (quit(4))";

    public static void main(String[] args) {
        addSameCatToClinicTest();
        VetClinic clinic = new VetClinic();

        System.out.println("Hello!");

        System.out.println(MENU);
        Scanner scr = new Scanner(System.in);
        int input = scr.nextInt();
        while (4 != input) {
            switch (input) {
                case 1:
                    String catName = getUserTextInput("Enter pets name:", scr);
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

            System.out.println(MENU);
            input = scr.nextInt();
        }
        System.out.println("Bye!");
    }

    private static String getUserTextInput(String displayText, Scanner scr) {
        System.out.println(displayText);
        String catName = scr.next();
        return catName;
    }

    public static void addSameCatToClinicTest() {
        VetClinic clinic = new VetClinic();
        Cat cat = new Cat("Murzik", 12);
        clinic.receiveCat(cat);
        clinic.receiveCat(cat);
        if (clinic.patientCount() == 1) {
            System.out.println("addSameCatToClinicTest PASS");
        } else {
            System.out.println("addSameCatToClinicTest FAIL");
        }
    }


}
