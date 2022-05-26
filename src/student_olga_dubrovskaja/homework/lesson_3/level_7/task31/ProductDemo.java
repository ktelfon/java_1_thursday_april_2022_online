package student_olga_dubrovskaja.homework.lesson_3.level_7.task31;

class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Pants");
        product1.setRegularPrice(100);
        product1.setDiscount(20);
        product1.printInformation();

        Product product2 = new Product("Shirt");
        product2.setRegularPrice(20);
        product2.setDiscount(10);
        product2.printInformation();
    }
}
