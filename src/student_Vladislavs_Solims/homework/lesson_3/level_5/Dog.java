package student_Vladislavs_Solims.homework.lesson_3.level_5;

import teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Dog {
    Scanner scanner = new Scanner(System.in);
    private String dogName;
    private int age;
    private String color;


    void addDog(String dogName, String color, int age) {

        this.dogName = dogName;
        this.color = color;
        this.age = age;
    }

    String getDogName() {
        return this.dogName;
    }

    String getColor() {
        return color;
    }

    void changeColor(String newColor) {
        this.color = color;
    }

    int getAge() {

        return this.age;
    }

    void setAge(int age) {
        this.age = age;
    }

    int happyBirthday() {
        this.age = age + 1;
        return this.age;
    }

    void voice() {
        System.out.println(dogName + color + age);
    }

}
