package student_artemijs_talamajevs.lesson_4.level_6;

public class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.stockTest1();
        stockTest.stockTest2();
    }


    void stockTest1() {
        Stock stock = new Stock("IOS", 18);
        stock.updatePrice(12);
        stock.updatePrice(13);
        stock.updatePrice(10);
        String actualResult = stock.getStockInformation();
        String expectedResult = "Company = IOS price is 10.min price = 13and max price = 18";
        if (actualResult.equals(expectedResult)) {
            System.out.println("1[OK]");
        } else {
            System.out.println("1[FAULT]");
        }
    }


    void stockTest2() {
        Stock stock = new Stock("Google", 15);
        stock.updatePrice(14);
        stock.updatePrice(42);
        stock.updatePrice(4);
        String actualResult = stock.getStockInformation();
        String expectedResult = "Company = Google prices is 4, min price =14, max price =is42";
        if (actualResult.equals(expectedResult)) {
            System.out.println("2[OK]");
        } else {
            System.out.println("2[FAULTY]");
        }
    }
}



