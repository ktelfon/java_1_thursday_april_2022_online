package student_toomas_park.lesson_7.homework.level_6;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayCopy {
    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] copyInRange = new int[countNumberOfElements(in, numberFrom, numberTo)];
        for (int i : in) {
            if (i >= numberFrom && i <= numberTo) {
                for (int j = 0; j < copyInRange.length; j++) {
                    if (copyInRange[j] == 0) {
                        copyInRange[j] = i;
                        break;
                    }
                }
            }
        }
        return copyInRange;
    }
    int countNumberOfElements(int[] in, int numberFrom, int numberTo) {
        int counter = 0;
        for (int i : in) {
            if (i >= numberFrom && i <= numberTo) {
                counter++;
            }
        }
        return counter;
    }
}
