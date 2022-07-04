package student_olga_dubrovskaja.homework.lesson_12.level1.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListExamples {
    public static void main(String[] args) {
        List<String> arrayListExample = new ArrayList<>();
        List<String> linkedListExample = new LinkedList<>();

    }
}

/* - внутри ArrayList элементы хранятся в массиве, размер которого изменяется динамически. Если размер
     массива не достаточен, то создается новый массив большего размера, а старый удаляется. ArrayList более
     эффективен для хранения и извлечения данных. Манипуляции с элементами ArrayList медленнее (относительно
     LinkedList), потому что при удалении элемента, остальные элементы массива сдвигаются в памяти.

   - внутри LinkedList элементы хранятся в двусвязном списке. Добавление элементов в LinkedList быстрое,
     но извлечение данных занимает больше времени.

 */
