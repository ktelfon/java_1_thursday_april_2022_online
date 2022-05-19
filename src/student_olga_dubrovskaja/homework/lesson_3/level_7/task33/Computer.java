package student_olga_dubrovskaja.homework.lesson_3.level_7.task33;

//        Дописать код программы, что бы она запускалась
//        и выводила на консоль производителя и модель компьютера.
//        Менять можно только класс Computer.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Computer {

    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    String getManufacturer() {
        return this.manufacturer;
    }
    String getModel() {
        return this.model;
    }

}

class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }

}
