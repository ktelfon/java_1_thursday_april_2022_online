package student_olegs_liliks.trenirovka.lesson_3.lesson_3.level_7;

public class Circle {
    String circle;
    double radius;

    Circle(double radius){
        this.radius = radius;

    }
    double calculateArea(){
       double area = this.radius*this.radius*Math.PI;
        return area;
    }
        public void square (){

        System.out.println(calculateArea());
    }


}
