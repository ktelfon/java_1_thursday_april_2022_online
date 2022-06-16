package teacher.lesson_9_inheritance.lessoncode;

import teacher.lesson_9_inheritance.lessoncode.animals.*;

public class AnimalsDemo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Bear("Gammi", 23, 12.0),
                new Cow("Mumushka", 2, 23.0),
                new Fox("Felix", 3, 6.0),
                new Mouse("Jerry", 4, 3.0)
        };

        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
