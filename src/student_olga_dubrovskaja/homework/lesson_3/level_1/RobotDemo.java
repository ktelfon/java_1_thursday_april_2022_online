package student_olga_dubrovskaja.homework.lesson_3.level_1;

class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName();
        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();
        Robot robot3 = new Robot();
        robot3.sayHello();
        robot3.sayYourName();
    }
}


//task2Создайте отдельный класс RobotDemo для демонстрации
//работы с классом Robot.
//
//Внутри класса RobotDemo создайте метод
//
//    public static void main(String[] args) {
//        // создайте экземпляр класса Robot вызвав конструктор класса
//        // сохраните ссылку (указатель) на только, что созданный
//        // виртуальный обьект класса Robot в переменную,
//        // она нам понадобиться для дальнейшего использования.
//    }
// В методе main(...) класса RobotDemo вызовите
//метод sayHello() у созданного ранее виртуального обьекта.
//Запустите вашу программу и убедитесь, что созданный вами
//виртуальный обьект робот напечатал на консоли слово "Hello!".