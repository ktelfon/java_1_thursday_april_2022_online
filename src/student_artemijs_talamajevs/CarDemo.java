package student_artemijs_talamajevs;

public class CarDemo {
    public static void main(String[] args) {
     Car myCar=new Car();
     myCar.changeBrand("Audi");
        System.out.println(myCar.getBrand());
        System.out.println(myCar.getDistance());
        myCar.drive(10);
        System.out.println(myCar.getDistance());
        System.out.println(myCar.isWorking());

    }

}
