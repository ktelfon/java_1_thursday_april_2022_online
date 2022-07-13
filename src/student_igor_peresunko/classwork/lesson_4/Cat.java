package student_igor_peresunko.classwork.lesson_4;

import student_igor_peresunko.vet.Animal;
;


public class Cat extends Animal {

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


    public int makeOlder(int i) {
        return 0;
    }
}



