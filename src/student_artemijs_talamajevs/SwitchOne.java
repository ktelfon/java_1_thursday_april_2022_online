package student_artemijs_talamajevs;

import java.util.Scanner;

public class SwitchOne {

        public static void main(String[] args) {

            System.out.println("Your favorite colour is :");
            Scanner scanner=new Scanner(System.in);
            int color= scanner.nextByte();


            switch (color) {
                case 1:
                    System.out.println("U are kinds!");
                    break;
                case 2:
                    System.out.println("Your amazing!");
                    System.out.println("Nice smile");
                    break;
                    case 3:
                    System.out.println("Your good!");
                    break;
                case 4:
                    System.out.println("You have nice smile!");
                    break;
                case 5:
                    System.out.println("U are independ!");
                    break;

            }

        }
    }
