package student_artemijs_talamajevs;

public class Car {
    //brand
    //distance
    //off/on


    private  String brand;
    private int distance;
    private  boolean working;

    //methods

    public void changeBrand(String brand){
        this.brand=brand;

    }
    public void drive(int distance){
        this.distance+=distance;
    }
    public boolean isWorking(){
        return  working;
    }
    public void setWorking(boolean working) {
        this.working = working;
    }
    //change brand
    //drive input km to drive and increase distance
    //turn car on/off

    //Getters
    public String getBrand(){
        return brand;
    }

    public int getDistance(){
        return  distance;
    }
}
