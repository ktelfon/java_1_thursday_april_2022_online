package teacher.lesson_13_exceptions.lessoncode.generics;

import teacher.vet.animals.Animal;

public class Box<T extends Animal> {

    private T item;
    private String label;

    public Box(T item) {
        this.item = item;
    }

    public boolean isBoxFull() {
        return item != null;
    }

    public T getItem() {
        return item;
    }
}
