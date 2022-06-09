package teacher.lesson_7_encapsulation.lessoncode;

import java.util.Objects;

public class Dog {

    private String name;
    private int height;
    private int weight;
    private int age;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return Objects.equals(name, dog.name);
    }

    @Override
    public String toString() {
        return "Name:" + this.name  + "";
    }
}
