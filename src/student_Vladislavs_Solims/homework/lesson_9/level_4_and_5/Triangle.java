package student_Vladislavs_Solims.homework.lesson_9.level_4_and_5;

class Triangle extends Shape {

    double side1;
    double side2;

    double side3;



    Triangle(double side1 , double side2 , double side3) {
        super("Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }
    @Override
    double calculateArea() {
        return 0.5 * (side1 * side2);
    }

    @Override
    double calculaatePerimetr() {
        return side1 + side2 + side3;
    }
}
