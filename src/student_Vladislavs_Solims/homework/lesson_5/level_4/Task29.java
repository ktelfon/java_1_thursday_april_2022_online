package student_Vladislavs_Solims.homework.lesson_5.level_4;

import teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;

@CodeReview(approved = true)
public class Task29 {

    /*  Напишите программу, в которой:
              - создайте массив произвольной длины
  - заполните массив случайными числами
  - распечатайте на консоль все элементы массива
  - найдите все чётные числа в массиве и выведети их на консоль.*/
    public static void main(String[] args) {
Random random = new Random();
int[] ar = new int[5];
        for (int i = 0; i < ar.length; i++) {
            ar[i]= random.nextInt(1,100);
        }
        System.out.println(Arrays.toString(ar));
        int evenNumbers = ar[0];
        for(int j : ar){
            if(j % 2 == 0){
                evenNumbers = j;
                System.out.println("Even numbers :" + evenNumbers);
            }
        }
    }
}

