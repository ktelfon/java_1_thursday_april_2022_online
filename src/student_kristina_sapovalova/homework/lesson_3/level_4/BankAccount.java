package student_kristina_sapovalova.homework.lesson_3.level_4;

public class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    public BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {

        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {

        return this.ownerFirstName;
    }

    String getOwnerLastName() {

        return this.ownerLastName;
    }

    int getMoneyAmount() {

        return this.moneyAmount;
    }
}

/* Task_17:
* Найти ошибку в коде.
Исправить и запустить программу.

class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName,
                String ownerLastName
                int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.money = money;
    }

    String getOwnerFirstName( {
        return this.ownerFirstName
    }

    String getOwnerLastName) {
        return this.ownerFirstName
    }

    void getMoneyAmount() {
        return this.moneyAmount;
    }

} */
