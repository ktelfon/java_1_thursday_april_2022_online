package student_Vladislavs_Solims.homework.lesson_3.level_7.task_29.task_30;

public class Circle {

    double radius;
    int stepenj = 2;
    double area;


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setArea() {
        this.area = area;
    }

    double getArea() {
        double area = Math.PI * (getRadius() * getRadius());
        return area;
    }
}





