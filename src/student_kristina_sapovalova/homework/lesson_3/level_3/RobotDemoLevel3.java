package student_kristina_sapovalova.homework.lesson_3.level_3;

public class RobotDemoLevel3 {

    public static void main(String[] args) {

        RobotLevel3 r1 = new RobotLevel3("Rider");
        r1.sayHello();
        r1.sayYourName();

        RobotLevel3 r2 = new RobotLevel3("John");
        r2.sayHello();
        r2.sayYourName();

        RobotLevel3 r3 = new RobotLevel3("May");
        r3.sayHello();
        r3.sayYourName();

        RobotLevel3 r4 = new RobotLevel3("Robo");
        r4.sayHello();
        r4.sayYourName();
    }

}


/* Task_12: В классе RobotDemo передайте в конструктор каждого робота его название:

Robot robot1 = new Robot("Rider"); // пусть этого робота зовут "Rider"
robot1.sayHello();
robot1.sayYourName();

Robot robot2 = new Robot("John"); // а этого робота зовут "John"
robot2.sayHello();
robot2.sayYourName();
    } */
