package student_olga_dubrovskaja.homework.lesson_4.level_6.task17;

class StockDemo {
    public static void main(String[] args) {
        Stock stock1 = new Stock("CatCompany", 18);
        System.out.println(stock1.getPriceInformation());
        stock1.updatePrice(17);
        System.out.println(stock1.getPriceInformation());
        stock1.updatePrice(100);
        System.out.println(stock1.getPriceInformation());
    }
}
