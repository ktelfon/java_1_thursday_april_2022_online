package student_Vladislavs_Solims.homework.lesson_4.level_6;

public class Stock {

    String name;
    int curentPrice;
    int minimalPrice;
    int maxPrice;

    Stock(String name, int curentPrice) {
        this.name = name;
        this.curentPrice = curentPrice;
        this.minimalPrice = curentPrice;
        this.maxPrice = curentPrice;
    }

    void updatePrice(int newPrice) {
        this.curentPrice = newPrice;
        if (this.curentPrice > this.maxPrice) {
            this.maxPrice = curentPrice;
        } else if (this.curentPrice < minimalPrice) {
            this.minimalPrice = curentPrice;
        }
    }

    String getInformation() {
        String priceInformation = "Name of company " + name + ", Curent Price - " + curentPrice + ", minimal price = " + minimalPrice + " maximal price = " + maxPrice;
        return priceInformation;
    }

    int getCurentPrice() {
        return curentPrice;
    }

    int getMaxPrice() {
        return maxPrice;
    }

    public int getMinimalPrice() {
        return minimalPrice;
    }
}
