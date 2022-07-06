package student_Vladislavs_Solims.homework.lesson_9.level_4_and_5;

class Square extends Shape{

    double side;

    Square(double side) {
        super("Square");
        this.side = side;

    }
    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculaatePerimetr() {
        return side * 4;
    }
}
