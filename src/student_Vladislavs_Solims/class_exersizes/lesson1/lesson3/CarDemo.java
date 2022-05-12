package student_Vladislavs_Solims.class_exersizes.lesson1.lesson3;

public class CarDemo {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.changeBrand("Audi");
        System.out.println(myCar.getBrand());
        myCar.drive(20);
        System.out.println(myCar.getDistance());
        System.out.println(myCar.isWorking());


    }
}
