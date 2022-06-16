package teacher.vet.animals;

import teacher.lesson_4_if_statement.lessoncode.CatFood;

public class Cat {

    private static int catCounter = 0;

    private int id;
    private String name;
    private int age;
    private boolean hungry = true;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++catCounter;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public int getAge() {
        return age;
    }

    public void makeNoise() {
        System.out.println(name + ":Meow!");
    }

    public int makeOlder(int ageToAdd) {
        this.age += ageToAdd;
        return this.age;
    }

    public void feed(CatFood food) {
        if (CatFood.CHICKEN.equals(food) || CatFood.TUNA.equals(food)) {
            hungry = false;
        }

//        switch (food){
//            case TUNA, CHICKEN, BIRDS -> hungry = false;
//        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return id == cat.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Cat " +
                "id=" + id +
                ",name='" + name + '\'' +
                ", age=" + age +
                ", hungry=" + hungry;
    }
}