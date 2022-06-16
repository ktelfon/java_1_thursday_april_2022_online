package student_olga_dubrovskaja.homework.lesson_9.level_4.task_14_to_task_19;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculateCircumference();

}