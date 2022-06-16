package student_olga_dubrovskaja.homework.lesson_9.level_4.task_14_to_task_19;

class Triangle extends Shape {
    double base;

    Triangle(double base) {
        super("Triangle");
        this.base = base;
    }

    double calculateHeight() {
        return Math.round((base * Math.sqrt(3) / 2) * 100.0) / 100.0;
    }

    @Override
    double calculateArea() {
        return Math.round(0.5 * base * calculateHeight() * 100.0) / 100.0;
    }

    @Override
    double calculateCircumference() {
        return Math.round(3 * base * 100.0) / 100.0;
    }
}
