package student_Vladislavs_Solims.homework.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

public class Task28 {

    /*Напишите программу, в которой:
            - создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.*/

    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = random.nextInt(1,5);
        int[] ar = new int[arraySize];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=random.nextInt(1 , 100);


        }
        System.out.println(Arrays.toString(ar));
        int minNum = ar[0];
        for (int j : ar) {
            if (j < minNum)
                minNum = j;
        }
        System.out.println("Minimum number = " + minNum);

    }


}


