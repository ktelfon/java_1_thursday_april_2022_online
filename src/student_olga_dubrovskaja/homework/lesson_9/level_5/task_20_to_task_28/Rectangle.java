package student_olga_dubrovskaja.homework.lesson_9.level_5.task_20_to_task_28;

class Rectangle extends Shape {
    double sideA;
    double sideB;

    Rectangle(double sideA, double sideB) {
        super("Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateCircumference() {
        return Math.round(2 * (sideA + sideB) * 100.0) / 100.0;
    }

    @Override
    double calculateArea() {
        return Math.round(sideA * sideB * 100.0) / 100.0;
    }
}
