package student_artemijs_talamajevs.lesson_5.level_2;


import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write down Arrays length");
        int size= scanner.nextInt();
        int[] arraysRnadom=new int[size];
        for (int i = 0; i <arraysRnadom.length ; i++) {
            arraysRnadom[i]=(int) (Math.random() *size);
            System.out.println("Rnadom arrays elemnts is" +arraysRnadom[i]);


        }

    }
}
