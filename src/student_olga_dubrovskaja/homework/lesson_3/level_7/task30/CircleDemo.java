package student_olga_dubrovskaja.homework.lesson_3.level_7.task30;

class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.showArea();
        circle1.setRadius(12.0);
        circle1.showArea();

        Circle circle2 = new Circle(7.5);
        circle2.showArea();
    }
}
