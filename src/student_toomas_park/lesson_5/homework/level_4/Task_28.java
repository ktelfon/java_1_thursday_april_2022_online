package student_toomas_park.lesson_5.homework.level_4;

public class Task_28 {
    public static void main(String[] args) {
    int[] numbers = new int[5];
    numbers[0] = 7;
    numbers[1] = 3;
    numbers[2] = 8;
    numbers[3] = 4;
    numbers[4] = 6;
    int high = 10; // Для сравнения
    System.out.print("Все элементы в массиве : ");
    for(int i = 0; i<numbers.length; i++){
        System.out.print(" " + numbers[i] + " ");
        if(high>numbers[i]){
            high = numbers[i];}
    }
    System.out.println(" Наибольшее число в массиве " + high);
    }
}
