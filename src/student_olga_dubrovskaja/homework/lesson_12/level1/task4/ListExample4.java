package student_olga_dubrovskaja.homework.lesson_12.level1.task4;

import java.util.ArrayList;
import java.util.List;

/* Могут ли реализации интерфейса java.util.List хранить одинаковые
элементы (дубликаты)? Напишите код программы, который демонстрирует
ответ на этот вопрос.
 */

// ответ: могут
class ListExample4 {
    public static void main(String[] args) {
        List<String> sameElements = new ArrayList<>();
        String word = "same";
        int n = 10;

        for (int i = 0; i < n; i++) {
            sameElements.add(word);
        }
        System.out.println(sameElements);
    }
}
