package student_toomas_park.lesson_10.homework.level_1;

public class Safe2 {
    private String password = "LolSec";
    private int amount = 100;

    int getAmount(String password) {
        if (this.password == password) {
            return amount;
        }
        return 0;
    }
    int putAmount(String password, int amount) {
        if (this.password == password) {
            this.amount += amount;
            return this.amount;
        }
        return 0;
    }
}
