package student_artemijs_talamajevs.lesson_3.level_4;


class Car {

    String model;

    Car(String model) {
        this.model = model;
    }

    String getModel() {
        return this.model;
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}

