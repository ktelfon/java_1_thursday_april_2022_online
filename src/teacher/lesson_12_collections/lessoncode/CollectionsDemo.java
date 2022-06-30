package teacher.lesson_12_collections.lessoncode;

import teacher.lesson_9_inheritance.lessoncode.homework.task31.User;
import teacher.lesson_9_inheritance.lessoncode.shape.Circle;
import teacher.lesson_9_inheritance.lessoncode.shape.Rectangle;
import teacher.lesson_9_inheritance.lessoncode.shape.Shape;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        List<String> textList = new ArrayList<>();

        textList.add("A");
        textList.add("B");
        textList.add("C");

        textList.add("BB");

        System.out.println(textList);
        printList(textList);

        for (int i = 0; i < textList.size(); i++) {
            System.out.println(textList.get(i));
        }

        if (textList.contains("BB")) {
            System.out.println("BB is here");
        }

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle("Red", 1, 1));
        shapes.add(new Circle("Red", 1));


        List<String> things = new LinkedList<>();
        things.add("Computer");
        things.add("Coffee");
        for (String thing : things) {
            System.out.println(thing);
        }

        Map<String, Integer> tableOfContents = new HashMap<>();
        tableOfContents.put("Introduction", 3);
        tableOfContents.put("Chapter 1", 15);
        tableOfContents.put("Chapter 2", 48);
        System.out.println(tableOfContents);

        System.out.println(tableOfContents.get("Chapter 1"));

        tableOfContents.put("Introduction", 35);

        Map<User, Double> userLog = new HashMap<>();

        userLog.put(new User("D", "F", "k", "L"), 100d);
        System.out.println(userLog);
        userLog.put(new User("D", "F", "k", "L"), 10d);
        System.out.println(userLog);

        Set<Map.Entry<User, Double>> entries = userLog.entrySet();
        for (Map.Entry<User, Double> entry : entries) {
            System.out.println(entry.getKey());
        }

        userLog.keySet();
        userLog.values();

        Set<String> cities = new HashSet<>();
        cities.add("Riga");
        cities.add("Ogre");
        cities.add("Riga");

        System.out.println("cities = " + cities);

    }

    private static void printList(List<String> textList) {
        for (String s : textList) {
            System.out.println(s);
        }
    }
}
