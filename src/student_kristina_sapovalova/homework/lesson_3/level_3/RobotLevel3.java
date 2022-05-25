package student_kristina_sapovalova.homework.lesson_3.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RobotLevel3 {

    String name;

    public RobotLevel3(String robotName) {

        this.name = robotName;

    }

    public void sayHello() {

        System.out.println("Hello!");

    }

    public void sayYourName() {

        System.out.println("My name is " + this.name);

    }

}


/* Task_11: Дайте роботу имя!

Тема: объявление свойства класса.

Мы можем создать сколько угодно виртуальных обьектов робот.
Но все они при вызове метода sayYourName() печатают на
консоль одно и то же: "My name is ROBO". Давайте это исправим!
Давайте научим наших роботов запоминать своё уникальное имя
при создании и потом использовать его при вызове команды
sayYourName().

Добавьте в класс Robot свойство name:

    class Robot {

        // в этом свойстве наш виртуальный обьект робот будет
        // запоминать своё имя. Мы используем тип String потому
        // что имя это строка.
        String name;

        ....
 Task_12:
        // Это конструктор класса. У этого конструктора один параметр
        // с названием name и типом String. Тоесть при создании робота
        // в его конструктор будут передавать название робота.
        Robot(String robotName) {
            this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
        }

    }

В классе RobotDemo передайте в конструктор каждого робота его название:

Robot robot1 = new Robot("Rider"); // пусть этого робота зовут "Rider"
robot1.sayHello();
robot1.sayYourName();

Robot robot2 = new Robot("John"); // а этого робота зовут "John"
robot2.sayHello();
robot2.sayYourName();
    }

 */