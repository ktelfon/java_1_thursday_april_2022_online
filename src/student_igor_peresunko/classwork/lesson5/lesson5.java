package student_igor_peresunko.classwork.lesson5;

import java.util.Scanner;

public class lesson5 {

    public static void main(String[] agrs){

        int i = 0;
        while (i<5){
            System.out.println("Hello for ever"+ i);
            i++;
        }


        int k = 0;
        int l = 0;

        for(int j = 0; j < 3; j++) {
            System.out.println("++ before result -->" + (++k));
            System.out.println("after result ++ --->" + (l++));
        }

        System.out.println("++ before result -->" + k);
        System.out.println("after result ++ --->" + l);

        Scanner scr = new Scanner(System.in);
        while(true){
            System.out.println("if you want to stop this say exit ");
            System.out.println("Move or Pass");
            String input = scr.next();
            if ("exit".equals(input)){
                System.out.println("Bye!");
                break;
            }
            if ("pass".equals(input)){
                System.out.println("Nice move!");
                continue;}

        }














    }

}
