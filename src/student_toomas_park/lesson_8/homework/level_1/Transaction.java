package student_toomas_park.lesson_8.homework.level_1;

public class Transaction {
    private Trader trader;
    private int amount;

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", amount=" + amount +
                '}';
    }

    public Transaction() {

    }
    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

