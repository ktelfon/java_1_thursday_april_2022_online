package teacher.lesson_9_inheritance.lessoncode.shape;

public class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    double area() {
        return height * width;
    }
}
