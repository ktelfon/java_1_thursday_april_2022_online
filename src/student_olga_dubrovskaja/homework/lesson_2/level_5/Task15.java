package student_olga_dubrovskaja.homework.lesson_2.level_5;

import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        Random random = new Random();
        int count;
        System.out.print("Some random numbers in this line: ");
        for (count=0; count < max; count++){
            int randomNumber = random.nextInt(min,max);
            System.out.print( randomNumber + " ");

        }
    }


}




//Команда System.out.println("text"); выводит указанный "text"
//на консоль, и переводит курсор на новую строку.
//
//Для того, что бы выводить текст на консоль без перевода курсора на
//новую строку можно воспользоваться командой
//    System.out.print("text");
//эта команда распечатает текст на консоль и оставит курсор в той же строке.
//
//Напишите программу, которая демонстрирует использование команды
//    System.out.print("text");