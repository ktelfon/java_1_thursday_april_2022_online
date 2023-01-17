package student_toomas_park.lesson_9.homework.level_4;

public class SquareTest {
    public static void main(String[] args) {
        AreaTest();
        PerimeterTest();
    }


    private static void AreaTest() {
        System.out.println("Calculated area of the square is : " + new Square("Square", 5).calculateArea());
    }

    private static void PerimeterTest() {
        System.out.println("Calculated perimeter of the square is : " + new Square("Square", 5).calculatePerimeter());
    }
}
