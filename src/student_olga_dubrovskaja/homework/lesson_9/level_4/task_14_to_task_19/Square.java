package student_olga_dubrovskaja.homework.lesson_9.level_4.task_14_to_task_19;

class Square extends Shape {

    double side;

    Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.round(this.side * this.side * 100.0) / 100.0;
    }

    @Override
    double calculateCircumference() {
        return Math.round(4 * this.side * 100.0) / 100.0;
    }
}
