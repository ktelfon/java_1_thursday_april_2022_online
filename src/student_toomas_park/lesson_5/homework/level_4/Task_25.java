package student_toomas_park.lesson_5.homework.level_4;

import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner inSize = new Scanner(System.in);
        System.out.println("Введите ёмкость массива (но не переборщите)");
        int size = inSize.nextInt();
        int[] number = new int[size];

        for (int i = 0; i < size; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите " + i + " число");
            number[i] = in.nextInt();
        }

        System.out.println("Количесвто чисел в массиве " + size);
        for (int i = 0; i < size; i++) {
            System.out.println("Число под индексом " + i + " в массиве имеет значение " + number[i]);
        }
    }
}
