package student_artemijs_talamajevs.lesson_4.level_6;

public class StockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("COMPANY DOES NOT EXISTS", 24);
        String stockInformation = stock.getStockInformation();
        stock.getStockInformation();
        stock.updatePrice(19);
        stock.updatePrice(22);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        System.out.println(stockInformation);
    }
}
