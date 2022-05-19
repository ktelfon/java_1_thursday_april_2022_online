package student_olga_dubrovskaja.homework.lesson_3.level_7.task30;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle {
    private double radius;
    Circle() {
        this.radius=1;
        }
    Circle(double radius) {
        this.radius=radius;
        }
    double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    void showArea() {
            System.out.println("Area of this circle is " + this.calculateArea());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
