package student_kristina_sapovalova.homework.lesson_3.level_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RobotDemo {

    public static void main(String[] args) {

        Robot r1 = new Robot();
        r1.SayHello();
        r1.sayYourName();

        Robot r2 = new Robot();
        r2.SayHello();
        r2.sayYourName();

        Robot r3 = new Robot();
        r3.SayHello();
        r3.sayYourName();

        Robot r4 = new Robot();
        r4.SayHello();
        r4.sayYourName();
    }

}


/* Task_3: Создайте отдельный класс RobotDemo для демонстрации
работы с классом Robot.

Внутри класса RobotDemo создайте метод

    public static void main(String[] args) {
        // создайте экземпляр класса Robot вызвав конструктор класса
        // сохраните ссылку (указатель) на только, что созданный
        // виртуальный обьект класса Robot в переменную,
        // она нам понадобиться для дальнейшего использования.
    } */

/* Task_4: В методе main(...) класса RobotDemo вызовите
метод sayHello() у созданного ранее виртуального обьекта.
Запустите вашу программу и убедитесь, что созданный вами
виртуальный обьект робот напечатал на консоли слово "Hello!". */

/* Task_5: В методе main(...) класса RobotDemo вызовите
метод sayYourName() у созданного ранее виртуального обьекта.
Запустите вашу программу и убедитесь, что созданный вами
виртуальный обьект робот напечатал на консоли "My name is ROBO". */

/* Task_6: Создаём свою армию роботов!

В этом задании мы продолжаем работать с классом Robot.

В методе main(...) класса RobotDemo продемонстрируйте создание
нескольких виртуальный обьектов робот и работу с ними
(вызовы у них методов sayHello() и sayYourName()).

PS: ваш код внутри main метода будет выглядеть примерно так:

Robot robot1 = new Robot();
robot1.sayHello();
robot1.sayYourName();

Robot robot2 = new Robot();
robot2.sayHello();
robot2.sayYourName();

Класс (Robot) это как чертёж или шаблон, на основе которого
в вашей программе можно создавать сколько угодно виртуальных
обьектов и управлять ими (вызывать у них разные методы). */
