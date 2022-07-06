package student_Vladislavs_Solims.homework.lesson_9.level_4_and_5;

class Rectangle extends Shape {

    double side1;
    double side2;

    Rectangle(double side1 , double side2){
        super("Rectangle");
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double calculateArea() {
        return side1 * side2;
    }

    @Override
    double calculaatePerimetr() {
        return (side1 * 2) + (side2 *2);
    }
}
