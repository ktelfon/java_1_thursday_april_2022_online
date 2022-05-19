package student_olegs_liliks;

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

    public void setAge(int age) {
        this.age = age;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean isHunger() {
        return hunger;
    }

    public int getAge() {
        return age;
    }

    public void makeNoise() {
        System.out.println(name + ":Meow!");
    }

    public int makeOlder(int ageToAdd) {
        this.age = this.age + ageToAdd;
        return this.age;
    }

}


