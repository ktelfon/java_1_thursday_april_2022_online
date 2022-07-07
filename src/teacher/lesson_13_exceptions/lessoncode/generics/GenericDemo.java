package teacher.lesson_13_exceptions.lessoncode.generics;

import teacher.vet.animals.Cat;

public class GenericDemo {
    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>(new Cat("a", 1));
    }
}
