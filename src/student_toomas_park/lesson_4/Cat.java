package student_toomas_park.lesson_4;

public class Cat {

    private String name;
    private int age;
    private boolean hungry = true;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void feed(String food){
        if("Chicken".equals(food)){
            hungry = false;
        }
    }

}
