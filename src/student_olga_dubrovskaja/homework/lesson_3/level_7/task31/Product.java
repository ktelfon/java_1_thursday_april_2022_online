package student_olga_dubrovskaja.homework.lesson_3.level_7.task31;

class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name=name;
    }
    double actualPrice() {
        return this.regularPrice - this.regularPrice* this.discount/100;
    }

    void printInformation() {
        System.out.println( this.name +" price: " + this.regularPrice + "€");
        System.out.println("Discount " + this.discount + "%" );
        System.out.println("Final price: " + this.actualPrice() + "€");
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
