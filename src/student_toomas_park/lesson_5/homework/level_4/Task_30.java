package student_toomas_park.lesson_5.homework.level_4;

public class Task_30 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 7;
        numbers[1] = 3;
        numbers[2] = 8;
        numbers[3] = 4;
        numbers[4] = 6;
        System.out.print("Все элементы в массиве : ");
        for(int i = 0; i<numbers.length; i++) {
            System.out.print(" " + numbers[i] + " ");
        }
        System.out.print(" Нечетные числа в массиве : ");
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] % 2 != 0){
                System.out.print(" " + numbers[i] + " ");}
        }
    }
}
