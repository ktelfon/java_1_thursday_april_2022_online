package student_igor_peresunko.cardemo;

public class Car {

    private String brand ;
    private int distance;
    private boolean workihg = true;


    public void changeBrand(String getBrand) {
        this.brand = brand;
    }


    public void drive(int getDistance) {
        this.distance += distance;
    }

    public boolean isWorkihg() {
        return workihg;
    }

    public void setWorking(boolean working) {
        this.workihg = working;
    }

    public String getBrand(){
        return brand;
    }

    public int getDistance() {
        return distance;
    }


}