package student_artemijs_talamajevs.lesson_5.level_2;

import java.util.Random;
import java.util.stream.IntStream;

public class Task_14 {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[3];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            sum += array[i];
            IntStream.of(array).average();
        }
        System.out.println("Arrays sum will be :"  +sum);
    }
}

