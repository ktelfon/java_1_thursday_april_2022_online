package student_Vladislavs_Solims.homework.lesson_9.level_4_and_5;

public class Tests {
    public static void main(String[] args) {
        Tests tests = new Tests();
        tests.circlePerimetr();
        tests.circleArea();
        tests.trianglePerimetrTest();
        tests.triangleAreaTest();
        tests.squarePerimetrTest();
        tests.squareAreatest();
        tests.rectanglePerimetrTest();
        tests.rectangleAreaTest();



    }

    public void circlePerimetr() {
        int radius = 5;
        double expectedResult = 31.0;
        Circle circle = new Circle(radius);
        double result = circle.calculaatePerimetr();
        checkResults(circle.calculaatePerimetr() == expectedResult, "Circle Perimetr test : ");

    }

    public void circleArea() {
        int radius = 5;
        double expectedResult = 79;
        Circle circle = new Circle(radius);
        double result = circle.calculateArea();
        checkResults(circle.calculateArea() == expectedResult, "Circle Area test : ");
    }

    public void trianglePerimetrTest() {
     Triangle triangle = new Triangle(5 ,5 ,5);
     double expectedResult = 15.0;
     checkResults(triangle.calculaatePerimetr()==expectedResult , "Triangle Perimetr test :");
    }

    public void triangleAreaTest(){
        Triangle triangle = new Triangle(5 ,5 ,5 );
        double expectedResult = 12.5;
        checkResults(triangle.calculateArea()==expectedResult , "Triange Area test : ");
    }

    public void squarePerimetrTest(){
        Square square = new Square(5);
        double expectedresult = 20;
        checkResults(square.calculaatePerimetr()==expectedresult , "Square Perimetr test : ");
    }

    public void squareAreatest(){
        Square square = new Square(5);
        double expectedResult = 25;
        checkResults(square.calculateArea()==expectedResult , "Square Area test : ");
    }

    public void rectanglePerimetrTest() {
        Rectangle rectangle = new Rectangle(5, 2);
        double expectedResult = 14;
        checkResults(rectangle.calculaatePerimetr() == expectedResult , "Rectangle Perimetr test :");
    }

    public void rectangleAreaTest() {
        Rectangle rectangle = new Rectangle(5, 2);
        double expectedResult = 10;
        checkResults(rectangle.calculateArea() == expectedResult , "Rectangle Area test : ");
    }


    public void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
        }
    }
}
