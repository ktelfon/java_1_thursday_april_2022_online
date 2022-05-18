package teacher.lesson_3_oop_first_look.lessoncode;

public class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car();
        Car myCar2 = myCar;
        myCar.changeBrand("AUDI");
        System.out.println(myCar.getBrand());
        System.out.println(myCar.getDistance());
        myCar.drive(10);
        System.out.println(myCar.getDistance());
    }
}
