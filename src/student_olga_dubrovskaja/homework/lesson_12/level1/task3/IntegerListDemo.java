package student_olga_dubrovskaja.homework.lesson_12.level1.task3;

import java.util.ArrayList;
import java.util.List;

/* - добавить в список элемент (в начало и в конец)
- узнать длину списка
- удалить элемент из списка (по индексу и без)
- узнать пустой список или нет
- обойти список и вывести на консоль каждый элемент.
 */
class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(0, 10);
        numbers.add(30);
        numbers.add(numbers.size() - 1, 40);
        numbers.remove(1);
        numbers.remove(Integer.valueOf(40));
        numbers.isEmpty();

        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
