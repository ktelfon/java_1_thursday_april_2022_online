package student_olegs_liliks.homework.lesson_3.level_5.task_21;

public class Dog {
    private String name;
    private int age;
    private String color;

    Dog(String dogName, int dogAge, String dogColor) {
        this.name=dogName;
        this.age=dogAge;
        this.color=dogColor;
    }
    void voice(){
        System.out.println("Dog name is "+ this.name + " his color is  " +this.color + " and he is " + this.age + " years old");
    }

}
