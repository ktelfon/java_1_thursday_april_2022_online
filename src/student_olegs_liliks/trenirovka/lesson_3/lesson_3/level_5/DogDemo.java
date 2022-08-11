package student_olegs_liliks.trenirovka.lesson_3.lesson_3.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik",5,"Brown");
        dog.sayDog();
        dog.happyBirthday();
        dog.changeColor("Black");
        dog.sayDog();
    }
}
