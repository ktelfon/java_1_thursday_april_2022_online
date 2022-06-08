package student_artemijs_talamajevs.lesson_4.level_6;


class Stock {
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }


    void updatePrice(int price) {
        this.currentPrice = price;
        if (price >= maxPrice) {
            this.maxPrice = price;

        } else if (price <= minPrice) {
            this.minPrice = price;
        }
    }

    String getStockInformation() {
        return "Company = " + companyName +
                ", current price = " + currentPrice +
                ", min price = " + minPrice +
                ", max price = " + maxPrice;
    }

}