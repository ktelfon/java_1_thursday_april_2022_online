package student_olga_dubrovskaja.homework.lesson_9.level_5.task_20_to_task_28;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculateCircumference();

}