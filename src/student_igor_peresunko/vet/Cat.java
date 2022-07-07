package student_igor_peresunko.vet;

import student_igor_peresunko.classwork.lesson_4.CatFood;



public class Cat extends Animal{


    private boolean hungry = true;

    public Cat(String name, int age) {
        super(name, age);
    }

    public boolean isHungry() {
        return hungry;
    }

    public void makeNoise() {
        System.out.println(name + ":Meow!");
    }


    public void feed(CatFood food) {
        if (CatFood.CHICKEN.equals(food) || CatFood.TUNA.equals(food)) {
            hungry = false;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hungry=" + hungry +
                ", id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
