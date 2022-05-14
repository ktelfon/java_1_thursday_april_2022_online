package student_igor_peresunko.homework.lesson3.level1;
//     Создайте класс робот (Robot).

//        Научите вашего робота "говорить" привет.

//        Создайте в классе Robot метод со следующей сигнатурой:

//public void sayHello() {
// тут напишите команду распечатки на консоли строки "Hello!"


public class Robot {

    private String hello;

    private String name;

    public void sayHello(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public void sayYourName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}


