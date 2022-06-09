package student_Vladislavs_Solims.class_exersizes.lesson_6;

import student_Vladislavs_Solims.class_exersizes.lesson_4.Cat;
import student_Vladislavs_Solims.class_exersizes.lesson_6.VetClinic;

import java.util.Scanner;

public class VetClinicDemo {

    final static String MENU = "Enter : (register(1)) (show_patiens(2))(discarge(3)) (quit(4))";

    public static void main(String[] args) {
        VetClinic clinic = new VetClinic();

        System.out.println("Hello !");
        System.out.println(MENU);
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (4 != input) {
            switch (input) {
                case 1:
                    System.out.println("Enter pets name :");
                    String catName = scanner.next();
                    System.out.println("Enter cat age");
                    int age = scanner.nextInt();
                    clinic.receveCat(new Cat(catName, age));
                    break;
                case 2:
                    clinic.showPatients();
                    break;
                case 3:
                    System.out.println("Enter pets name :");
                    String catNameToDischarge = scanner.next();
                    clinic.dischargeCat(catNameToDischarge);
                    break;
                default:
                    System.out.println("Unknown command");
            }
            System.out.println(MENU);
            input = scanner.nextInt();
        }
        System.out.println("Bye!");
    }
}


