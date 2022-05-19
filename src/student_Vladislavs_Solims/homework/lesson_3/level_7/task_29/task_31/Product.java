package student_Vladislavs_Solims.homework.lesson_3.level_7.task_29.task_31;

public class Product {
    String name;
    double regularPrice;
    double discount;
    double actionPrice;

    public void addProduct(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public double getActionPrice() {
        actionPrice = regularPrice - (regularPrice * discount / 100);
        return actionPrice;
    }
}
