package student_toomas_park.lesson_7.homework.level_6;


import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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