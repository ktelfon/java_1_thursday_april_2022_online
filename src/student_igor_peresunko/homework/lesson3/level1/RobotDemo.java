package student_igor_peresunko.homework.lesson3.level1;

public class RobotDemo {
    public static void main(String[] args){
        Robot robot = new Robot();
        robot.sayHello("Hello");
        System.out.println(robot.getHello());
        robot.sayYourName("my name is ROBO!");
        System.out.println(robot.getName());

        Robot robot1 = new Robot();
        robot1.sayHello("Hello");
        robot1.sayYourName("my name is BB8");
        System.out.println(robot1.getHello());
        System.out.println(robot1.getName());

        Robot robot2 = new Robot();
        robot2.sayHello("Hello my master");
        robot2.sayYourName("my name is C3PO");
        System.out.println(robot2.getHello());
        System.out.println(robot2.getName());











    }
}
