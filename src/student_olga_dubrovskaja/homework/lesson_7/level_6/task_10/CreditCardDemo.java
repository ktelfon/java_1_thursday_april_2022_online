package student_olga_dubrovskaja.homework.lesson_7.level_6.task_10;

class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard myCard = new CreditCard("111 1212 1690 9860", 1223);
        myCard.setCreditLimit(1000);
        myCard.printCreditCardInfo();
        myCard.withdraw();
        myCard.deposit();
        myCard.printCreditCardInfo();

    }
}
