package teacher.vet.animals;

public abstract class Animal {

    private static int counter = 0;

    protected int id;
    protected int age;
    protected String name;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++counter;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return id == animal.id && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return id;
    }
}
