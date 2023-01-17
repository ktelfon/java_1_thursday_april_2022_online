package student_toomas_park.lesson_9.homework.level_4;

public class TriangleTest {
    public static void main(String[] args) {
        AreaTest();
        PerimeterTest();
    }

    private static void AreaTest() {
        System.out.println("Calculated area of the triangle is : " + new Triangle("Triangle", 4, 3, 6).calculateArea());
    }

    private static void PerimeterTest() {
        System.out.println("Calculated perimeter of the triangle is : " + new Triangle("Triangle", 4, 3, 6).calculatePerimeter());
    }
}
