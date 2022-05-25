package student_olga_dubrovskaja.homework.lesson_4.level_6.task17;

class Stock {
    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    Stock(String companyName, int startingPrice){
        this.companyName = companyName;
        this.currentPrice = startingPrice;
        this.minPrice = startingPrice;
        this.maxPrice = startingPrice;
    }

    public void updatePrice(int newPrice){
        this.currentPrice = newPrice;
        if(this.currentPrice > this.maxPrice){
            this.maxPrice = currentPrice;
        } else if (this.currentPrice < this.minPrice) {
            this.minPrice = currentPrice;
        }
    }
    public String getPriceInformation(){
        String priceInformation = "Company = " + companyName + ", Current price = " + currentPrice + " , max price = "+ maxPrice + ", min price = "+ minPrice;
        return priceInformation;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }
}
