package student_olegs_liliks.homework.lesson_4.level_6;

public class Stock {
    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    Stock(String companyName, int startPrice){
        this.companyName = companyName;
        this.currentPrice = startPrice;
        this.minPrice= startPrice;
        this.maxPrice = startPrice;

    }
    public void updatePrice(int newPrice){
        this.currentPrice = newPrice;
        if(this.currentPrice>this.maxPrice){
           this.maxPrice=currentPrice;
        }
        else if(this.currentPrice<this.minPrice){
            this.minPrice = currentPrice;
        }


    }
    public String getPriceInformation(){
        String priceInfomation = companyName + " current price: " +currentPrice + " min price " + minPrice + " max price " + maxPrice;
        return priceInfomation;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}
