package student_olegs_liliks.homework.lesson_4.level_6;

public class StockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("Adidas", 30);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(50);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(4);
        System.out.println(stock.getPriceInformation());
    }
}
