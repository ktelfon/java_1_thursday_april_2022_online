package student_Vladislavs_Solims.homework.lesson_4.level_6;

public class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.testCurrentPrice();
        stockTest.testMaxPrice();
        stockTest.testMinPrice();

    }

    Stock updatePriceForTest() {
        Stock stock = new Stock("Test", 10);
        int[] prices = new int[]{10, 12, 5, 7, 99, 77};
        for (int i = 0; i < prices.length; i++) {
            stock.updatePrice(prices[i]);
        }
        return stock;
    }

    void testCurrentPrice() {
        Stock stock = updatePriceForTest();
        int expectedValue = 77;
        int result = stock.getCurentPrice();
        if (expectedValue == result) {
            System.out.println("Test Current Price PASSED");
        } else {
            System.out.println("Test Current Price FAILED");
        }
    }

    void testMaxPrice() {
        Stock stock = updatePriceForTest();
        int expectedValue = 99;
        int result = stock.getMaxPrice();
        if (expectedValue == result) {
            System.out.println("Max Price test PASSED");
        } else {
            System.out.println("Max Price test FAILED");
        }
    }

    void testMinPrice() {
        Stock stock = updatePriceForTest();
        int expectectedValue = 5;
        int result = stock.getMinimalPrice();
        if (expectectedValue == result) {
            System.out.println("Min Price test PASSED");
        } else {
            System.out.println("Min Price test FAILED");
        }
    }

}
