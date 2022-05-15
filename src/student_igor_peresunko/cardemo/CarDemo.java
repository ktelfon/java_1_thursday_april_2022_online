package student_igor_peresunko.cardemo;

public class CarDemo {
public static void main(String[] agrs){
    Car myCar = new Car();
    myCar. changeBrand("BMW");
    System.out.println(myCar.getBrand());
    System.out.println(myCar.getDistance());
    myCar.drive(10);
    System.out.println(myCar.getDistance());
}
}
