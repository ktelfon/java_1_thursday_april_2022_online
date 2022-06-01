package student_olegs_liliks.homework.lesson_3.level_7.task_32;


    class BankAccount {

        String owner;
        int money;

        BankAccount(String moneyOwner, int moneyAmount) {
            this.owner = moneyOwner;
            this.money = moneyAmount;
        }

        String getOwner() {
            return this.owner;
        }

        String getMoney() {
            return String.valueOf(this.money);
        }

    }

