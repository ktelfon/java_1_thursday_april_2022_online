package student_Vladislavs_Solims.homework.lesson_3.level_4.task17;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BankAccount {

    String ownerFirstName;
    String OwnerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.OwnerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    String getOwnerLastName() {
        return this.OwnerLastName;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    static class BankAccountDemo {
        public static void main(String[] args) {

            BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
            String ownerFirstwName = bankAccount.getOwnerFirstName();
            String ownerLastName = bankAccount.getOwnerLastName();
            int moneyAmount = bankAccount.getMoneyAmount();
            System.out.println("Owner first name = " + ownerFirstwName);
            System.out.println("Owner last name = " + ownerLastName);
            System.out.println("Money amount = " + moneyAmount);
        }
    }
}
