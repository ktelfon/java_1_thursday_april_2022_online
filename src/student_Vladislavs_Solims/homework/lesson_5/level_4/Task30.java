package student_Vladislavs_Solims.homework.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

public class Task30 {

  /*  Напишите программу, в которой:
            - создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.*/

    public static void main(String[] args) {
        Random random = new Random();
        int[] ar = new int[5];
        for (int i = 0; i < ar.length; i++) {
            ar[i]= random.nextInt(1,100);
        }
        System.out.println(Arrays.toString(ar));
        int oddNumber = ar[0];
        for(int j : ar){
            if(j % 2 != 0){
                oddNumber = j;
                System.out.println("Even numbers :" + oddNumber);
            }
        }
        }
    }

