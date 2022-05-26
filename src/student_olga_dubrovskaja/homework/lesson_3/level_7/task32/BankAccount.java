package student_olga_dubrovskaja.homework.lesson_3.level_7.task32;

//    Найти логическую ошибку в коде.
//            Исправить и запустить программу так, что бы она выводила
//            на консоль владельца банковского счёта и количество денег.
//            Менять можно только класс BankAccount.

class BankAccount {
    String owner;
    int money;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    String getMoney() {
        return String.valueOf(this.money);
    }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        String moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }

}
