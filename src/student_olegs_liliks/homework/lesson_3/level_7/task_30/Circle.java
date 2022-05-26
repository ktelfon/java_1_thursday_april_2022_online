package student_olegs_liliks.homework.lesson_3.level_7.task_30;

 class Circle {
     private double radius;
     Circle(){
         this.radius=3.5;

     }
     double calculateArea(){
         double area = Math.PI*this.radius*this.radius;
         return area;
     }
     void circleArea(){
         System.out.println("Circle are is " + calculateArea());
     }



}
