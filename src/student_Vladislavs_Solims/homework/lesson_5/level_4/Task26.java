package student_Vladislavs_Solims.homework.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task26 {

  /*  Напишите программу, в которой:
            - запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
    */
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Write an arrays size");
      int arraySize = scanner.nextInt();
      int[] ar = new int[arraySize];
      for (int i = 0; i < ar.length ; i++) {
          Random random = new Random();
          ar[i]=random.nextInt(0,100);
      }
      System.out.println(Arrays.toString(ar));

  }



}
