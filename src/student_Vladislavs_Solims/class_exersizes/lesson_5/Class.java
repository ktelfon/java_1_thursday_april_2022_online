package student_Vladislavs_Solims.class_exersizes.lesson_5;

import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("Hello for " + i);
            i++;
        }

        int k = 0;
        int l = 0;
        for (int j = 0; j < 3; j++) {
            System.out.println("++ before" + (++k));
            System.out.println("after++" + (l++));

        }


        Scanner scr = new Scanner(System.in);
        while (true) {
            System.out.println("If you want to stop this , say exit");
            System.out.println("Move or Pass");
            String input = scr.next();
            if ("exit".equals(input)) {
                System.out.println("Bye!");
                break;
            }
            if("pass".equals(input)){
                continue;
            }
            System.out.println("Nice move!");
        }


    }


}
