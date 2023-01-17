package student_toomas_park.lesson_10.homework.level_1;

public class Safe2Demo {
    public static void main(String[] args) {
        Safe2 safe = new Safe2();
        System.out.println("Get amount with wrong password : " + safe.getAmount("wrong"));
        System.out.println("Get amount with right password : " + safe.getAmount("LolSec"));
        System.out.println("Put 200 amount with wrong password result: " + safe.putAmount("wrong", 200));
        System.out.println("Put 200 amount with right password result: " + safe.putAmount("LolSec", 200));
    }
}
