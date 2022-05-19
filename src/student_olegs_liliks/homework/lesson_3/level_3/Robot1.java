package student_olegs_liliks.homework.lesson_3.level_3;

public class Robot1 {
    String name;

    public Robot1(String robotName) {
        this.name = robotName;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public void sayYourName(){
        System.out.println("My name is " +this.name);

    }
}

