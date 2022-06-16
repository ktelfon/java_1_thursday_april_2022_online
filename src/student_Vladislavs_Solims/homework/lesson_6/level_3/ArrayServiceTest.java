package student_Vladislavs_Solims.homework.lesson_6.level_3;

import java.util.Arrays;
import java.util.Objects;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.containsTest();
        arrayServiceTest.howMuchContainsTest();
        arrayServiceTest.replaceFirstNumberTest();
        arrayServiceTest.replaseAnyNumber();
        arrayServiceTest.shouldRevertArray();
arrayServiceTest.replaceNothing();
arrayServiceTest.shouldSort();
    }

    void containsTest() {
        int[] arr = {10, 20, 10, 30, 50};
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        if (expectedResult == arrayService.contains(arr, 10)) {
            System.out.println(" contains test OK");
        } else {
            System.out.println("False");
        }
    }

    void howMuchContainsTest() {
        int[] arr = {10, 20, 30, 10, 10, 50};
        int expectedResult = 3;
        ArrayService arrayService = new ArrayService();
        if (expectedResult == arrayService.howMuchContains(arr, 10)) {
            System.out.println("HowMuchContainsTest OK");
        } else {
            System.out.println("False");
        }
    }

    void replaceFirstNumberTest() {
        int[] arr = {10, 20, 30, 40, 50};
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        if (expectedResult == arrayService.replaceFirstNumber(arr, 10, 15)) {
            System.out.println("replaceFirstNumberTest OK");
        } else {
            System.out.println("FALSE");
        }
    }

    void replaseAnyNumber() {
        int[] arr = {10, 20, 30, 40, 50};
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        if (expectedResult == arrayService.replaceAnyNumber(arr, 30, 35)) {
            System.out.println("replaseAnyNumber Test OK");
        } else {
            System.out.println("FALSE");
        }
    }

    void replaceNothing() {
        ArrayService arrayService = new ArrayService();
        int[] testArray = {10, 20, 30, 40, 50};
        int numberToReplace = 15;
        int newNumber = 25;
        int[] expectedResult = {10,20,30,40,50};
        arrayService.replaceAnyNumber(testArray,numberToReplace,newNumber);
        checkTestResult(Arrays.equals(testArray,expectedResult),"Do nothing test");
    }

    public void shouldRevertArray() {
        int[] testArray = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 4, 3, 2, 1};
        ArrayService arrayService = new ArrayService();
        arrayService.revertArray(testArray);
        checkTestResult(Arrays.equals(testArray, expectedResult), "Test revert array - ");
    }
    public void shouldSort(){
        ArrayService arrayService = new ArrayService();
        int[] testArray = {5, 4, 3, 2, 1};
        int[] expectedResult = {1, 2, 3, 4, 5};
        arrayService.sortArray(testArray);
        checkTestResult(Arrays.equals(testArray,expectedResult),"Should sort Test");

    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + "OK");
        } else {
            System.out.println(testName + "FAIL");
        }
    }
}
