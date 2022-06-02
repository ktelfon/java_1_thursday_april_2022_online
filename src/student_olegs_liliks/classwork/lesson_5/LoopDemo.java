package student_olegs_liliks.classwork.lesson_5;

import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("Hello " + i);
            i++;

        }
        int k = 0;
        int l = 0;
        for (int j = 0; j < 5; j++) {
            System.out.println("++ before" + (++k));
            System.out.println("after ++" + (l++));

        }
        Scanner scr = new Scanner(System.in);
        String input = scr.next();
        while (!"exit".equals(input)) {
            System.out.println("if you want to end write exit");
            input = scr.next();
        }

        Scanner scr1 = new Scanner(System.in);
        while (true) {
            System.out.println("if you want to stop say exit");
            System.out.println("Move or Pass");
            String input1 = scr.next();
            if ("exit".equals(input1)) {
                System.out.println("Bye");
                break;
            }

            if ("pass".equals(input1)) {
                continue;
            }
            System.out.println("Nice move");
        }
    }
}


