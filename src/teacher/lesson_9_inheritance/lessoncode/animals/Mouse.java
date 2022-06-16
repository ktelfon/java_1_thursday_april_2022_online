package teacher.lesson_9_inheritance.lessoncode.animals;

public class Mouse extends Animal {
    public Mouse(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void voice() {
        System.out.println("Squeek Squueek");
    }
}
