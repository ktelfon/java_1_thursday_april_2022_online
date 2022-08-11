package student_Vladislavs_Solims.homework.lesson_15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Apple> findApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findApplesByWeight(List<Apple> inventory , int weight) {
        List<Apple> resultSmall = new ArrayList<>();
        List<Apple> resultHeavy = new ArrayList<>();
        for(Apple apple : inventory) {
            if(apple.getWeight()<150) {
                resultSmall.add(apple);
            return resultSmall;
            }else{
                resultHeavy.add(apple);
            }
        }
        return resultHeavy;

    }

}
