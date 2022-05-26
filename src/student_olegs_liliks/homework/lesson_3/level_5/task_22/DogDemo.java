package student_olegs_liliks.homework.lesson_3.level_5.task_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sharik",10, "Black");
        dog1.voice();
        dog1.changeColor("Brown");
        dog1.voice();

    }
}
