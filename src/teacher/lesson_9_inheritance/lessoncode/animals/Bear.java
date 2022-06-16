package teacher.lesson_9_inheritance.lessoncode.animals;

public class Bear extends Animal {

    public Bear(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void voice() {
        System.out.println("RoAr");
    }
}
