package teacher.lesson_15_streams.lessoncode.homework.level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FruitStorage {

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> findAllGreenApples(List<Apple> apples) {
        return apples.stream()
                .filter(apple -> "green".equals(apple.getColor()))
                .toList();
    }

    public List<Apple> findAllApplesByColor(List<Apple> apples, String color) {
        return apples.stream()
                .filter(apple -> color.equals(apple.getColor()))
                .toList();
    }

    public List<Apple> findAllApplesByWeight(List<Apple> apples, int weight) {
        return apples.stream()
                .filter(apple -> weight < apple.getWeight())
                .toList();
    }

    public List<Apple> sortedByWeight(List<Apple> apples) {
        return apples.stream()
                .sorted(Comparator.comparing(Apple::getWeight).reversed())
                .toList();
    }

    public static void main(String[] args) {
        FruitStorage fruitStorage = new FruitStorage();
        System.out.println(fruitStorage.findAllGreenApples(fruitStorage.getAllApples()));
        System.out.println(fruitStorage.findAllApplesByColor(fruitStorage.getAllApples(), "red"));
        System.out.println(fruitStorage.sortedByWeight(fruitStorage.getAllApples()));
    }
}