package student_Vladislavs_Solims.homework.lesson3.level1;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.sayHello("Hello!");
        System.out.println(robot.getHello());
        robot.sayYourName("My name is R0B0");
        System.out.println(robot.getName());

        Robot robot2 = new Robot();
        robot2.sayHello("Hello!");
        robot2.sayYourName("My name is R2D2");
        System.out.println(robot2.getHello());
        System.out.println(robot2.getName());

        Robot robot3 = new Robot();
        robot3.sayYourName("My name is S4D9");
        robot3.sayHello("Hello !");
        System.out.println(robot3.getHello());
        System.out.println(robot3.getName());

    }
}
