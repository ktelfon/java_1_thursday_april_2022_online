package student_toomas_park.lesson_3.homework.level_7;

class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}
