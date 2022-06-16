package teacher.lesson_9_inheritance.lessoncode.animals;

public class Cow extends Animal {
    public Cow(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void voice() {
        System.out.println("Moo Moo");
    }
}
