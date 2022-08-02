package student_Vladislavs_Solims.class_exersizes.lesson_15.training;

import java.util.function.Predicate;

public class Product {
    private String category;
    private double price;

    public Product(String category, double price) {
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
