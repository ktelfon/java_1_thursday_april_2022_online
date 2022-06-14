package student_olga_dubrovskaja.homework.lesson_7.level_6.task_12;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.testArrayInRange();
        test.testArrayOneMatch();
        test.testArrayNoMatch();

    }

    public void testArrayInRange() {
        ArrayCopy arr = new ArrayCopy();
        int[] array = {1, 11, 24, 5, 38, 40, 67, 0, 5, 6, 7};
        int[] expectedResult = {1, 5, 5, 6, 7};
        System.out.println(Arrays.toString(arr.copyInRange(array, 1, 10)));
        checkResult(Arrays.equals(expectedResult, arr.copyInRange(array, 1, 10)), " Simple test copy in range");
    }


    public void testArrayOneMatch() {
        ArrayCopy arr = new ArrayCopy();
        int[] array = {1, 11, 24, 5, 38, 40, 67, 0, 5, 6, 7};
        int[] expectedResult = {38};
        System.out.println(Arrays.toString(arr.copyInRange(array, 37, 38)));
        checkResult(Arrays.equals(expectedResult, arr.copyInRange(array, 37, 38)), " Test copy in range one match");
    }

    public void testArrayNoMatch() {
        ArrayCopy arr = new ArrayCopy();
        int[] array = {1, 11, 24, 5, 38, 40, 67, 0, 5, 6, 7};
        int[] expectedResult = {};
        System.out.println(Arrays.toString(arr.copyInRange(array, -7, -1)));
        checkResult(Arrays.equals(expectedResult, arr.copyInRange(array, -7, -1)), " Test copy in range no match");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}
