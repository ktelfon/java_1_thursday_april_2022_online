package student_toomas_park.lesson_7.homework.level_6;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.testArrayCopy();
    }

    public void testArrayCopy() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10};
        int[] expectedResult = {4, 5, 6, 7, 8};
        int numberFrom = 4;
        int numberTo = 8;
        System.out.println(Arrays.toString(arrayCopy.copyInRange(array, numberFrom, numberTo)));
        checkResult(Arrays.equals(expectedResult, arrayCopy.copyInRange(array, numberFrom, numberTo)), " Simple test copy in range");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " Working ");
        } else {
            System.out.println(testName + " Fail ");
        }
    }
}
