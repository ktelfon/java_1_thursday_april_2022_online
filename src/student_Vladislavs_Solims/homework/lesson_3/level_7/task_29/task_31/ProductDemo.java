package student_Vladislavs_Solims.homework.lesson_3.level_7.task_29.task_31;

import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a product name :");
        product.addProduct(scanner.next());
        System.out.println("Write a regular price:");
        product.setRegularPrice(scanner.nextDouble());
        System.out.println("Write a discount % :");
        product.setDiscount(scanner.nextDouble());
        System.out.println("Your price-" + product.getActionPrice());

    }
}
