package student_igor_peresunko.classwork.lesson5;

import student_igor_peresunko.cardemo.Cat;

import java.util.Scanner;

public class VetClinicDemo {

    final static String MENU = "Enter : (register(1)) (Show_patients(2)) (discharge(3)) (quit(4))";

    public static void main(String[] args) {
        VetClinic clinic = new VetClinic();

        System.out.println("Hello");

        Scanner scr = new Scanner(System.in);
        int input = getUserNumberInput(MENU, scr);
        while (4 != input) {
            switch (input) {
                case 1:
                    String catName = getUserTextInput("Enter pets name:", scr);
                    int age = getUserNumberInput("Enter pets age:", scr);
                    clinic.receiveCat(new Cat(catName , age));
                    break;
                case 2:
                    clinic.showPatients();
                    break;
                case 3:
                    String catNameToDischarge = getUserTextInput("Enter pets name:", scr);
                    clinic.dischargeCat(catNameToDischarge);
                    break;
                default:
                    System.out.println("Unknown command.");
            }

            input = getUserNumberInput(MENU, scr);
        }
        System.out.println("Bye!");
    }

    private static String getUserTextInput(String displayText, Scanner scr) {
        System.out.println(displayText);
        String input = scr.next();
        return input;
    }

    private static int getUserNumberInput(String displayText, Scanner scr) {
        System.out.println(displayText);
        int input = scr.nextInt();
        return input;
    }

    public static void addSameCatToClinicTest() {
        VetClinic clinic = new VetClinic();
        Cat cat = new Cat("Cezar", 12);
        clinic.receiveCat(cat);
        clinic.receiveCat(cat);
        if (clinic.patientCount() == 1) {
            System.out.println("addSameCatToClinicTest PASS");
        } else {
            System.out.println("addSameCatToClinicTest FAIL");
        }
    }











}













