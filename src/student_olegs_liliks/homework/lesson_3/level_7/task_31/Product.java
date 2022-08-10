package student_olegs_liliks.homework.lesson_3.level_7.task_31;

public class Product {
    String name;
    double regularPrice;
    double discount;

Product(String name) {
    this.name = name;
}



    double actualPrice() {
    double discountPrice = regularPrice - regularPrice*(discount/100);
        return discountPrice;
    }
    void printInformation(){
        System.out.println("New hotdog price is " + actualPrice());

    }
    public String getName() {
        return name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }



}
