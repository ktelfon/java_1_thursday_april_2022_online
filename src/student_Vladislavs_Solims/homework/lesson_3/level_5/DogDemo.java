package student_Vladislavs_Solims.homework.lesson_3.level_5;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Dog dog = new Dog();
        System.out.println("Write the dog name and age :");
        dog.addDog("Valet", "Black", 8);
        System.out.println(dog.getDogName());
        dog.changeColor("Red");
        dog.happyBirthday();
        dog.voice();

    }
}
