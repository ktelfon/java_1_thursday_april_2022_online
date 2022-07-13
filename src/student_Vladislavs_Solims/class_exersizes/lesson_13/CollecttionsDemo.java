package student_Vladislavs_Solims.class_exersizes.lesson_13;

import student_Vladislavs_Solims.homework.lesson_9.level_4_and_5.Shape;
import student_Vladislavs_Solims.homework.lesson_9.level_4_and_5.ShapeUtilDemo;

import java.util.ArrayList;
import java.util.List;

public class CollecttionsDemo {


    public static void main(String[] args) {
        List<String> textList = new ArrayList<>();

        textList.add("a");
        textList.add("b");
        textList.add("c");

        textList.add(2 , "BB");

        extracted(textList);

        extracted(textList);
        for (int i = 0; i < textList.size(); i++) {
            System.out.println(textList.get(i));;
        }
    }

    private static void extracted(List<String> textList) {
        for (String s : textList) {
            System.out.println(s);
        }

        if(textList.contains("BB")) {
            System.out.println("BB is here");
        }

        List<Shape> shapes = new ArrayList<>();

    }
}
