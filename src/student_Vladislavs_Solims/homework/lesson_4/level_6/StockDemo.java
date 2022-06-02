package student_Vladislavs_Solims.homework.lesson_4.level_6;

public class StockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("VS_Programming", 25);
        stock.updatePrice(30);
        stock.updatePrice(10);
        stock.updatePrice(2);
        stock.updatePrice(21);
        System.out.println(stock.getInformation());
    }
}
