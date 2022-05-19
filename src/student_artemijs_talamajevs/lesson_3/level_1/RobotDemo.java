package student_artemijs_talamajevs.lesson_3.level_1;

import student_artemijs_talamajevs.lesson_3.level_1.Robot;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.sayHello("Hello!");
        System.out.println(robot.getHello());
        robot.sayYourName("My name is R0B0");
        System.out.println(robot.getName());

        Robot robot2 = new Robot();
        robot2.sayHello("Hello!");
        robot2.sayYourName("My name is Rider");
        System.out.println(robot2.getHello());
        System.out.println(robot2.getName());

        Robot robot3 = new Robot();
        robot3.sayYourName("My name is John");
        robot3.sayHello("Hello !");
        System.out.println(robot3.getHello());
        System.out.println(robot3.getName());

    }
}