package student_Vladislavs_Solims.homework.lesson_9.level_4_and_5;

class Circle extends Shape {
  private  double radius;

  Circle(double radius){
      super("Circle");
      this.radius = radius;
  }

    @Override
    double calculaatePerimetr() {
        return Math.round(2 * Math.PI * radius ) ;

    }

    double calculateArea() {
        return Math.round(Math.PI * (radius * radius) ) ;
    }

}
