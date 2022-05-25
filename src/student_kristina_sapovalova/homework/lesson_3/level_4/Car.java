package student_kristina_sapovalova.homework.lesson_3.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Car {

    String model;

    public Car(String newModel) {

        this.model = newModel;
    }

    String getModel() {

        return this.model;
    }
}

/* Найти ошибку в коде.
Исправить и запустить программу.
Менять можно только класс Car.

class Car {

    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel {
        return this.model
    }

} */
