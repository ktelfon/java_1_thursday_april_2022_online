package student_toomas_park.lesson_9.homework.level_4;

public class RectangleTest {
    public static void main(String[] args) {
        AreaTest();
        PerimeterTest();
    }

    private static void AreaTest() {
        System.out.println("Calculated area of the rectangle is : " + new Rectangle("Rectangle", 5, 2).calculateArea());
    }

    private static void PerimeterTest() {
        System.out.println("Calculated perimeter of the rectangle is : " + new Rectangle("Rectangle", 5, 2).calculatePerimeter());
    }
}
