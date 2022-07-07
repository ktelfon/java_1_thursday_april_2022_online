package student_igor_peresunko.vet;

import java.util.Scanner;

public class VetClinicDemo {

    final static String MENU = " Enter : (register(1)) (show_patients(2)) (discharge(3)) (quit(4))";

    public static void main(String[] args) {
        addSameCatToClinicTest();
        addCatOrDogToClinicTest();
        VetClinic clinic = new VetClinic();

        System.out.println("Hello!");

        Scanner scr = new Scanner(System.in);
        int input = getUserNumberInput(MENU, scr);
        while (4 != input) {
            switch (input) {
                case 1:
                    String catName = getUserTextInput("Enter pets name:", scr);
                    int age = getUserNumberInput("Enter pets age:", scr);
                    clinic.receiveAPatient(new Cat(catName , age));
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

    private static String getUserTextInput (String displayText , Scanner scr){
        System.out.println(displayText);
        String input = scr.next();
        return input;
    }

    public static int getUserNumberInput (String displayText , Scanner scr){
        System.out.println(displayText);
        int input = scr.nextInt();
        return input;
    }

    public static void addSameCatToClinicTest() {
        VetClinic clinic = new VetClinic();
        Cat cat = new Cat("Cezar", 12);
        clinic.receiveAPatient(cat);
        clinic.receiveAPatient(cat);
        if (clinic.patientCount() == 1) {
            System.out.println("addSameCatToClinicTest PASS");
        } else {
            System.out.println("addSameCatToClinicTest FAIL");
        }
    }


    public static void addCatOrDogToClinicTest() {
        VetClinic clinic = new VetClinic();
        Cat cat = new Cat("Cezar", 12);
        Dog dog = new Dog("Bobik", 12);
        clinic.receiveAPatient(dog);
        clinic.receiveAPatient(cat);
        if (clinic.patientCount() == 2) {
            System.out.println("addCatOrDogToClinicTest PASS");
        } else {
            System.out.println("addCatOrDogToClinicTest FAIL");
        }
    }








}














