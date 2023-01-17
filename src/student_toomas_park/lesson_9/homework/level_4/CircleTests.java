package student_toomas_park.lesson_9.homework.level_4;

public class CircleTests {

    public static void main(String[] args) {
        AreaTest();
        PerimeterTest();
    }


    private static void AreaTest() {
        System.out.println("Calculated area of the circle is : " + new Circle("Circle", 5).calculateArea());
    }

    private static void PerimeterTest() {
        System.out.println("Calculated perimeter of circle is : " + new Circle("Circle", 5).calculatePerimeter());
    }

}
