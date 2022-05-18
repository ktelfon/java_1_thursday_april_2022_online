package student_olga_dubrovskaja.homework.lesson_3.level_3;

class Robot{
    String name;

    public Robot(String robotName) {

        this.name = robotName;
    }

    public void sayHello() {

        System.out.println("Hello!");
    }

    public void sayYourName() {

        System.out.println("My name is " + this.name);
    }
}

//Дайте роботу имя!
//
//Тема: объявление свойства класса.
//
//Мы можем создать сколько угодно виртуальных обьектов робот.
//Но все они при вызове метода sayYourName() печатают на
//консоль одно и то же: "My name is ROBO". Давайте это исправим!
//Давайте научим наших роботов запоминать своё уникальное имя
//при создании и потом использовать его при вызове команды
//sayYourName().
//
//Добавьте в класс Robot свойство name:
//
//    class Robot {
//
//        // в этом свойстве наш виртуальный обьект робот будет
//        // запоминать своё имя. Мы используем тип String потому
//        // что имя это строка.
//        String name;
//
//        ....
//    }