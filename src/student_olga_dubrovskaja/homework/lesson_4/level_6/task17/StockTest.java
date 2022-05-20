package student_olga_dubrovskaja.homework.lesson_4.level_6.task17;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.maxPrice();
        stockTest.minPrice();
    }

    public void testResult(boolean result, String testName){
        if(result){
            System.out.println(testName + "OK");
        } else {
            System.out.println(testName + "FAIL");
        }
    }

    public Stock updatePriceForTest(){
        Stock stock = new Stock("Test name", 8);
        int[] prices = new int[]{10,12,5,7,99,77};
        for(int i = 0; i< prices.length; i++){
            stock.updatePrice(prices[i]);
        }
        return stock;
    }

    public void maxPrice(){
        Stock stock = updatePriceForTest();
        int expectedValue = 99;
        testResult(expectedValue == stock.getMaxPrice(), "Max price test: ");
    }
    public void minPrice(){
        Stock stock = updatePriceForTest();
        int expectedValue = 5;
        testResult(expectedValue == stock.getMinPrice(), "Min price test: ");
    }

}
