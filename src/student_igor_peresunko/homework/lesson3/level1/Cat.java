package student_igor_peresunko.homework.lesson3.level1;

public class Cat {

    private String name;
    private int age;
    private boolean hunger;


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;


    }


    public Cat(String name, int age, boolean hunger) {
        this.name = name;
        this.age = age;
        this.hunger = hunger;

    }

    public boolean isHunger() {
        return hunger;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void makeNoise() {
        System.out.println(name + ":Meow");


    }

    public int makeOlder(int ageToAdd) {
        ;
        this.age += ageToAdd;
        return this.age;

    }


}
