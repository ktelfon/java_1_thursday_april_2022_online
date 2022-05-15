package student_igor_peresunko.homework.lesson3.level3;

import student_igor_peresunko.homework.lesson3.level1.Robot;

public class RobotDemo {
    public static void main(String[] args){
        student_igor_peresunko.homework.lesson3.level1.Robot robot = new student_igor_peresunko.homework.lesson3.level1.Robot();
        robot.sayHello("Hello");
        System.out.println(robot.getHello());
        robot.sayYourName("my name is ROBO!");
        System.out.println(robot.getName());

        student_igor_peresunko.homework.lesson3.level1.Robot robot1 = new student_igor_peresunko.homework.lesson3.level1.Robot();
        robot1.sayHello("Hello");
        robot1.sayYourName("my name is BB8");
        System.out.println(robot1.getHello());
        System.out.println(robot1.getName());

        student_igor_peresunko.homework.lesson3.level1.Robot robot2 = new Robot();
        robot2.sayHello("Hello my master");
        robot2.sayYourName("my name is C3PO");
        System.out.println(robot2.getHello());
        System.out.println(robot2.getName());











    }
}
