package teacher.lesson_3_oop_first_look.lessoncode;

public class Car {

    private String brand;
    private int distance;
    private boolean working = true;

    public Car() {
        this.brand = "WV";
    }

    //methods

    public void changeBrand(String brand){
        this.brand = brand;
    }

    public void drive(int distance){
        this.distance += distance;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public String getBrand(){
        return brand;
    }

    public int getDistance() {
        return distance;
    }
}
