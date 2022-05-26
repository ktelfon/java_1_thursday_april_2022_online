package student_kristina_sapovalova.homework.lesson_2.task_15;

/* Команда System.out.println("text"); выводит указанный "text"
на консоль, и переводит курсор на новую строку.

Для того, что бы выводить текст на консоль без перевода курсора на
новую строку можно воспользоваться командой
    System.out.print("text");
эта команда распечатает текст на консоль и оставит курсор в той же строке.

Напишите программу, которая демонстрирует использование команды
    System.out.print("text"); */

public class Task_15 {
    public static void main(String[] args) {

        int a = 74;
        int b = 36;
        int res = a + b;

        int c = 50;
        int d = 3;
        int div = c / d;

        System.out.print("Sum result: " + res + ", Division result: " + div);
    }
}
