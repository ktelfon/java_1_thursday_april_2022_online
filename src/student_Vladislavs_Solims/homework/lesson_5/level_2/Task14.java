package student_Vladislavs_Solims.homework.lesson_5.level_2;


public class Task14 {
    /*
        Напишите программу, в которой:
                - создайте массив целых чисел длиной 3,
                - заполните каждую ячейку массива случайным числом,
     - посчитайте среднее значение и выведите его на консоль.
    */
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 5;
        numbers[1] = 5;
        numbers[2] =5;
        int aver = (numbers[0] + numbers[1] + numbers[2]) / 3 ;
        System.out.println("Average of all numbers = " + aver);

    }
}
