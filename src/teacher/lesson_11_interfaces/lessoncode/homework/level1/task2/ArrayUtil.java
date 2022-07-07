package teacher.lesson_11_interfaces.lessoncode.homework.level1.task2;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public interface ArrayUtil {

    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);
}
