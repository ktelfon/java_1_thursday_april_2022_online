package student_olegs_liliks.homework.lesson_3.level_5.task_19;

public class Dog {
    private String name;
    private int age;

    Dog(String dogName, int dogAge) {
        this.name=dogName;
        this.age=dogAge;
    }
    void voice(){
        System.out.println("Dog name is "+ this.name + " he is " +this.age + " years old");
    }
}
