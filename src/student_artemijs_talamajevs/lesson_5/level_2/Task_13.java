package student_artemijs_talamajevs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;


public class Task_13 {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[3];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            sum += array[i];
        }
        System.out.println("Arrays sum will be :"  +sum);
    }
}
