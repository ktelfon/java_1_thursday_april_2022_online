package student_olga_dubrovskaja.homework.lesson_9.level_5.task_20_to_task_28;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateCircumference() {
        return Math.round(2 * Math.PI * this.radius * 100.0) / 100.0;
    }

    @Override
    double calculateArea() {
        return Math.round(Math.PI * this.radius * this.radius * 100.0) / 100.0;
    }

}