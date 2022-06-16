package teacher.lesson_9_inheritance.lessoncode;

import teacher.lesson_9_inheritance.lessoncode.bicycle.Bicycle;
import teacher.lesson_9_inheritance.lessoncode.bicycle.Drivable;
import teacher.lesson_9_inheritance.lessoncode.bicycle.MountainBicycle;
import teacher.lesson_9_inheritance.lessoncode.shape.Circle;
import teacher.lesson_9_inheritance.lessoncode.shape.Rectangle;
import teacher.lesson_9_inheritance.lessoncode.shape.Shape;

public class PresentaionDemo {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Sparta", 10);
        MountainBicycle mountainBicycle = new MountainBicycle("Trek", 25);
        mountainBicycle.accelerate();
        mountainBicycle.changeGear(2);
        mountainBicycle.drive();
        bicycle.drive();

        bicycle  = mountainBicycle;


        Shape circle = new Circle("RED", 123);
        circle = new Rectangle("BLUE", 12, 12);

        Drivable transport = bicycle;
        transport = mountainBicycle;


        bicycle = (Bicycle) transport;

        System.out.println(bicycle);

    }
}
