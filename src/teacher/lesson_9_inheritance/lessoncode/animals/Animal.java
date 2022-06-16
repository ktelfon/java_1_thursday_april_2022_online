package teacher.lesson_9_inheritance.lessoncode.animals;

public abstract class Animal implements Voiceable {

    protected String name;
    protected int age;
    protected double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
