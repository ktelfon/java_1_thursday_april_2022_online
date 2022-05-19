package student_artemijs_talamajevs.lesson_3.level_7;

import student_artemijs_talamajevs.lesson_3.level_7.Animal;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal monkey=new Animal("Fredy","black",50);
        System.out.println("Monkey name is "+monkey.name);
        System.out.println("Fredy colour is "+monkey.colour);
        System.out.println("Fredy weight is " + monkey.weight+ "kg");

        Animal bird=new Animal("Rozela","pink",10);
        System.out.println("Bird name is "+ bird.name);
        System.out.println("Rozela colour is " +bird.colour);
        System.out.println("Rozela weight is "+ bird.weight + "kg");

    }
}
