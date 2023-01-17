package student_toomas_park.lesson_9.homework.level_4;

import static java.lang.Double.NaN;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    Triangle (String title, double sideA, double sideB, double sideC) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    double calculateArea() {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            double s = (sideA + sideB + sideC) / 2;
            return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        }
        return NaN;

    }
    double calculatePerimeter() {
        return sideA + sideB + sideC ;
    }
}
