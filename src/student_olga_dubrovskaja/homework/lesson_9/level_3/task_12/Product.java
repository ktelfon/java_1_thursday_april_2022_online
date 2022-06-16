package student_olga_dubrovskaja.homework.lesson_9.level_3.task_12;

abstract class Product {
    protected String name;
    protected float price;
    protected boolean discounted;


    Product(String name, float price, boolean isDiscounted){
        this.name = name;
        this.price = price;
        this.discounted = isDiscounted;
    }
}
