package student_Vladislavs_Solims.class_exersizes.lesson_3;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHunger() {
        return hunger;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise() {
        System.out.println(name + ":Meaw");

    }

    public int make0lder(int ageToAdd) {
        this.age += ageToAdd;
        return this.age;

    }

}
