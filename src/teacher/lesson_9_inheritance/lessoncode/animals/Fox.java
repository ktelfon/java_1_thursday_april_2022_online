package teacher.lesson_9_inheritance.lessoncode.animals;

public class Fox extends Animal {
    public Fox(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void voice() {
        System.out.println("Fir Fir");
    }
}
