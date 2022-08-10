package student_olegs_liliks.homework.lessona_12.level1;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(0, 4);
        numbers.add(5);
        numbers.add(numbers.size() - 1, 8);
        numbers.remove(1);
        numbers.remove(Integer.valueOf(8));
        numbers.isEmpty();
        for (int print : numbers) {
            System.out.println(print);
        }
    }
}
