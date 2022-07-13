package student_Vladislavs_Solims.class_exersizes.lesson_13.generics;

import student_Vladislavs_Solims.class_exersizes.lesson_13.task.User;

public class GenericDemo {

    public static void main(String[] args) {

        Box<String> textBox = new Box<>("Hello");
        System.out.println(textBox.getItem());





    }
}
