package student_artemijs_talamajevs.lesson_5.level_2;


import java.util.Random;

public class Task_15 {
    public static void main(String[] args) {

        int[] array = new int[3];
        Random random = new Random();

        array[0] = random.nextInt(50);
        array[1] = random.nextInt(50);
        array[2] = random.nextInt(50);

        System.out.println("First number of array: " + array[0]);
        System.out.println("Second number of array: " + array[1]);
        System.out.println("Third number of array: " + array[2]);

        array[0] += 2;
        array[1] += 2;
        array[2] += 2;
        System.out.println();
        System.out.println("First number of array after increasing x2: " + array[0]);
        System.out.println("Second number of array after incresing x2: " + array[1]);
        System.out.println("Third number of array afer increasing x2: " + array[2]);


    }
}
