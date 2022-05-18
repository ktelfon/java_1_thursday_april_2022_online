package student_Vladislavs_Solims.class_exersizes.lesson1.lesson3;

public class Car {

    private String brand;
    private int distance;
    private boolean working = true;

    public void changeBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void drive(int distance) {
        this.distance += distance;
    }

    public int getDistance() {
        return distance;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }


}




