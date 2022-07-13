package student_igor_peresunko.classwork.Generics;

import student_igor_peresunko.classwork.Exeptions.User;

public class GenericDemo {
    public static void main(String[] args) {
        Box<String> textBox = new Box<>("Hello");
        System.out.println(textBox.getItem());

        Box<User> userBox;


    }
}
